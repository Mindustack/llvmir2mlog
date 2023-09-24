package org.mindustack.llvmir2mlog.compiler.middleend.llvmir;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.constant.*;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRModule;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.*;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.*;
import org.mindustack.llvmir2mlog.compiler.middleend.rewrite.Rewriter;
import org.mindustack.llvmir2mlog.compiler.share.error.InternalError;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.debug.Log;
import org.mindustack.llvmir2mlog.parser.LLVMIR.LLVMIRBaseVisitor;
import org.mindustack.llvmir2mlog.parser.LLVMIR.LLVMIRLexer;
import org.mindustack.llvmir2mlog.parser.LLVMIR.LLVMIRParser;

import java.io.IOException;
import java.util.*;

public class IRBuilder extends LLVMIRBaseVisitor<Value> {

    static String destName;
    static IRBlock CurrentBlock;
    static int counter = 0;
    private final LinkedHashMap<IRBlock, LLVMIRParser.BasicBlockContext> blockCtx = new LinkedHashMap<>();
    public LinkedHashMap<String, Value> valueMap = new LinkedHashMap<>();
    public IRModule irModule = new IRModule();
    public LinkedHashMap<Value, RowMark> rowMarker = new LinkedHashMap<>();
    LinkedHashMap<String, Value> globalValueMap = new LinkedHashMap<>();
    ArrayList<IRFunction> SolveFunctions = new ArrayList<IRFunction>();
    Value TypePasser = new Value("TypePasser", null);
    IRFunction CurrentFunction;

    public IRBuilder(CharStream charStream) throws IOException {


        run(charStream);
        // lexer

    }

    public void run(CharStream charStream) {
        LLVMIRLexer irLexer = new LLVMIRLexer(charStream);
        irLexer.removeErrorListeners();
        // irLexer.addErrorListener(new ParseErrorListener());

        // parser
        LLVMIRParser irParser = new LLVMIRParser(new CommonTokenStream(irLexer));
        irParser.removeErrorListeners();
        //  irParser.addErrorListener(new ParseErrorListener());

        // irModule.setBottomFunctions();
        // no need!
        visit(irParser.compilationUnit());

        // clear onlyName

        Log.info("Build Module finish from .ll file.");
    }

    public IRBuilder() {
    }
//    IRPhiInst SelectInstToSolve = null;

    private void deepToInst(IRFunction function) {
        CurrentFunction = function;
        HashSet<IRBlock> visited = new HashSet<>();


//        valueMap = new LinkedHashMap<String, Value>();
        RawOnlyName.workList = new ArrayList<>();
        valueMap = function.valueMap;


//


        LinkedList<IRBlock> blocks = function.blocks;
        for (int i = 0, blocksSize = blocks.size(); i < blocksSize; i++) {
            IRBlock block = blocks.get(i);
            deepToInst(block, visited);
        }
        function.entryBlock = function.blocks.get(0);
        solveRawOnlyName(valueMap);

    }

    //private void setNewValue(IRBaseType type, Value value) {//cover rename
//        value.type = type;
//        valueMap.put(value.name, value);
//    }


