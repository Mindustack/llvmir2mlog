package darksword.interpreter;

import com.Kvto.LLVMIRBaseVisitor;
import com.Kvto.LLVMIRLexer;
import com.Kvto.LLVMIRParser;
import darksword.console.display.RowMark;
import masterball.compiler.middleend.llvmir.User;
import masterball.compiler.middleend.llvmir.Value;
import masterball.compiler.middleend.llvmir.constant.GlobalVariable;
import masterball.compiler.middleend.llvmir.constant.IntConst;
import masterball.compiler.middleend.llvmir.constant.StringConst;
import masterball.compiler.middleend.llvmir.hierarchy.IRBlock;
import masterball.compiler.middleend.llvmir.hierarchy.IRFunction;
import masterball.compiler.middleend.llvmir.hierarchy.IRModule;
import masterball.compiler.middleend.llvmir.inst.*;
import masterball.compiler.middleend.llvmir.type.*;
import masterball.compiler.share.error.ParseErrorListener;
import masterball.debug.Log;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Objects;

public class MB2 extends LLVMIRBaseVisitor<Value> {

    public final LinkedHashMap<String, Value> valueMap = new LinkedHashMap<>();
    private final LinkedHashMap<IRBlock, LLVMIRParser.BasicBlockContext> blockCtx = new LinkedHashMap<>();

    public IRModule irModule = new IRModule();
    public LinkedHashMap<Value, RowMark> rowMarker = new LinkedHashMap<>();

    public MB2() throws IOException {

        var file = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\test2.ll";

        // lexer
        LLVMIRLexer irLexer = new LLVMIRLexer(CharStreams.fromStream(new FileInputStream(new File(file))));
        irLexer.removeErrorListeners();
        irLexer.addErrorListener(new ParseErrorListener());

        // parser
        LLVMIRParser irParser = new LLVMIRParser(new CommonTokenStream(irLexer));
        irParser.removeErrorListeners();
        irParser.addErrorListener(new ParseErrorListener());

        // irModule.setBottomFunctions();
        // no need!
        visit(irParser.compilationUnit());

        // clear onlyName
        for (RawOnlyName onlyName : RawOnlyName.workList) {
            var userList = new ArrayList<>(onlyName.users);
            for (User user : userList) {
                user.resetOperand(user.operands.indexOf(onlyName), valueMap.get(onlyName.name));
            }
        }
        RawOnlyName.workList.clear();

        Log.info("Build Module finish from .ll file.");
    }

    private Value newValue(String name, IRBaseType type) {//new
        if (valueMap.get(name) != null) return valueMap.get(name);
        Value ret = new Value(name, type);
        valueMap.put(name, ret);
        return ret;
    }

    private void setNewValue(String name, Value value) {//cover rename
        value.name = name;
        valueMap.put(name, value);
    }

    //private void setNewValue(IRBaseType type, Value value) {//cover rename
//        value.type = type;
//        valueMap.put(value.name, value);
//    }
    private Value newValue(IRBaseType type) {//not into
        Value ret = new Value(type);
        return ret;
    }

    private IRBaseType translateType(LLVMIRParser.TypeContext ctx) {


        if (ctx.opaquePointerType() != null) {
            return new PointerType(translateType(ctx));
        }

        if (ctx.getText().equals("void")) {
            return new VoidType();
        }

        if (ctx.intType() != null) {


            int bitWidth = Integer.parseInt(ctx.intType().getText().substring(1));  // emit 'i'
            if (bitWidth == 1) return new BoolType();
            else if (bitWidth == 8) return new MemBoolType();

            return new IntType(bitWidth);
        } else if (ctx.labelType() != null) {
            return new LabelType();
//            } else if (ctx.localReg() != null) {
//                return valueMap.get(ctx.basicType().LocalReg().getText().substring(1 + LLVM.StructPrefix.length())).type;
//            }

//            assert ctx.arrayType() != null;
//            return new ArrayType(translateType(ctx.arrayType().type()), Integer.parseInt(ctx.arrayType().getText()));//TODO length?
        }
        return null;
    }

    private Value regToValue(LLVMIRParser.ValueContext valueContext) {
        String name = "";//todo handle
        if (valueContext.LocalIdent() != null) {
            name = valueContext.LocalIdent().getText().substring(1);

        } else if (valueContext.constant().GlobalIdent() != null) {
            name = valueContext.constant().GlobalIdent().getText().substring(1);

        }

        if (valueMap.get(name) == null) {
            return new RawOnlyName(name);
        }
        return valueMap.get(name);
    }

