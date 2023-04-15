package Mindustack.compiler.middleend.llvmir;

import Mindustack.compiler.middleend.llvmir.constant.*;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;
import Mindustack.compiler.middleend.llvmir.inst.*;
import Mindustack.compiler.middleend.llvmir.type.*;
import Mindustack.compiler.share.error.InternalError;
import Mindustack.debug.Log;
import Mindustack.parser.LLVMIR.LLVMIRBaseVisitor;
import Mindustack.parser.LLVMIR.LLVMIRLexer;
import Mindustack.parser.LLVMIR.LLVMIRParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;

public class IRBuilder extends LLVMIRBaseVisitor<Value> {

    static String destName;
    private final LinkedHashMap<IRBlock, LLVMIRParser.BasicBlockContext> blockCtx = new LinkedHashMap<>();
    public LinkedHashMap<String, Value> valueMap = new LinkedHashMap<>();
    public IRModule irModule = new IRModule();
    public LinkedHashMap<Value, RowMark> rowMarker = new LinkedHashMap<>();
    LinkedHashMap<String, Value> globalValueMap = new LinkedHashMap<>();
    ArrayList<IRFunction> SolveFunctions = new ArrayList<IRFunction>();
    Value TypePasser = new Value("TypePasser", null);
    IRFunction CurrentFunction;

    public IRBuilder(CharStream charStream) throws IOException {


        // lexer
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

        RawOnlyName.workList.clear();

        Log.info("Build Module finish from .ll file.");
    }

    private void deepToInst(IRFunction function) {
        CurrentFunction = function;
        HashSet<IRBlock> visited = new HashSet<>();


//        valueMap = new LinkedHashMap<String, Value>();
        RawOnlyName.workList = new ArrayList<>();
        valueMap = function.valueMap;


//


        for (IRBlock block : function.blocks) {
            deepToInst(blockCtx.get(block), visited);
        }
        function.entryBlock = function.blocks.get(0);
        for (RawOnlyName onlyName : RawOnlyName.workList) {
            var userList = new ArrayList<>(onlyName.users);
            for (User user : userList) {
                user.resetOperand(user.operands.indexOf(onlyName), valueMap.get(onlyName.name));
            }
        }

    }

    static IRBlock CurrentBlock;
    static int counter = 0;

    //private void setNewValue(IRBaseType type, Value value) {//cover rename
//        value.type = type;
//        valueMap.put(value.name, value);
//    }


    // visitint

    private void deepToInst(LLVMIRParser.BasicBlockContext ctx, HashSet<IRBlock> visited) {
        IRBlock block = (IRBlock) valueMap.get(CurrentFunction.name + getBasicBlockLabel(ctx).replaceAll(":", ""));

        if (visited.contains(block)) return;
        visited.add(block);

        CurrentBlock = block;
        for (var instCtx : ctx.instruction()) {
            var visit = visit(instCtx);
            IRBaseInst inst = (IRBaseInst) visit;
            inst.setParentBlock(block);
            rowMarker.put(inst, new RowMark(instCtx.getStart().getLine(), inst.format()));
        }
        IRBaseInst inst = (IRBaseInst) ctx.terminator().accept(this);
        inst.setParentBlock(block);
        rowMarker.put(inst, new RowMark(ctx.terminator().getStart().getLine(), inst.format()));


        if (block.terminator() instanceof IRBrInst) {
            if (((IRBrInst) block.terminator()).isJump()) {
                deepToInst(blockCtx.get(((IRBrInst) block.terminator()).destBlock()), visited);
            } else {
                deepToInst(blockCtx.get(((IRBrInst) block.terminator()).ifTrueBlock()), visited);
                deepToInst(blockCtx.get(((IRBrInst) block.terminator()).ifFalseBlock()), visited);
            }
        } else if (block.terminator() instanceof IRRetInst) {
            block.parentFunction.exitBlock = block;
        }
    }    @Override
    public Value visitPtrToIntInst(LLVMIRParser.PtrToIntInstContext ctx) {


        IRTruncInst inst = new IRTruncInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);
//todo so it cant be printed correctly
        return inst;