    // visitint
    private void deepToInst(IRBlock block, HashSet<IRBlock> visited) {


        // IRBlock block = (IRBlock) valueMap.get(CurrentFunction.name + getBasicBlockLabel(ctx).replaceAll(":", ""));

        if (visited.contains(block)) return;
        visited.add(block);
        var ctx = blockCtx.get(block);
        CurrentBlock = block;
        for (var instCtx : ctx.instruction()) {
            var visit = visit(instCtx);
            IRBaseInst inst = (IRBaseInst) visit;
            inst.setParentBlock(block);
            rowMarker.put(inst, new RowMark(instCtx.getStart().getLine(), instCtx.getText()));
        }
        IRBaseInst inst = (IRBaseInst) ctx.terminator().accept(this);
        inst.setParentBlock(block);
        rowMarker.put(inst, new RowMark(ctx.terminator().getStart().getLine(), ctx.terminator().getText()));


        if (block.terminator() instanceof IRBrInst) {
            if (((IRBrInst) block.terminator()).isJump()) {
                deepToInst(((IRBrInst) block.terminator()).destBlock(), visited);
            } else {
                deepToInst(((IRBrInst) block.terminator()).ifTrueBlock(), visited);
                deepToInst(((IRBrInst) block.terminator()).ifFalseBlock(), visited);
            }
        } else if (block.terminator() instanceof IRRetInst) {
            block.parentFunction.exitBlock = block;
        }
    }
//    private void deepToInst(IRBlock block, HashSet<IRBlock> visited) {
//
//
//        // IRBlock block = (IRBlock) valueMap.get(CurrentFunction.name + getBasicBlockLabel(ctx).replaceAll(":", ""));
//
//        if (visited.contains(block)) return;
//        visited.add(block);
//        var ctx = blockCtx.get(block);
//         CurrentBlock = block;
//        if (ctx != null) {
//
//
//            var size = ctx.instruction().size();
//            for (int i = 0; i < size; i++) {
//
//                var visit = visit(ctx.instruction(i));
//                IRBaseInst inst = (IRBaseInst) visit;
//                if (SelectInstToSolve != null) {
//                    var ifFalseBlock = (IRBlock) SelectInstToSolve.operands.get(3);
//                    var ifTrueBlock = (IRBlock) SelectInstToSolve.operands.get(1);
//
//                    var irBrInst = new IRBrInst((Value) SelectInstToSolve.temp,
//                            ifTrueBlock
//                            , ifFalseBlock, block);
//
//
//                    var blockleft = new IRBlock(block.name + "left", null);
//                    var basicBlockContext = new LLVMIRParser.BasicBlockContext(null, 0);
//
//
//                    inst.setParentBlock(blockleft);
//                    basicBlockContext.children = ctx.children.subList(i + 1, size + 1);
////            while (iterator.hasNext()){
////                instCtx = iterator.next();
////                basicBlockContext.addChild(instCtx);
////
//////            var visit = visit(instCtx);
//////            IRBaseInst inst = (IRBaseInst) visit;
//////            inst.setParentBlock(blockleft);
//////            rowMarker.put(inst, new RowMark(instCtx.getStart().getLine(), instCtx.getText()));
////            }
////            basicBlockContext.addChild(ctx.terminator());
////            ctx.children.subList()
//                    blockCtx.put(blockleft, basicBlockContext);
//
//                    ifTrueBlock.addInst(new IRBrInst(blockleft, ifTrueBlock));
//
//                    ifFalseBlock.addInst(new IRBrInst(blockleft, ifFalseBlock));
//
//                    CurrentFunction.blocks.addLast(ifTrueBlock);
//                    ifTrueBlock.parentFunction = CurrentFunction;
//                    CurrentFunction.blocks.addLast(ifFalseBlock);
//                    ifFalseBlock.parentFunction = CurrentFunction;
//                    CurrentFunction.blocks.addLast(blockleft);
//                    blockleft.parentFunction = CurrentFunction;
//
//
//                    SelectInstToSolve = null;
//                    break;
//                } else {
//
//
//                    inst.setParentBlock(block);
//                    rowMarker.put(inst, new RowMark(ctx.instruction(i).getStart().getLine(), ctx.instruction(i).getText()));
//                }
//
//
//            }
//
//
//            IRBaseInst inst = (IRBaseInst) ctx.terminator().accept(this);
//            inst.setParentBlock(block);
//            rowMarker.put(inst, new RowMark(ctx.terminator().getStart().getLine(), ctx.terminator().getText()));
//
//
//        }
//
//        if (block.terminator() instanceof IRBrInst) {
//            if (((IRBrInst) block.terminator()).isJump()) {
//                deepToInst(((IRBrInst) block.terminator()).destBlock(), visited);
//            } else {
//                deepToInst(((IRBrInst) block.terminator()).ifTrueBlock(), visited);
//                deepToInst(((IRBrInst) block.terminator()).ifFalseBlock(), visited);
//            }
//        } else if (block.terminator() instanceof IRRetInst) {
//            block.parentFunction.exitBlock = block;
//        }
//
//
//    }

    public void setBottomFunctions() {


//        builtinFunctions.add(new IRFunction(LLVM.BottomPrefix + "malloc",
//                IRTranslator.heapPointerType, IRTranslator.i32Type));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.StrCatArg,
//                IRTranslator.stringType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.EqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.NotEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.LessArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.LessEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.GreaterArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.GreaterEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
    }

    private void solveRawOnlyName(LinkedHashMap<String, Value> map) {
        for (RawOnlyName onlyName : RawOnlyName.workList) {
            var userList = new ArrayList<>(onlyName.users);
            for (User user : userList) {
                user.resetOperand(user.operands.indexOf(onlyName), map.get(onlyName.name));
            }
        }

        RawOnlyName.workList.clear();
    }