    @Override
    public Value visitCompilationUnit(LLVMIRParser.CompilationUnitContext ctx) {

        var funcDeclContexts = new ArrayList<LLVMIRParser.FuncDeclContext>();
        var funcDefContexts = new ArrayList<LLVMIRParser.FuncDefContext>();
        var globalDefContexts = new ArrayList<LLVMIRParser.GlobalDefContext>();

        for (int i = 0; i < ctx.topLevelEntity().size(); i++) {
            var context = ctx.topLevelEntity(i);

            if (context.funcDecl() != null) {
                funcDeclContexts.add(context.funcDecl());
            } else if (context.funcDef() != null) {
                funcDefContexts.add(context.funcDef());
            } else if (context.globalDef() != null) {
                globalDefContexts.add(context.globalDef());
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

        // functions
        for (var funcDecl : funcDeclContexts) {
            irModule.builtinFunctions.add((IRFunction) visit(funcDecl));
        }

        for (var funcDef : funcDefContexts) {
            IRFunction function = (IRFunction) visit(funcDef);
            function.parentModule = irModule;
            irModule.functions.add(function);
        }

        // global & string
        for (var globalDef : globalDefContexts) {
            if (Objects.equals(globalDef.getText(), "constant")) {//todo when it is a string
                // only string constant
                irModule.stringConstSeg.add((StringConst) visit(globalDef));
            } else {
                irModule.globalVarSeg.add((GlobalVariable) visit(globalDef));
            }
        }

        // start
        for (var funcDef : funcDefContexts) {
            deepToInst(funcDef);
        }


        return null;
    }

    @Override
    public Value visitGlobalDef(LLVMIRParser.GlobalDefContext ctx) {
        String glbName = ctx.GlobalIdent().getText().substring(1);

//        if (Objects.equals(ctx.GlobalWord().getText(), "constant")) {
//            assert ctx.initExp() != null;
//            assert ctx.initExp().atom() != null;
//            StringConst strCst = (StringConst) visit(ctx.initExp().atom());
//            setNewValue(glbName, strCst);
//            return strCst;
//        }

        GlobalVariable glbVar = new GlobalVariable(glbName, translateType(ctx.type()));
//        if (ctx.initExp() != null) {
//            if (ctx.initExp().atom() != null)
//                glbVar.initValue = visit(ctx.initExp().atom());
//            else {
//                // zero initializer
//                glbVar.initValue = null;
//            }
//        }
        setNewValue(glbName, glbVar);
        return glbVar;

    }


    // this part is a Symbol Collector.
    // They will not go to instructions.

    @Override
    public Value visitFuncDecl(LLVMIRParser.FuncDeclContext ctx) {
        return visit(ctx.funcHeader());
    }

    @Override
    public Value visitFuncHeader(LLVMIRParser.FuncHeaderContext ctx) {
        String funcName = ctx.GlobalIdent().getText().substring(1); // emit @

        IRBaseType retType = translateType(ctx.type());

        // use bottom function constructor
        // "method" is unnecessary to concern
        var function = new IRFunction(funcName, retType);

        var params = ctx.params();


        for (int i = 1; i < params.param().size(); ++i) {
            String name = funcName + ".anon_arg" + i;
//            if (ctx.LocalReg(i - 1) != null) {
//                name = ctx.LocalReg(i - 1).getText().substring(1);
//            }
            IRBaseType argType = translateType(params.param(i).type());

            ((IRFuncType) function.type).argTypes.add(argType);
            function.addArg(newValue(name, argType));
        }

        setNewValue(funcName, function);
        return function;
    }

    @Override
    public Value visitFuncDef(LLVMIRParser.FuncDefContext ctx) {
        IRFunction function = (IRFunction) visit(ctx.funcHeader());

        for (var blockCtx : ctx.funcBody().basicBlock()) {
            IRBlock block = (IRBlock) visit(blockCtx);
            block.parentFunction = function;
            if (function.entryBlock == null) {
                function.entryBlock = block;
            }
            function.blocks.add(block);
        }

        return function;
    }

    @Override
    public Value visitBasicBlock(LLVMIRParser.BasicBlockContext ctx) {
        IRBlock block = new IRBlock(ctx.LabelIdent().getText(), null);//todo long name

        setNewValue(block.name, block);
        blockCtx.put(block, ctx);
        return block;
    }


//    @Override
//    public Value visitClassDecl(LLVMIRParser. ctx) {
//        StructType classType = (StructType) valueMap.get(ctx.LocalReg().getText().substring(1 + LLVM.StructPrefix.length())).type;
//
//        for (var memberTypeCtx : ctx.type()) {
//            classType.memberVarTypes.add(translateType(memberTypeCtx));
//        }
//
//        return classType.structProto;
//    }

    private void deepToInst(LLVMIRParser.FuncDefContext ctx) {
        HashSet<IRBlock> visited = new HashSet<>();

        for (int i = 0; i < ctx.funcBody().basicBlock().size(); ++i) {
            deepToInst(ctx.funcBody().basicBlock().get(i), visited);
        }
    }

    // this part is instructions
    // CFG order!

    private void deepToInst(LLVMIRParser.BasicBlockContext ctx, HashSet<IRBlock> visited) {
        IRBlock block = (IRBlock) valueMap.get(ctx.LabelIdent().getText());//todo long

        if (visited.contains(block)) return;
        visited.add(block);


        for (var instCtx : ctx.instruction()) {
            IRBaseInst inst = (IRBaseInst) visit(instCtx);
            inst.setParentBlock(block);
            rowMarker.put(inst, new RowMark(instCtx.getStart().getLine(), inst.format()));
        }
        IRBaseInst inst = (IRBaseInst) visit(ctx.terminator());
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
    }

    @Override
    public Value visitLocalDefInst(LLVMIRParser.LocalDefInstContext ctx) {


        String destName = ctx.LocalIdent().getText().substring(1);

//        IRAllocaInst inst = new IRAllocaInst(
//                destName,
//                translateType(ctx.valueInstruction().allocaInst().type()),
//                null
//        );
        var inst = visit(ctx.valueInstruction());


        setNewValue(destName, inst);
//        if (inst.type!=null){
//            setNewValue(inst.type,);
//        }

        return inst;

    }

    @Override
    public Value visitStoreInst(LLVMIRParser.StoreInstContext ctx) {

        return new IRStoreInst(visit(ctx.typeValue(1)), visit(ctx.typeValue(0)), null);

    }

    @Override
    public Value visitAllocaInst(LLVMIRParser.AllocaInstContext ctx) {

        return newValue(translateType(ctx.type()));

    }

    @Override
    public Value visitValueInstruction(LLVMIRParser.ValueInstructionContext ctx) {


        if (ctx.allocaInst() != null) {

            return visit(ctx.allocaInst());

        }
        if (ctx.loadInst() != null) {
            return visit(ctx.loadInst());
        }
        if (ctx.addInst() != null) {
            return visit(ctx.addInst());
        }
        if (ctx.subInst() != null) {
            return visit(ctx.subInst());
        }
        if (ctx.mulInst() != null) {
            return visit(ctx.mulInst());
        }
        if (ctx.iCmpInst() != null) {
            return visit(ctx.iCmpInst());
        }
        if (ctx.callInst() != null) {
            return visit(ctx.callInst());
        }


        return null;
    }

    @Override
    public Value visitTypeValue(LLVMIRParser.TypeValueContext ctx) {
        return visit(ctx.value());
    }

    @Override
    public Value visitLoadInst(LLVMIRParser.LoadInstContext ctx) {
        // String destName = ctx.typeValue().value().LocalIdent().getText().substring(1);

        IRLoadInst inst = new IRLoadInst(visit(ctx.typeValue()),//todo what is this
                null);

        // setNewValue(destName, inst);
        return inst;
    }

    @Override
    public Value visitAddInst(LLVMIRParser.AddInstContext ctx) {
        // String destName = ctx.instDest().LocalReg().getText().substring(1);


        return visitBinary("add", ctx.typeValue(), ctx.value());


    }

    @Override
    public Value visitSubInst(LLVMIRParser.SubInstContext ctx) {

        return super.visitSubInst(ctx);
    }

    @Override
    public Value visitValue(LLVMIRParser.ValueContext ctx) {
        //  var type = ctx.firstClassType().concreteType();
        if (ctx.constant() != null) {

            var constant = ctx.constant();
            if (constant.GlobalIdent() != null) {
                return regToValue(ctx);

            } else if (constant.intConst() != null) {
                return new IntConst(Integer.parseInt(constant.intConst().IntLit().getText()));
            }


//        if (ctx.value().constant()==null) {
//            if (type.intType() != null) {
//
//        } else if (ctx.StringConstant() != null) {
//            String rawString = ctx.StringConstant().toString();
//            return new StringConst(
//                    rawString.substring(2, rawString.length() - 1) // filter： c" "
//                            .replace("\\5C", "\\")
//                            .replace("\\0A", "\n")
//                            .replace("\\00", "\0")
//                            .replace("\\09", "\t")
//                            .replace("\\22", "\"")
//            );
//        } else if (ctx.BoolConstant() != null) {
//            return new BoolConst(Objects.equals(ctx.BoolConstant().getText(), "true"));
//        }
//        }
//        if (type.!= null) {
//            return regToValue(ctx.GlobalReg());
//        } else if (ctx.LocalReg() != null) {
//            return regToValue(ctx.LocalReg());
//        } else
//
//        assert ctx.NullptrConstant() != null;
//        return new NullptrConst();


        } else {
            if (ctx.LocalIdent() != null) {
                return regToValue(ctx);
            }

        }

        return null;

    }


    public Value visitBinary(String op, LLVMIRParser.TypeValueContext typeValueContext, LLVMIRParser.ValueContext valueContext) {


        IRBinaryInst inst = new IRBinaryInst(
                op,
//                translateType(ctx.type())
                new IntType(8)
                ,
                visit(typeValueContext),
                visit(valueContext),
                null
        );
        return inst;
    }

//    @Override
//    public Value visitBitCastInst(LLVMIRParser.BitCastInstContext ctx) {
//         String destName = ctx.instDest().LocalReg().getText().substring(1);
//
//        IRBitCastInst inst = new IRBitCastInst(
//                visit(ctx.src),
//                translateType(ctx.type(1)),
//                null
//        );
//
//        setNewValue(destName, inst);
//        return inst;
//    }

    @Override
    public Value visitTruncInst(LLVMIRParser.TruncInstContext ctx) {
        //String destName = ctx..LocalReg().getText().substring(1);

        IRTruncInst inst = new IRTruncInst(
                visit(ctx.typeValue()),
                translateType(ctx.type()),
                null
        );


        return inst;

    }

    @Override
    public Value visitZExtInst(LLVMIRParser.ZExtInstContext ctx) {
        //String destName = ctx.instDest().LocalReg().getText().substring(1);
//
        IRZextInst inst = new IRZextInst(
                visit(ctx.typeValue()),
                translateType(ctx.type()),
                null
        );


        return inst;
    }

    @Override
    public Value visitTerminator(LLVMIRParser.TerminatorContext ctx) {
        if (ctx.retTerm() != null) {
            return visit(ctx.retTerm());
        }
        if (ctx.brTerm() != null) {
            return visit(ctx.brTerm());
        }
        if (ctx.condBrTerm() != null) {
            return visit(ctx.condBrTerm());
        }
        return null;
    }

    @Override
    public Value visitRetTerm(LLVMIRParser.RetTermContext ctx) {
        if (ctx.value() != null) {
            return new IRRetInst(visit(ctx.value()), null);
        }
        return new IRRetInst(null);
    }

    @Override
    public Value visitBrTerm(LLVMIRParser.BrTermContext ctx) {
        return new IRBrInst((IRBlock) visit(ctx.label()), null);

    }

    @Override
    public Value visitCondBrTerm(LLVMIRParser.CondBrTermContext ctx) {
        return new IRBrInst(
                visit(ctx.value()),
                (IRBlock) visit(ctx.label(0)),
                (IRBlock) visit(ctx.label(1)),
                null
        );

    }

    @Override
    public Value visitCallInst(LLVMIRParser.CallInstContext ctx) {
        ArrayList<Value> argsValue = new ArrayList<>();
//ctx.args().
        for (var arg : ctx.args().arg())
            argsValue.add(visit(arg));

        IRCallInst inst = new IRCallInst((IRFunction) regToValue(ctx.value()), null, argsValue);


        inst.type = translateType(ctx.type());
        return inst;
    }

    @Override
    public Value visitArg(LLVMIRParser.ArgContext ctx) {

        return visit(ctx.value());

    }

    @Override
    public Value visitICmpInst(LLVMIRParser.ICmpInstContext ctx) {

        String op = ctx.iPred().getText();

        IRICmpInst inst = new IRICmpInst(
                op,
                visit(ctx.typeValue()),
                visit(ctx.value()),
                null
        );


        return inst;
    }


//todo compute pointer

//    @Override
//    public Value visitGetelementptr(LLVMIRParser.GetelementptrContext ctx) {
//        String destName = ctx.instDest().LocalReg().getText().substring(1);
//
//        ArrayList<Value> indices = new ArrayList<>();
//
//        for (var offsetCtx : ctx.gepOffset())
//            indices.add(visit(offsetCtx.atom()));
//
//        IRGetElementPtrInst inst = new IRGetElementPtrInst(visit(ctx.src), null, null, indices);
//        inst.type = inst.headPointer().type;
//        for (int i = 0; i < inst.indicesNum(); ++i) {
//            if (i == 0) { // the first index always indexes the pointer
//                assert inst.type instanceof PointerType;
//                inst.type = ((PointerType) inst.type).pointedType;
//            } else {
//                if (inst.type instanceof StructType) {
//                    inst.type = ((StructType) inst.type).memberVarTypes.get(((IntConst) indices.get(i)).constData);
//                } else if (inst.type instanceof ArrayType) {
//                    inst.type = ((ArrayType) inst.type).elementType;
//                } else {
//                    throw new InternalError("getelementptr in other types");
//                }
//            }
//        }
//
//        // wrapped
//        inst.type = new PointerType(inst.type);
//
//        setNewValue(destName, inst);
//        return inst;
//    }
//

    @Override
    public Value visitAndInst(LLVMIRParser.AndInstContext ctx) {
        return visitBinary("and", ctx.typeValue(), ctx.value());
    }


//
//
//

    @Override
    public Value visitOrInst(LLVMIRParser.OrInstContext ctx) {
        return visitBinary("or", ctx.typeValue(), ctx.value());

    }

    @Override
    public Value visitMulInst(LLVMIRParser.MulInstContext ctx) {
        return visitBinary("mul", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitFDivInst(LLVMIRParser.FDivInstContext ctx) {
        return visitBinary("div", ctx.typeValue(), ctx.value());
    }

    @Override
    public Value visitLabel(LLVMIRParser.LabelContext ctx) {
        String name = ctx.LocalIdent().getSymbol().getText();
        if (valueMap.get(name) != null) {
            return valueMap.get(name);
        }
        return null;
    }

    // this is used to handle forward reference
    public static class RawOnlyName extends Value {
        public static ArrayList<RawOnlyName> workList = new ArrayList<>();

        public RawOnlyName(String name) {
            super(name, null);
            workList.add(this);
        }
    }


    // todo wtf
//
//    @Override
//    public Value visitPhi(LLVMIRParser.PhiContext ctx) {
//        String destName = ctx.instDest().LocalReg().getText().substring(1);
//        IRPhiInst inst = new IRPhiInst(translateType(ctx.type()), null);
//
//        for (var phi : ctx.phiBranch()) {
//            inst.addBranch(visit(phi.atom(0)), (IRBlock) visit(phi.atom(1)));
//        }
//        setNewValue(destName, inst);
//        return inst;
//    }
//
//
    //todo least need

//    @Override
//    public Value visitAtom(LLVMIRParser.AtomContext ctx) {
//        if (ctx.GlobalReg() != null) {
//            return regToValue(ctx.GlobalReg());
//        } else if (ctx.LocalReg() != null) {
//            return regToValue(ctx.LocalReg());
//        } else if (ctx.integerConstant() != null) {
//            return new IntConst(Integer.parseInt(ctx.integerConstant().getText()));
//        } else if (ctx.StringConstant() != null) {
//            String rawString = ctx.StringConstant().toString();
//            return new StringConst(
//                    rawString.substring(2, rawString.length() - 1) // filter： c" "
//                            .replace("\\5C", "\\")
//                            .replace("\\0A", "\n")
//                            .replace("\\00", "\0")
//                            .replace("\\09", "\t")
//                            .replace("\\22", "\"")
//            );
//        } else if (ctx.BoolConstant() != null) {
//            return new BoolConst(Objects.equals(ctx.BoolConstant().getText(), "true"));
//        }
//
//        assert ctx.NullptrConstant() != null;
//        return new NullptrConst();
//    }
}