        //  return new IRMoveInst(newValue(destName,visitType( ctx.type()).type),visitTypeValue(ctx.typeValue()),null);

    }

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

    @Override
    public Value visitCompilationUnit(LLVMIRParser.CompilationUnitContext ctx) {

        ///  var funcDeclContexts = new ArrayList<LLVMIRParser.FuncDeclContext>();
        //var funcDefContexts = new ArrayList<LLVMIRParser.FuncDefContext>();
        // var globalDefContexts = new ArrayList<LLVMIRParser.GlobalDefContext>();

        for (int i = 0; i < ctx.topLevelEntity().size(); i++) {
            var context = ctx.topLevelEntity(i);

            if (context.funcDecl() != null) {
                var irFunction = (IRFunction) visit(context.funcDecl());
                irFunction.entryBlock = new IRBlock(irFunction.name + '0', irFunction);
                //funcDeclContexts.add(context.funcDecl());
                // global map added in each visit
                irModule.builtinFunctions.add(irFunction);

            } else if (context.funcDef() != null) {

                // funcDefContexts.add(context.funcDef());
                IRFunction function = (IRFunction) visit(context.funcDef());
                CurrentFunction = function;
                function.parentModule = irModule;
                irModule.functions.add(function);
                SolveFunctions.add(function);
            } else if (context.globalDef() != null) {

                irModule.globalVarSeg.add((GlobalVariable) visit(context.globalDef()));
            } else if (context.metadataDef() != null) {
                //todo
            } else if (context.typeDef() != null) {

                context.typeDef().accept(this);
            }


        }


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

        String TypeName = ctx.LocalIdent().getText().substring(1);
        var type = visitType(ctx.type()).type;
        type.setName(TypeName);
        var value = new Value(TypeName, type);

        globalValueMap.put(TypeName, value);
        return value;


    }

    @Override
    public Value visitGlobalDef(LLVMIRParser.GlobalDefContext ctx) {
        String glbName = ctx.GlobalIdent().getText().substring(1);


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
        return visit(ctx.funcHeader());
    }
    // this part is a Symbol Collector.
    // They will not go to instructions.

    @Override
    public Value visitFuncDef(LLVMIRParser.FuncDefContext ctx) {
        IRFunction function = (IRFunction) visit(ctx.funcHeader());
        CurrentFunction = function;
        for (var blockCtx : ctx.funcBody().basicBlock()) {
            IRBlock block = (IRBlock) visit(blockCtx);
            block.parentFunction = function;

            setNewValue(function, block.name, block);
            function.blocks.add(block);
        }

        function.Source = ctx;
        return function;
    }

    private void setNewValue(IRFunction function, String name, Value value) {//cover rename
        value.name = name;
        function.valueMap.put(name, value);
    }

    @Override
    public Value visitFuncHeader(LLVMIRParser.FuncHeaderContext ctx) {
        String funcName = ctx.GlobalIdent().getText().substring(1); // emit @

        IRBaseType retType = visitType(ctx.type()).type;

        // use bottom function constructor
        // "method" is unnecessary to concern
        var function = new IRFunction(funcName, retType);

        List<LLVMIRParser.ParamContext> params = ctx.params().param();
        for (int i = 0; i < params.size(); ++i) {

            String name = params.get(i).LocalIdent().getText().substring(1);
//
            IRBaseType argType = visitType(params.get(i).type()).type;

            ((IRFuncType) function.type).argTypes.add(argType);

            function.addArg(newValue(function, name, argType));
        }


        globalValueMap.put(funcName, function);
        //  setNewValue(funcName, function);
        return function;
    }

    private Value newValue(IRFunction function, String name, IRBaseType type) {//new get
        if (function.valueMap.get(name) != null) return valueMap.get(name);
        Value ret = new Value(name, type);
        function.valueMap.put(name, ret);
        return ret;
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

    // this part is instructions
    // CFG order!

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

    @Override
    public Value visitLabel(LLVMIRParser.LabelContext ctx) {
        String name = CurrentFunction.name + ctx.LocalIdent().getSymbol().getText().substring(1).replaceAll(":", "");
        if (valueMap.get(name) != null) {
            return valueMap.get(name);
        }
        return null;
    }

    @Override
    public Value visitTerminal(TerminalNode node) {

        if (CurrentFunction != null && valueMap.get(CurrentFunction.name + node.getSymbol().getText().substring(1).replaceAll(":", "")) != null) {
            return valueMap.get(CurrentFunction.name + node.getSymbol().getText().substring(1).replaceAll(":", ""));
        } else if (valueMap.get(node.getSymbol().getText()) != null) {
            return valueMap.get(node.getSymbol().getText());
        } else if (globalValueMap.get(node.getSymbol().getText()) != null) {
            return globalValueMap.get(node.getSymbol().getText());
        }
        return super.visitTerminal(node);
    }    @Override
    public Value visitConstant(LLVMIRParser.ConstantContext ctx) {
        if (ctx.GlobalIdent() != null) {
            String name = ctx.GlobalIdent().getText().substring(1);
//visitLocalDefInst()
            return globalValueMap.get(name);

        }
        return visitChildren(ctx);


    }



    @Override
    public Value visitConstantExpr(LLVMIRParser.ConstantExprContext ctx) {

        var inst = visitChildren(ctx);


        return setNewValue(destName, inst);
        //new Value(CurrentBlock.name + counter++, inst.type)


    }

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

        inst.addSourceInfo(ctx.getStart() + ctx.getText());
        inst.type = visitType(ctx.type()).type;
        inst.SourseType = inst.type;
        //inst.headPointer().type;

        // assert inst.type instanceof PointerType;

        //  inst.type = ((PointerType) inst.type).pointedType;
        for (int i = 1; i < inst.indicesNum(); ++i) {

            if (inst.type instanceof StructType) {
                inst.type = ((StructType) inst.type).memberVarTypes.get(((NumConst) indices.get(i)).constData);
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
            structConst.constData.add((BaseConst) visit(c));
        }

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
            String name = ctx.LocalIdent().getText().substring(1);
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

        TypePasser.type = globalValueMap.get(ctx.LocalIdent().getText().substring(1)).type;
        return TypePasser;
    }

    @Override
    public Value visitOpaquePointerType(LLVMIRParser.OpaquePointerTypeContext ctx) {
        // return super.visitOpaquePointerType(ctx);
        TypePasser.type = new PointerType(new VoidType());//todo how to do it
        return TypePasser;
    }

    @Override
    public Value visitLocalDefInst(LLVMIRParser.LocalDefInstContext ctx) {


        destName = ctx.LocalIdent().getText().substring(1);

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

    private Value setNewValue(String name, Value value) {//cover rename
        if (valueMap.containsKey(name)) {
            valueMap.remove(value.name);
        }

        value.name = name;
        valueMap.put(name, value);
        return value;
    }
//     private void setNewValue(Value Old, Value New) {//cover rename
//        valueMap.remove(value.name);
//        value.name = name;
//        valueMap.put(name, value);
//    }

    @Override
    public Value visitValueInstruction(LLVMIRParser.ValueInstructionContext ctx) {


        return visitChildren(ctx);
//
    }

    @Override
    public Value visitStoreInst(LLVMIRParser.StoreInstContext ctx) {

        return new IRStoreInst(visit(ctx.typeValue(1)), visit(ctx.typeValue(0)), null);

    }

    @Override
    public Value visitAddInst(LLVMIRParser.AddInstContext ctx) {
        // String destName = ctx.instDest().LocalReg().getText().substring(1);


        return visitBinary("add", ctx.typeValue(), ctx.value());


    }

    @Override
    public Value visitXorInst(LLVMIRParser.XorInstContext ctx) {
        return visitBinary("xor", ctx.typeValue(), ctx.value());
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


//
//
//

    @Override
    public Value visitAndInst(LLVMIRParser.AndInstContext ctx) {
        return visitBinary("and", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitOrInst(LLVMIRParser.OrInstContext ctx) {
        return visitBinary("or", ctx.typeValue(), ctx.value());

    }


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
        // String destName = ctx.typeValue().value().LocalIdent().getText().substring(1);

        IRLoadInst inst = new IRLoadInst(visit(ctx.typeValue()), null);

        // setNewValue(destName, inst);
        return inst;
    }

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

        inst.addSourceInfo(ctx.getStart() + ctx.getText());

        inst.type = visitType(type).type;
        inst.SourseType = inst.type;

        //inst.headPointer().type;

        // assert inst.type instanceof PointerType;

        //  inst.type = ((PointerType) inst.type).pointedType;
        for (int i = 1; i < inst.indicesNum(); ++i) {

            if (inst.type instanceof StructType) {
                inst.type = ((StructType) inst.type).memberVarTypes.get(((NumConst) indices.get(i)).constData);
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
        //String destName = ctx..LocalReg().getText().substring(1);

        IRTruncInst inst = new IRTruncInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);


        return inst;

    }

    @Override
    public Value visitZExtInst(LLVMIRParser.ZExtInstContext ctx) {
        //String destName = ctx.instDest().LocalReg().getText().substring(1);
//
        IRZextInst inst = new IRZextInst(visit(ctx.typeValue()), visitType(ctx.type()).type, null);


        return inst;
    }

    @Override
    public Value visitBitCastInst(LLVMIRParser.BitCastInstContext ctx) {
//         String destName = ctx.instDest().LocalReg().getText().substring(1);


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
        //  String destName = ctx.instDest().LocalReg().getText().substring(1);
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
        return super.visitSelectInst(ctx);
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

//    @Override
//    public Value visitInc(LLVMIRParser.IncContext ctx) {
//        ctx.LocalIdent()
//        return super.visitInc(ctx);
//    }

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



    // this is used to handle forward reference
    public static class RawOnlyName extends Value {
        public static ArrayList<RawOnlyName> workList = new ArrayList<>();

        public RawOnlyName(String name) {
            super(name, null);
            workList.add(this);
        }
    }
}