    //    public void solveReference(ListIterator<LLVMIRParser.TopLevelEntityContext> iterator){
//         if (iterator.hasNext()){
//            var context = iterator.next();
//
//            if (context.funcDecl() != null) {
//                var irFunction = (IRFunction) visit(context.funcDecl());
//                irFunction.entryBlock = new IRBlock(irFunction.name + '0', irFunction);
//                //funcDeclContexts.add(context.funcDecl());
//                // global map added in each visit
//                irModule.builtinFunctions.add(irFunction);
//
//            } else if (context.funcDef() != null) {
//
//                // funcDefContexts.add(context.funcDef());
//                IRFunction function = (IRFunction) visit(context.funcDef());
//                CurrentFunction = function;
//                function.parentModule = irModule;
//                irModule.functions.add(function);
//                SolveFunctions.add(function);
//            } else if (context.globalDef() != null) {
//
//                irModule.globalVarSeg.add((GlobalVariable) visit(context.globalDef()));
//
//
//            } else if (context.metadataDef() != null) {
//                //todo
//            } else if (context.typeDef() != null) {
//
//                context.typeDef().accept(this);
//            }
//        }
//    }
    @Override
    public Value visitCompilationUnit(LLVMIRParser.CompilationUnitContext ctx) {

        ///  var funcDeclContexts = new ArrayList<LLVMIRParser.FuncDeclContext>();
        //var funcDefContexts = new ArrayList<LLVMIRParser.FuncDefContext>();
        // var globalDefContexts = new ArrayList<LLVMIRParser.GlobalDefContext>();

        ListIterator<LLVMIRParser.TopLevelEntityContext> iterator;
        iterator = ctx.topLevelEntity().listIterator();
        while (iterator.hasNext()) {
            var context = iterator.next();

            if (context.funcDecl() != null) {
                var irFunction = (IRFunction) visitFuncDecl(context.funcDecl());
                irFunction.entryBlock = new IRBlock(irFunction.name + '0', irFunction);
                //funcDeclContexts.add(context.funcDecl());
                // global map added in each visit
                irModule.builtinFunctions.add(irFunction);

            } else if (context.funcDef() != null) {

                // funcDefContexts.add(context.funcDef());
                IRFunction function1 = (IRFunction) visit(context.funcDef());
                CurrentFunction = function1;
                function1.parentModule = irModule;
                irModule.functions.add(function1);
                SolveFunctions.add(function1);
            } else if (context.globalDef() != null) {

                irModule.globalVarSeg.add((GlobalVariable) visit(context.globalDef()));


            } else if (context.metadataDef() != null) {
                //todo
            } else if (context.typeDef() != null) {

                context.typeDef().accept(this);
            }
        }

        solveRawOnlyName(globalValueMap);

//        for (var classDecl : ctx.classDecl()) {
//            StructType classType = new StructType(classDecl.LocalReg().getText().substring(1 + LLVM.StructPrefix.length()));
//            irModule.classes.add(classType.structProto);
//            setNewValue(classType.structName, classType.structProto);
//        }
//        for (var classDecl : ctx.classDecl()) {
//            visit(classDecl);
//        }


        // start
        for (var function : SolveFunctions) {
            deepToInst(function);
        }


        return null;
    }

    @Override
    public Value visitTypeDef(LLVMIRParser.TypeDefContext ctx) {

        String TypeName = ctx.LocalIdent().getText().substring(1).replaceAll("\"", "");
        var type = visitType(ctx.type()).type;
        type.setName(TypeName);
        var value = new Value(TypeName, type);

        globalValueMap.put(TypeName, value);
        return value;


    }

    @Override
    public Value visitGlobalDef(LLVMIRParser.GlobalDefContext ctx) {
        String glbName = ctx.GlobalIdent().getText().substring(1).replaceAll("\"", "");


        GlobalVariable glbVar = new GlobalVariable(glbName, visitType(ctx.type()).type);

        if (ctx.constant() != null) {
            glbVar.initValue = visit(ctx.constant());

        } else {
            glbVar.initValue = new NumConst(0);
        }
        globalValueMap.put(glbName, glbVar);

        return glbVar;

    }

    @Override
    public Value visitFuncDecl(LLVMIRParser.FuncDeclContext ctx) {
        return visitFuncHeader(ctx.funcHeader());
    }

    @Override
    public Value visitFuncDef(LLVMIRParser.FuncDefContext ctx) {
        IRFunction function = (IRFunction) visitFuncHeader(ctx.funcHeader());
        CurrentFunction = function;
        for (var blockCtx : ctx.funcBody().basicBlock()) {
            IRBlock block = (IRBlock) visit(blockCtx);
            block.parentFunction = function;

            setNewValue(function, block.name, block);
            function.blocks.add(block);
        }
       function. entryBlock = function.blocks.getFirst();

       function. exitBlock = function.blocks.getLast();


        function.Source = ctx;
        return function;
    }

    @Override
    public Value visitFuncHeader(LLVMIRParser.FuncHeaderContext ctx) {
        String funcName = ctx.GlobalIdent().getText().substring(1).replaceAll("\"", ""); // emit @ and " "

        IRBaseType retType = visitType(ctx.type()).type;

        // use bottom function constructor
        // "method" is unnecessary to concern
        var function = new IRFunction(funcName, retType);

        List<LLVMIRParser.ParamContext> params = ctx.params().param();
        for (int i = 0; i < params.size(); ++i) {
            String name;
            if (params.get(i).LocalIdent() != null) {
                name = params.get(i).LocalIdent().getText().substring(1).replaceAll("\"", "");

            } else {
                name = "arg" + i;
            }

//
            IRBaseType argType = visitType(params.get(i).type()).type;

            ((IRFuncType) function.type).argTypes.add(argType);

            function.addArg(newValue(function, name, argType));
        }


        globalValueMap.put(funcName, function);
        //  setNewValue(funcName, function);
        return function;
    }

    @Override
    public Value visitBasicBlock(LLVMIRParser.BasicBlockContext ctx) {
        String label;

        IRBlock block = new IRBlock(CurrentFunction.name + getBasicBlockLabel(ctx).replaceAll(":", ""), null);


        blockCtx.put(block, ctx);
        return block;
    }

    String getBasicBlockLabel(LLVMIRParser.BasicBlockContext ctx) {
        if (ctx.LabelIdent() == null) {

            return "0:";
        } else {
            return ctx.LabelIdent().getText();
        }
    }

    @Override
    public Value visitTerminator(LLVMIRParser.TerminatorContext ctx) {


        return visitChildren(ctx);
    }


//    public Value visitClassDecl(LLVMIRParser.) {
//        StructType classType = (StructType) valueMap.get(ctx.LocalReg().getText().substring(1 + LLVM.StructPrefix.length())).type;
//
//        for (var memberTypeCtx : ctx.type()) {
//            classType.memberVarTypes.add(translateType(memberTypeCtx));
//        }
//
//        return classType.structProto;
//    }

    @Override
    public Value visitRetTerm(LLVMIRParser.RetTermContext ctx) {
        if (ctx.value() != null) {
            return new IRRetInst(visit(ctx.value()), null);
        }
//        System.out.println(ctx.concreteType());
//        System.out.println(ctx.value());
//        System.out.println(ctx.getText());
        return new IRRetInst(null);
    }

    @Override
    public Value visitBrTerm(LLVMIRParser.BrTermContext ctx) {

        return new IRBrInst((IRBlock) visit(ctx.label()), null);

    }

    @Override
    public Value visitCondBrTerm(LLVMIRParser.CondBrTermContext ctx) {
        return new IRBrInst(visit(ctx.value()), (IRBlock) visit(ctx.label(0)), (IRBlock) visit(ctx.label(1)), null);

    }
//region typeRelated
    // this part is instructions
    // CFG order!

    @Override
    public Value visitLabel(LLVMIRParser.LabelContext ctx) {
        String name = CurrentFunction.name + ctx.LocalIdent().getSymbol().getText().substring(1).replaceAll("\"", "").replaceAll(":", "");
        if (valueMap.get(name) != null) {
            return valueMap.get(name);
        }
        return null;
    }

    @Override
    public Value visitConstant(LLVMIRParser.ConstantContext ctx) {

        if (ctx.GlobalIdent() != null) {
            String name = ctx.GlobalIdent().getText().substring(1).replaceAll("\"", "");
//visitLocalDefInst()


            return getGlobalValue(name);


        }
        return visitChildren(ctx);


    }

    @Override
    public Value visitBoolConst(LLVMIRParser.BoolConstContext ctx) {
        return new BoolConst(Objects.equals(ctx.getText(), "true"));
    }

    @Override
    public Value visitIntConst(LLVMIRParser.IntConstContext ctx) {
        return new NumConst(Integer.parseInt(ctx.IntLit().getText()));

    }

    @Override
    public Value visitFloatConst(LLVMIRParser.FloatConstContext ctx) {
        return new NumConst(Float.floatToIntBits(Float.parseFloat(ctx.FloatLit().getText())));//todo
    }

    @Override
    public Value visitNullConst(LLVMIRParser.NullConstContext ctx) {
        return new NullptrConst();
    }

    @Override
    public Value visitStructConst(LLVMIRParser.StructConstContext ctx) {
        var structConst = new StructConst(TypePasser.type);
        for (var c : ctx.typeConst()) {
            var value = visit(c);
            if (value instanceof BaseConst) {
                structConst.constData.add((BaseConst) value);
            } else {
                var e = new NullptrConst();//todo it maybe a function name

                structConst.constData.add(e);
            }
        }//todo

        return structConst;
    }

    @Override
    public Value visitArrayConst(LLVMIRParser.ArrayConstContext ctx) {

        var arrayConst = new ArrayConst(TypePasser.type, ctx.typeConst().size());
        for (var c : ctx.typeConst()) {
            arrayConst.constData.add((BaseConst) visit(c));
        }

        return arrayConst;
    }

    @Override
    public Value visitZeroInitializerConst(LLVMIRParser.ZeroInitializerConstContext ctx) {
        return new NullptrConst();//todo will it ok?
    }

    @Override
    public Value visitConstantExpr(LLVMIRParser.ConstantExprContext ctx) {

        var inst = visitChildren(ctx);


        return setNewValue(destName, inst);
        //new Value(CurrentBlock.name + counter++, inst.type)


    }

    @Override
    public Value visitTypeConst(LLVMIRParser.TypeConstContext ctx) {

        ctx.firstClassType().accept(this);
        return visitConstant(ctx.constant());
    }

    @Override
    public Value visitTypeValue(LLVMIRParser.TypeValueContext ctx) {
//ctx.
        visitFirstClassType(ctx.firstClassType());
        return visit(ctx.value());
    }

    @Override
    public Value visitValue(LLVMIRParser.ValueContext ctx) {
        //  var type = ctx.firstClassType().concreteType();

        if (ctx.LocalIdent() != null) {
            String name = ctx.LocalIdent().getText().substring(1).replaceAll("\"", "");
            if (valueMap.get(name) == null) {
                return new RawOnlyName(name);
            }
            return valueMap.get(name);

        }
        return visitChildren(ctx);

    }

    @Override
    public Value visitType(LLVMIRParser.TypeContext ctx) {
        if (ctx.getText().equals("void")) {
            TypePasser.type = new VoidType();
            return TypePasser;
        }
        return visitChildren(ctx);


    }

    @Override
    public Value visitFirstClassType(LLVMIRParser.FirstClassTypeContext ctx) {


        return visitChildren(ctx);
    }

    @Override
    public Value visitConcreteType(LLVMIRParser.ConcreteTypeContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Value visitIntType(LLVMIRParser.IntTypeContext ctx) {
        TypePasser.type = new NumType();
        return TypePasser;
    }

    @Override
    public Value visitFloatType(LLVMIRParser.FloatTypeContext ctx) {
        TypePasser.type = new NumType();
        return TypePasser;
    }

    @Override
    public Value visitPointerType(LLVMIRParser.PointerTypeContext ctx) {
        if (ctx.opaquePointerType() != null) {
            TypePasser.type = new PointerType(new VoidType());//todo what is this
        } else {
            TypePasser.type = new PointerType(ctx.type().accept(this).type);

        }


        return TypePasser;
    }

    @Override
    public Value visitLabelType(LLVMIRParser.LabelTypeContext ctx) {
        TypePasser.type = new LabelType();
        return TypePasser;
    }

    @Override
    public Value visitArrayType(LLVMIRParser.ArrayTypeContext ctx) {
        ctx.type().accept(this);
        TypePasser.type = new ArrayType(TypePasser.type, Integer.parseInt(ctx.IntLit().getText()));
        return TypePasser;
    }

    @Override
    public Value visitStructType(LLVMIRParser.StructTypeContext ctx) {
        var structType = new StructType();
        for (var c : ctx.type()) {
            structType.memberVarTypes.add(c.accept(this).type);
        }

        TypePasser.type = structType;
        return TypePasser;

    }

    @Override
    public Value visitNamedType(LLVMIRParser.NamedTypeContext ctx) {

        TypePasser.type = getGlobalValue(ctx.LocalIdent().getText().substring(1).replaceAll("\"", "")).type;
        return TypePasser;
    }

    @Override
    public Value visitOpaquePointerType(LLVMIRParser.OpaquePointerTypeContext ctx) {
        // return super.visitOpaquePointerType(ctx);
        TypePasser.type = new PointerType(new VoidType());//todo how to do it
        return TypePasser;
    }

    //endregion
    @Override
    public Value visitGetElementPtrExpr(LLVMIRParser.GetElementPtrExprContext ctx) {


        List<LLVMIRParser.GepIndexContext> typeValueContexts = ctx.gepIndex();
        // LLVMIRParser.TypeValueContext typeValueContext0 = ctx.typeValue(0);
//        LLVMIRParser.TypeContext type = ;
        ArrayList<Value> indices = new ArrayList<>();

        List<LLVMIRParser.GepIndexContext> typeValue = typeValueContexts;
        for (int i = 0; i < typeValueContexts.size(); i++) {
            var offsetCtx = typeValueContexts.get(i);
            indices.add(offsetCtx.typeConst().accept(this));
        }
//visitTypeConst()

        IRGetElementPtrInst inst = new IRGetElementPtrInst(visitTypeConst(ctx.typeConst()), null, null, indices);

//        inst.addSourceInfo(ctx.getStart() + ctx.getText());
        inst.type = visitType(ctx.type()).type;
        inst.SourseType = inst.type;
        //inst.headPointer().type;

        // assert inst.type instanceof PointerType;

        //  inst.type = ((PointerType) inst.type).pointedType;
        for (int i = 1; i < inst.indicesNum(); ++i) {

            if (inst.type instanceof StructType) {
                inst.type = ((StructType) inst.type).memberVarTypes.get(((NumConst) indices.get(i)).getConstData());
            } else if (inst.type instanceof ArrayType) {
                inst.type = ((ArrayType) inst.type).elementType;
            } else if (inst.type instanceof PointerType) {
                inst.type = //(PointerType) inst.type;
                        ((PointerType) inst.type).pointedType;
            } else if (inst.type instanceof VoidType) {
                break;
//                inst.type = //(PointerType) inst.type;
//                        ((PointerType) inst.type).pointedType;
            } else {
                throw new InternalError("getelementptr in other types");

            }

        }

        // wrapped
        inst.type = new PointerType(inst.type);

        inst.setParentBlock(CurrentBlock);

        return inst;
    }

    @Override
    public Value visitLocalDefInst(LLVMIRParser.LocalDefInstContext ctx) {


        destName = ctx.LocalIdent().getText().substring(1).replaceAll("\"", "");

//        IRAllocaInst inst = new IRAllocaInst(
//                destName,
//                translateType(ctx.valueInstruction().allocaInst().type()),
//                null
//        );
        var value = visit(ctx.valueInstruction());

//        if (value instanceof IRBaseInst){
        newValue(destName, value.type);
        setNewValue(destName, value);
//        }else {
//             setNewValue(destName, value);
//
//        }

//        if (inst.type!=null){
//            setNewValue(inst.type,);
//        }

        return value;

    }

    private Value newValue(String name, IRBaseType type) {//new get
        if (valueMap.get(name) != null) return valueMap.get(name);
        Value ret = new Value(name, type);
        valueMap.put(name, ret);
        return ret;
    }

    @Override
    public Value visitValueInstruction(LLVMIRParser.ValueInstructionContext ctx) {


        return visitChildren(ctx);
//
    }

    @Override
    public Value visitStoreInst(LLVMIRParser.StoreInstContext ctx) {

        return new IRStoreInst(visit(ctx.typeValue(1)), visit(ctx.typeValue(0)), null);

    }

    //region BinaryOperation
    @Override
    public Value visitAddInst(LLVMIRParser.AddInstContext ctx) {
        // String destName = ctx.instDest().LocalReg().getText().substring(1).replaceAll("\"","");


        return visitBinary("add", ctx.typeValue(), ctx.value());


    }

    @Override
    public Value visitFAddInst(LLVMIRParser.FAddInstContext ctx) {
        return visitBinary("add", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitSubInst(LLVMIRParser.SubInstContext ctx) {

        return visitBinary("sub", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitFSubInst(LLVMIRParser.FSubInstContext ctx) {
        return visitBinary("sub", ctx.typeValue(), ctx.value());
    }
//     private void setNewValue(Value Old, Value New) {//cover rename
//        valueMap.remove(value.name);
//        value.name = name;
//        valueMap.put(name, value);
//    }

    @Override
    public Value visitMulInst(LLVMIRParser.MulInstContext ctx) {
        return visitBinary("mul", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitFMulInst(LLVMIRParser.FMulInstContext ctx) {
        return visitBinary("mul", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitUDivInst(LLVMIRParser.UDivInstContext ctx) {
        return visitBinary("div", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitSDivInst(LLVMIRParser.SDivInstContext ctx) {
        return visitBinary("div", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitFDivInst(LLVMIRParser.FDivInstContext ctx) {
        return visitBinary("div", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitURemInst(LLVMIRParser.URemInstContext ctx) {
        return visitBinary("mod", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitSRemInst(LLVMIRParser.SRemInstContext ctx) {
        return visitBinary("mod", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitFRemInst(LLVMIRParser.FRemInstContext ctx) {
        return visitBinary("mod", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitShlInst(LLVMIRParser.ShlInstContext ctx) {
        return visitBinary("shl", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitLShrInst(LLVMIRParser.LShrInstContext ctx) {
        return visitBinary("lshr", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitAndInst(LLVMIRParser.AndInstContext ctx) {
        return visitBinary("and", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitOrInst(LLVMIRParser.OrInstContext ctx) {
        return visitBinary("or", ctx.typeValue(), ctx.value());

    }

    @Override
    public Value visitXorInst(LLVMIRParser.XorInstContext ctx) {
        return visitBinary("xor", ctx.typeValue(), ctx.value());
    }

    //endregion
    @Override
    public Value visitExtractValueInst(LLVMIRParser.ExtractValueInstContext ctx) {

        var value = visit(ctx.typeValue());
        var type = TypePasser.type;
        List<TerminalNode> intLit = ctx.IntLit();

        for (int i = 0; i < intLit.size(); i++) {
            var index = Integer.parseInt(intLit.get(i).getText());

            if (type instanceof ArrayType) {
                type = ((ArrayType) type).elementType;
            }
            if (type instanceof StructType) {
                type = ((StructType) type).memberVarTypes.get(index);
            }
            value = newValue(value.name + '.' + index, type);
        }


        return value;


    }

    @Override
    public Value visitInsertValueInst(LLVMIRParser.InsertValueInstContext ctx) {


        var value = visit(ctx.typeValue(0));

        var type = TypePasser.type;
        List<TerminalNode> intLit = ctx.IntLit();

        for (int i = 0; i < intLit.size(); i++) {
            var index = Integer.parseInt(intLit.get(i).getText());

            if (type instanceof ArrayType) {
                type = ((ArrayType) type).elementType;
            }
            if (type instanceof StructType) {
                type = ((StructType) type).memberVarTypes.get(index);
            }
            value = newValue(value.name + '.' + index, type);
        }


        return new IRMoveInst(value, visit(ctx.typeValue(1)), null);
    }

    @Override
    public Value visitAllocaInst(LLVMIRParser.AllocaInstContext ctx) {

        return new IRAllocaInst(destName, visitType(ctx.type()).type, null);

    }

    @Override
    public Value visitLoadInst(LLVMIRParser.LoadInstContext ctx) {
        // String destName = ctx.typeValue().value().LocalIdent().getText().substring(1).replaceAll("\"","");

        IRLoadInst inst = new IRLoadInst(visit(ctx.typeValue()), null);

        // setNewValue(destName, inst);
        return inst;
    }


//
//
//

    @Override
    public Value visitGetElementPtrInst(LLVMIRParser.GetElementPtrInstContext ctx) {
        List<LLVMIRParser.TypeValueContext> typeValueContexts = ctx.typeValue();
        LLVMIRParser.TypeValueContext typeValueContext0 = ctx.typeValue(0);
        LLVMIRParser.TypeContext type = ctx.type();
        ArrayList<Value> indices = new ArrayList<>();

        List<LLVMIRParser.TypeValueContext> typeValue = typeValueContexts;
        for (int i = 1; i < typeValueContexts.size(); i++) {
            var offsetCtx = typeValueContexts.get(i);
            indices.add(offsetCtx.value().accept(this));
        }


        IRGetElementPtrInst inst = new IRGetElementPtrInst(visitTypeValue(typeValueContext0), null, null, indices);

//        inst.addSourceInfo(ctx.getStart() + ctx.getText());

        inst.type = visitType(type).type;
        inst.SourseType = inst.type;

        //inst.headPointer().type;

        // assert inst.type instanceof PointerType;

        //  inst.type = ((PointerType) inst.type).pointedType;
        for (int i = 1; i < inst.indicesNum(); ++i) {

            if (inst.type instanceof StructType) {
                inst.type = ((StructType) inst.type).memberVarTypes.get(((NumConst) indices.get(i)).getConstData());
            } else if (inst.type instanceof ArrayType) {
                inst.type = ((ArrayType) inst.type).elementType;
            } else if (inst.type instanceof PointerType) {
                inst.type = //(PointerType) inst.type;
                        ((PointerType) inst.type).pointedType;
            } else if (inst.type instanceof VoidType) {
                break;
//                inst.type = //(PointerType) inst.type;
//                        ((PointerType) inst.type).pointedType;
            } else {
                throw new InternalError("getelementptr in other types");

            }

        }

        // wrapped
        inst.type = new PointerType(inst.type);

        //  setNewValue(destName, inst);
        return inst;
    }

    @Override
    public Value visitTruncInst(LLVMIRParser.TruncInstContext ctx) {
        //String destName = ctx..LocalReg().getText().substring(1).replaceAll("\"","");

        IRCastInst inst = new IRCastInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);


        return inst;

    }

    @Override
    public Value visitZExtInst(LLVMIRParser.ZExtInstContext ctx) {
        //String destName = ctx.instDest().LocalReg().getText().substring(1).replaceAll("\"","");
//
        IRCastInst inst = new IRCastInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);


        return inst;
    }

    @Override
    public Value visitPtrToIntInst(LLVMIRParser.PtrToIntInstContext ctx) {


        IRCastInst inst = new IRCastInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);
//todo so it cant be printed correctly
        return inst;

        //  return new IRMoveInst(newValue(destName,visitType( ctx.type()).type),visitTypeValue(ctx.typeValue()),null);

    }

    @Override
    public Value visitBitCastInst(LLVMIRParser.BitCastInstContext ctx) {
//         String destName = ctx.instDest().LocalReg().getText().substring(1).replaceAll("\"","");


        IRBitCastInst inst = new IRBitCastInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);

        // setNewValue(destName, inst);
        return inst;
    }

    @Override
    public Value visitICmpInst(LLVMIRParser.ICmpInstContext ctx) {

        String op = ctx.iPred().getText();

        IRICmpInst inst = new IRICmpInst(op, visit(ctx.typeValue()), visit(ctx.value()), null);


        return inst;
    }

    @Override
    public Value visitPhiInst(LLVMIRParser.PhiInstContext ctx) {
        //  String destName = ctx.instDest().LocalReg().getText().substring(1).replaceAll("\"","");
        IRPhiInst inst = new IRPhiInst(visitType(ctx.type()).type, null);

        for (var phi : ctx.inc()) {
            inst.addBranch(visit(phi.value()), (IRBlock) visit(phi.LocalIdent()));
        }
        //visitSelectInst()
        //setNewValue(destName, inst);
        return inst;
    }

    @Override
    public Value visitSelectInst(LLVMIRParser.SelectInstContext ctx) {//todo

//        var inst = new IRPhiInst(branchData.type, null);
        var inst = new IRURWInst() {
            @Override
            public void rewrite(Rewriter rewriter, int index, IRBlock curBlock, IRFunction curFunc) {
                //todo
            }
        };

        inst.addData(visitTypeValue(ctx.typeValue(0)))
                .addData(visitTypeValue(ctx.typeValue(1)))
                .addData(visitTypeValue(ctx.typeValue(2)));


        return inst;
    }

    @Override
    public Value visitCallInst(LLVMIRParser.CallInstContext ctx) {
        ArrayList<Value> argsValue = new ArrayList<>();
//ctx.args().
        for (var arg : ctx.args().arg())
            argsValue.add(visit(arg));

        IRCallInst inst = new IRCallInst((IRFunction) visit(ctx.value()), null, argsValue);


        inst.type = visitType(ctx.type()).type;
        return inst;
    }

    @Override
    public Value visitArg(LLVMIRParser.ArgContext ctx) {

        return visit(ctx.value());

    }

    public Value visitBinary(String op, LLVMIRParser.TypeValueContext typeValueContext, LLVMIRParser.ValueContext valueContext) {


        IRBinaryInst inst = new IRBinaryInst(op,
//                translateType(ctx.type())
                new NumType(8), visit(typeValueContext), visit(valueContext), null);
        return inst;
    }

    private Value getGlobalValue(String name) {
        if (globalValueMap.get(name) == null) {
            return new RawOnlyName(name);
        }


        return globalValueMap.get(name);
    }

    private Value setNewValue(String name, Value value) {//cover rename
        if (valueMap.containsKey(name)) {
            valueMap.remove(value.name);
        }

        value.name = name;
        valueMap.put(name, value);
        return value;
    }

    private void setNewValue(IRFunction function, String name, Value value) {//cover rename
        value.name = name;
        function.valueMap.put(name, value);
    }

    private Value newValue(IRFunction function, String name, IRBaseType type) {//new get
        if (function.valueMap.get(name) != null) return valueMap.get(name);
        Value ret = new Value(name, type);
        function.valueMap.put(name, ret);
        return ret;
    }

//    @Override
//    public Value visitInc(LLVMIRParser.IncContext ctx) {
//        ctx.LocalIdent()
//        return super.visitInc(ctx);
//    }

    @Override
    public Value visitTerminal(TerminalNode node) {

        if (CurrentFunction != null && valueMap.get(CurrentFunction.name + node.getSymbol().getText().substring(1).replaceAll("\"", "").replaceAll(":", "")) != null) {
            return valueMap.get(CurrentFunction.name + node.getSymbol().getText().substring(1).replaceAll("\"", "").replaceAll(":", ""));
        } else if (valueMap.get(node.getSymbol().getText()) != null) {
            return valueMap.get(node.getSymbol().getText());
        } else if (getGlobalValue(node.getSymbol().getText()) != null) {
            return getGlobalValue(node.getSymbol().getText());
        }
        return super.visitTerminal(node);
    }

    // this is used to handle forward reference
    public static class RawOnlyName extends Value {
        public static ArrayList<RawOnlyName> workList = new ArrayList<>();

        public RawOnlyName(String name) {
            super(name, null);
            workList.add(this);
        }
    }


    // this is used to handle forward reference

}
