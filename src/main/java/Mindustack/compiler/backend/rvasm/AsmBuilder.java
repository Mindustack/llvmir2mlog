package Mindustack.compiler.backend.rvasm;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.backend.rvasm.inst.*;
import Mindustack.compiler.backend.rvasm.operand.*;
import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.constant.*;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;
import Mindustack.compiler.middleend.llvmir.inst.*;
import Mindustack.compiler.middleend.llvmir.type.ArrayType;
import Mindustack.compiler.middleend.llvmir.type.IRFuncType;
import Mindustack.compiler.middleend.llvmir.type.PointerType;
import Mindustack.compiler.middleend.llvmir.type.StructType;
import Mindustack.compiler.share.error.codegen.InternalError;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.lang.MLOG;
import Mindustack.compiler.share.misc.Pair;
import Mindustack.compiler.share.pass.IRBlockPass;
import Mindustack.compiler.share.pass.IRFuncPass;
import Mindustack.compiler.share.pass.IRModulePass;
import Mindustack.compiler.share.pass.InstVisitor;

import java.util.ArrayList;

/*
 implements @IRVisitor and @InstVisitor
 notice: the order of register created.
 use cur.toReg to avoid this problem
*/

public class AsmBuilder implements IRModulePass, IRFuncPass, IRBlockPass, InstVisitor {

    public final AsmModule module = new AsmModule();

    private final AsmCurrent cur = new AsmCurrent();

    public AsmBuilder() {
    }

    private static boolean validImm(Value value) {
        return (value instanceof NumConst) || value instanceof BoolConst;
    }

    private static boolean validImm(int value) {
        return true;
    }

    private static boolean equalZero(Value value) {
        return value instanceof NullptrConst || (value instanceof NumConst && ((NumConst) value).constData == 0) || (value instanceof BoolConst && !((BoolConst) value).constData);
    }

    // check an immediate: whether it is a valid two power, return imm log2
    // if not a valid 2power immediate, return null
    private static Immediate twoPowerCheck(Value value) {
        if (!(value instanceof NumConst)) return null;
        int log2 = 0, valData = ((NumConst) value).constData;
        if (valData <= 0) return null;
        while (valData > 1) {
            if (valData % 2 != 0) return null;
            valData >>= 1;
            log2++;
        }
        return new Immediate(log2);
    }

    public void buildModuleSkeleton(IRModule irModule) {
        globalDecl(irModule);

        for (IRFunction builtinFunc : irModule.builtinFunctions) {
            AsmFunction function = new AsmFunction(builtinFunc.name);
            builtinFunc.asmOperand = function;
            for (int i = 0; i < ((IRFuncType) builtinFunc.type).argTypes.size(); i++) {
                VirtualReg reg = new VirtualReg(builtinFunc.getArgType(i).size());
                function.arguments.add(reg);

                // spill
                if (i >= MLOG.MaxArgRegNum) {
                    reg.stackOffset = new RawStackOffset(function.calleeArgStackUse, RawStackOffset.RawType.calleeArg);
                    function.calleeArgStackUse += MLOG.I32Unit;
                }


                // just for recognition
                for (IRBlock irBlock : builtinFunc.blocks) {
                    AsmBlock block = new AsmBlock(irBlock.name);
                    block.loopDepth = irBlock.loopDepth;
                    irBlock.asmOperand = block;
                    function.blocks.add(block);
                }

                function.entryBlock = (AsmBlock) builtinFunc.entryBlock.asmOperand;


            }
            //todo build library here
        }

        for (IRFunction irFunc : irModule.functions) {
            AsmFunction function = new AsmFunction(irFunc.name);
            irFunc.asmOperand = function;

            for (int i = 0; i < irFunc.operands.size(); i++) {
                Value arg = irFunc.operands.get(i);
                VirtualReg reg = new VirtualReg(arg.type.size());
                arg.asmOperand = reg;

                function.arguments.add(reg);

//                //                     spill
                if (i >= MLOG.MaxArgRegNum) {
                    reg.stackOffset = new RawStackOffset(function.calleeArgStackUse, RawStackOffset.RawType.calleeArg);
                    function.calleeArgStackUse += MLOG.I32Unit;
                }
            }

            module.functions.add((AsmFunction) irFunc.asmOperand);

            for (IRBlock irBlock : irFunc.blocks) {
                AsmBlock block = new AsmBlock(irBlock.name);
                block.loopDepth = irBlock.loopDepth;
                irBlock.asmOperand = block;
                function.blocks.add(block);
            }
            for (IRBlock irBlock : irFunc.blocks) {
                irBlock.prevs.forEach(pre -> ((AsmBlock) irBlock.asmOperand).prevs.add((AsmBlock) pre.asmOperand));
                irBlock.nexts.forEach(nxt -> ((AsmBlock) irBlock.asmOperand).nexts.add((AsmBlock) nxt.asmOperand));
            }
            function.entryBlock = (AsmBlock) irFunc.entryBlock.asmOperand;
            function.exitBlock = (AsmBlock) irFunc.exitBlock.asmOperand;
        }
    }

    // Builder
    @Override
    public void runOnModule(IRModule irModule) {
        buildModuleSkeleton(irModule);
        irModule.functions.forEach(this::runOnFunc);
    }

    public Register awesomeGEP(Value ptrPos, Value index, int elementSize, StructType classType) {
        VirtualReg gepReg = new VirtualReg();
        if (classType != null) {
            // class member get
            assert index instanceof NumConst;
            if (equalZero(index)) {
                Register ptrReg = cur.toReg(ptrPos);
                if (ptrPos instanceof GlobalValue) {
                    if (((GlobalValue) ptrPos).gpRegMark) {
                        new AsmMoveInst(gepReg, PhysicalReg.reg("gp"), cur.block);
                    } else {
                        new AsmLaInst(gepReg, ptrReg.identifier, cur.block);
                    }
                } else new AsmMoveInst(gepReg, ptrReg, cur.block);
            } else {
                int memberOffset = classType.memberOffset(((NumConst) index).constData);
                awesomeALU(MLOG.AddOperation, gepReg, ptrPos, new NumConst(memberOffset));
            }
        } else {
            // array
            if (index instanceof NumConst) {
                // constant folding
                if (equalZero(index)) {
                    Register ptrReg = cur.toReg(ptrPos);
                    if (ptrPos instanceof GlobalValue) {
                        if (((GlobalValue) ptrPos).gpRegMark) {
                            new AsmMoveInst(gepReg, PhysicalReg.reg("gp"), cur.block);
                        } else {
                            new AsmLaInst(gepReg, ptrReg.identifier, cur.block);
                        }
                    } else new AsmMoveInst(gepReg, ptrReg, cur.block);
                } else {
                    int totalSize = ((NumConst) index).constData * elementSize;
                    awesomeALU(MLOG.AddOperation, gepReg, ptrPos, new NumConst(totalSize));
                }
            } else {
                VirtualReg mulReg = new VirtualReg();
                awesomeALU(MLOG.MulOperation, mulReg, index, new NumConst(elementSize));
                // this not use awesomeALU because it can not be optimized
                new AsmALUInst(MLOG.AddOperation, gepReg, cur.toReg(ptrPos), mulReg, cur.block);
            }
        }
        return gepReg;
    }

    @Override
    public void runOnBlock(IRBlock block) {
        cur.block = (AsmBlock) block.asmOperand;
        cur.recordLi.clear();
        block.instructions.forEach(inst -> inst.accept(this));
    }

    @Override
    public void runOnFunc(IRFunction function) {
        cur.func = (AsmFunction) function.asmOperand;

        // lower the stack pointer
        // sp low

        //?
        new AsmALUInst(MLOG.AddOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"),
                // new RawStackOffset(0, RawType.lowerSp)
                new Immediate(-1)
                , cur.func.entryBlock);


        new AsmStoreInst(1, PhysicalReg.reg("sp"),
                PhysicalReg.reg("fp"), new Immediate(0), cur.func.entryBlock);


        new AsmMoveInst(PhysicalReg.reg("fp"), PhysicalReg.reg("sp"), cur.func.entryBlock);


      //  new AsmLabel(cur.func.identifier + MLOG.LabelForTailSuffix, cur.func.entryBlock);

        ArrayList<Register> calleeSaveTemp = new ArrayList<>();
        for (PhysicalReg phyReg : PhysicalReg.calleeSaved) {
            VirtualReg rd = new VirtualReg();
            calleeSaveTemp.add(rd);
            new AsmMoveInst(rd, phyReg, cur.func.entryBlock);
        }


        // ra
        VirtualReg raTemp = new VirtualReg();


        new AsmMoveInst(raTemp, PhysicalReg.reg("ra"), cur.func.entryBlock);


        new AsmExplainInst("move arguments 0~7 to reg", cur.func.entryBlock);


        // move arguments 0~7 to reg
        for (int i = 0; i < Integer.min(cur.func.arguments.size(), MLOG.MaxArgRegNum); i++) {
            new AsmMoveInst(cur.func.arguments.get(i), PhysicalReg.a(i), cur.func.entryBlock);
        }
        VirtualReg argInStack;
        new AsmExplainInst("load arguments in mem to reg", cur.func.entryBlock);
        // load arguments in mem to reg
        for (int i = MLOG.MaxArgRegNum; i < cur.func.arguments.size(); i++) {

            argInStack = new VirtualReg();
            new AsmALUInst(MLOG.SubOperation, argInStack, PhysicalReg.reg("sp")
                    , new Immediate(1 - MLOG.MaxArgRegNum + i), cur.func.entryBlock);
            new AsmLoadInst(1, cur.func.arguments.get(i),
                    argInStack

                    ,
                    new Immediate(0)

                    , cur.func.entryBlock)
            ;

        }
        new AsmExplainInst("start", cur.func.entryBlock);

        function.blocks.forEach(this::runOnBlock);

        //
        for (int i = 0; i < PhysicalReg.calleeSaved.size(); i++) {
            new AsmMoveInst(PhysicalReg.calleeSaved.get(i), calleeSaveTemp.get(i), cur.func.exitBlock);
        }


        // ra temp back todo why not load
        new AsmExplainInst("ra temp back", cur.func.entryBlock);


        new AsmMoveInst(PhysicalReg.reg("ra"), raTemp, cur.func.exitBlock);


        //  new AsmTailInst();


        // sp back
//        new AsmALUInst(MLOG.AddOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"),
//                new RawStackOffset(0, RawType.raiseSp), cur.func.exitBlock);


        //    new AsmMoveInst(PhysicalReg.reg("fp"),PhysicalReg.reg("sp"),cur.func.entryBlock);


        // new AsmMoveInst(PhysicalReg.reg("sp"), PhysicalReg.reg("fp"), cur.func.exitBlock);
        new AsmExplainInst("sp and fp", cur.func.entryBlock);


        new AsmMoveInst(PhysicalReg.reg("sp"), PhysicalReg.reg("fp"), cur.func.exitBlock);
        new AsmLoadInst(1, PhysicalReg.reg("fp"),
                PhysicalReg.reg("fp"), new Immediate(0), cur.func.exitBlock);

        new AsmALUInst(MLOG.AddOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"),
                //new RawStackOffset(0, RawType.raiseSp)
                new Immediate(1)
                , cur.func.entryBlock);


        // return
        new AsmRetInst(cur.func.exitBlock);

        cur.func.blocks.forEach(block -> {
            block.instructions.forEach(inst -> {
                if (!(inst.imm instanceof RawMemOffset)) return;
                inst.rs1 = ((RawMemOffset) inst.imm).pointer;
                inst.imm = new Immediate(inst.imm.value);
            });
        });
        VirtualReg.regNumReset();

    }

    @Override
    public void visit(IRBinaryInst inst) {
        Register instReg = cur.toReg(inst);
        awesomeALU(AsmTranslator.translateArithmOp(inst.op), instReg, inst.lhs(), inst.rhs());
    }

    @Override
    public void visit(IRBitCastInst inst) {
        // ignore type
        awesomeMove(cur.toReg(inst), inst.getOperand(0));
    }

    @Override
    public void visit(IRBrInst inst) {
        inst.asmOperand = null; // Br Type no inst reg

        if (inst.isJump()) {
            new AsmJmpInst((AsmBlock) inst.destBlock().asmOperand, cur.block);
            return;
        }

        if (inst.condition() instanceof IRICmpInst && ((IRICmpInst) inst.condition()).forBr()) {
            // coalesce cmp and br
            Pair<String, Boolean> result = AsmTranslator.translateCmpOp(((IRICmpInst) inst.condition()).op);
            if (result.second())
                new AsmBrInst(result.first(), cur.toReg(((IRICmpInst) inst.condition()).rhs()), cur.toReg(((IRICmpInst) inst.condition()).lhs()),
                        (AsmBlock) inst.ifTrueBlock().asmOperand, cur.block);
            else
                new AsmBrInst(result.first(), cur.toReg(((IRICmpInst) inst.condition()).lhs()), cur.toReg(((IRICmpInst) inst.condition()).rhs()),
                        (AsmBlock) inst.ifTrueBlock().asmOperand, cur.block);
        } else {
            new AsmBrInst(MLOG.NotEqualSuffix, cur.toReg(inst.condition()), cur.toReg(new NumConst(0)),
                    (AsmBlock) inst.ifTrueBlock().asmOperand, cur.block);
        }

        new AsmJmpInst((AsmBlock) inst.ifFalseBlock().asmOperand, cur.block);
    }

    // InstSelector
    @Override
    public void visit(IRAllocaInst inst) {

        if (cur.block == cur.func.entryBlock) {
            inst.asmOperand = new RawStackOffset(cur.func.allocaStackUse, RawStackOffset.RawType.alloca);


            cur.func.allocaStackUse += ((PointerType) inst.type).pointedType.size();

        } else {
            new AsmALUInst(MLOG.SubOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"), cur.toImm(((PointerType) inst.type).pointedType.size()), cur.block);
            new AsmMoveInst(cur.toReg(inst), PhysicalReg.reg("sp"), cur.block);

            // awesomeALU(MLOG.SubOperation, cur.toReg(inst),PhysicalReg.reg("sp"),cur.toImm(((PointerType) inst.type).pointedType.size()) );
        }//todo if i can delete commom expression


    }

    @Override
    public void visit(IRCallInst inst) {

        new AsmExplainInst("call start", cur.func.entryBlock);

        AsmFunction callFunc = (AsmFunction) inst.callFunc().asmOperand;


//         new AsmExplainInst("backup callee",cur.func.entryBlock);
//
//        // backup callee
//       // ArrayList<Register> calleeSaveTemp = new ArrayList<>();
//
//        for (PhysicalReg phyReg : PhysicalReg.calleeSaved) {
//           // break;
//            new AsmALUInst(MLOG.SubOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"), new Immediate(1), cur.block);
//
//            //VirtualReg rd = new VirtualReg();
//            //calleeSaveTemp.add(rd);
//
//             new AsmStoreInst(1,PhysicalReg.reg("sp"), phyReg,
//                    // notice: here use the argument of CallInst, not the func
//                    // and the RawStackOffset should use caller
//                    //cur.toReg(inst.getArg(i)),
//                    new Immediate(0),//new RawStackOffset(callFunc.arguments.get(i).stackOffset.value, RawType.callerArg),
//                    cur.block);
//            //new AsmMoveInst(PhysicalReg.reg("sp"), phyReg, cur.func.entryBlock);
//        }


        new AsmExplainInst("pass param", cur.func.entryBlock);


        // 0~7
        for (int i = 0; i < Integer.min(inst.callFunc().getArgNum(), MLOG.MaxArgRegNum); i++) {
            if (inst.getArg(i) instanceof GlobalValue) {
                if (((GlobalValue) inst.getArg(i)).gpRegMark) {
                    //todo
                    // new AsmMoveInst(PhysicalReg.a(i), PhysicalReg.reg("gp"), cur.block);
                } else {
                    // new AsmLaInst(PhysicalReg.a(i), inst.getArg(i).asmOperand.identifier, cur.block);
                }
            } else awesomeMove(PhysicalReg.a(i), inst.getArg(i));
        }
        Register argInStack;
        // spill to mem
        for (int i = MLOG.MaxArgRegNum; i < callFunc.arguments.size(); i++) {

            argInStack = new VirtualReg();
            new AsmALUInst(MLOG.SubOperation, argInStack, PhysicalReg.reg("sp")
                    , new Immediate(2 - MLOG.MaxArgRegNum + i), cur.func.entryBlock);
            new AsmStoreInst(inst.getArg(i).type.size(), argInStack,
                    // notice: here use the argument of CallInst, not the func
                    // and the RawStackOffset should use caller
                    cur.toReg(inst.getArg(i)),
                    new Immediate(0),//new RawStackOffset(callFunc.arguments.get(i).stackOffset.value, RawType.callerArg),
                    cur.block);
        }

        // callerArg space = max calleeArg space
        //cur.func.callerArgStackUse = max(cur.func.callerArgStackUse, callFunc.calleeArgStackUse);

        new AsmCallInst(callFunc, cur.block, inst.isTailCall);
        if (!inst.callFunc().isVoid()) {
            // return value
            new AsmMoveInst(cur.toReg(inst), PhysicalReg.reg("a0"), cur.block);
        }


//        new AsmExplainInst("callee temp back",cur.func.entryBlock);
//
//        // callee temp back
//        for (PhysicalReg phyReg : PhysicalReg.calleeSaved) {
//           new AsmALUInst(MLOG.AddOperation, PhysicalReg.reg("sp"), PhysicalReg.reg("sp"), new Immediate(1), cur.block);
////break;
//            //VirtualReg rd = new VirtualReg();
//            //calleeSaveTemp.add(rd);
//
//             new AsmLoadInst(1,phyReg, PhysicalReg.reg("sp"),
//                    // notice: here use the argument of CallInst, not the func
//                    // and the RawStackOffset should use caller
//                    //cur.toReg(inst.getArg(i)),
//                    new Immediate(0),//new RawStackOffset(callFunc.arguments.get(i).stackOffset.value, RawType.callerArg),
//                    cur.block);
//        }


        new AsmExplainInst("call end", cur.func.entryBlock);

    }

    @Override
    public void visit(IRICmpInst inst) {
        // only use slt, seqz, snez

        // this cmp inst will be merged into next br
        if (inst.forBr()) return;

        Register instReg = cur.toReg(inst);
        switch (inst.op) {
            case LLVM.LessArg:
                awesomeALU(MLOG.LessThanOperation, instReg, inst.lhs(), inst.rhs());
                break;
            case LLVM.GreaterArg:
                awesomeALU(MLOG.GreaterThanOperation, instReg, inst.rhs(), inst.lhs());
                break;
            case LLVM.GreaterEqualArg: // a >= b -> !(a < b)
                awesomeALU(MLOG.GreaterThanEqOperation, instReg, inst.lhs(), inst.rhs());
                //new AsmALUInst(MLOG.XorOperation, instReg, instReg, cur.toImm(1), cur.block);
                break;
            case LLVM.LessEqualArg: // a <= b -> !(b < a)
                awesomeALU(MLOG.LessThanEqOperation, instReg, inst.rhs(), inst.lhs());
                //new AsmALUInst(MLOG.XorOperation, instReg, instReg, cur.toImm(1), cur.block);
                break;
            case LLVM.EqualArg: { // a == b -> xor = a ^ b; seqz rd, xor
                // VirtualReg xorReg = new VirtualReg();
                awesomeALU(MLOG.EqualOperation, instReg, inst.lhs(), inst.rhs());
                // new AsmALUInst(MLOG.SeqzInst, instReg, xorReg, cur.block);
                break;
            }
            case LLVM.NotEqualArg: {
                //VirtualReg xorReg = new VirtualReg();
                awesomeALU(MLOG.NotEqualOperation, instReg, inst.lhs(), inst.rhs());
                // new AsmALUInst(MLOG.SnezInst, instReg, xorReg, cur.block);
                break;
            }
            default:
                throw new InternalError("unknown ASM compare op");
        }
    }

    /**
     * step 1. calculate address
     * only 1~2 indices presented in LLVM IR
     * 2 indices means it is a class "GetElementPtr". Then the first index must be 0
     * index * elementSize (if it is array)
     * memberOffset (if it is class)
     * do some constant folding (detail in @awesomeGEP)
     */
    @Override
    public void visit(IRGetElementPtrInst inst) {

        // Value index = inst.isGetMember() ? inst.memberIndex() : inst.ptrMoveIndex();
        //  StructType classType = inst.isGetMember() ? (StructType) ((PointerType) inst.headPointer().type).pointedType : null;
//        int elementSize = ((PointerType) inst.headPointer().type).pointedType.size(); // well... quite interesting
//
//        Register instReg = cur.toReg(inst);
//        Register gepReg = awesomeGEP(inst.headPointer(), index, elementSize, classType);
//        new AsmMvInst(instReg, gepReg, cur.block);
//


        var curElement = ((PointerType) inst.headPointer().type).pointedType;
        Register instReg = cur.toReg(inst);

        VirtualReg virtualReg = new VirtualReg();// = new VirtualReg();
        int elementSize = curElement.size();


        new AsmALUInst(MLOG.AddOperation, instReg, PhysicalReg.reg("fp")
                , cur.toImm(inst.getOperand(0)), cur.block);
        //


        for (int i = 0; i < inst.operandSize(); ++i) {


            var operand = inst.getOperand(i);


//todo heap then add

            elementSize = i == inst.operandSize() ? 1 : elementSize;


            awesomeALU(MLOG.MulOperation, virtualReg, operand, new NumConst(elementSize));


            new AsmALUInst(MLOG.AddOperation, instReg, instReg,
                    virtualReg, cur.block);


//            if (i != inst.operandSize()) {
//                //new AsmLoadInst(1, instReg, instReg, cur.toImm(0), cur.block);
//
//                return;
//            }


            if (curElement instanceof ArrayType) {

                curElement = ((ArrayType) curElement).elementType;
                elementSize = curElement.size();
            } else if (curElement instanceof StructType) {


                assert operand instanceof NumConst;


                var memberVarTypes = ((StructType) curElement).memberVarTypes;
                elementSize = 0;

                var constData = ((NumConst) operand).constData;
                for (int j = 0; j < constData; j++) {

                    elementSize += memberVarTypes.get(j).size();
                }
                curElement = memberVarTypes
                        .get(constData);


                // elementSize = ((StructType) curElement.type).size();

            } else {
                elementSize = curElement.size();
                //curElement
            }


//            if (i != inst.operandSize()) {
//                new AsmLoadInst(1, instReg, instReg, cur.toImm(0), cur.block);
//
//            }


        }
        //  new AsmMoveInst(instReg, instReg,cur.block);

//        Value index = inst.isGetMember() ? inst.memberIndex() : inst.ptrMoveIndex();
//        StructType classType = inst.isGetMember() ? (StructType) ((PointerType) inst.headPointer().type).pointedType : null;
//        int elementSize = ((PointerType) inst.headPointer().type).pointedType.size(); // well... quite interesting
//
//        // local & const && only for load/store
//
//        if (index instanceof NumConst && !(inst.headPointer() instanceof GlobalValue) && specialGEPCheck(inst)) {
//            int offset = 0;
//            if (classType != null) {
//                offset = classType.memberOffset(((NumConst) index).constData);
//            } else {
//                offset = ((NumConst) index).constData * elementSize;
//            }
//
//            inst.asmOperand = new RawMemOffset(cur.toReg(inst.headPointer()), offset);
//            return;
//        }
//
//        Register instReg = cur.toReg(inst);
//        Register gepReg = awesomeGEP(inst.headPointer(), index, elementSize, classType);
//        new AsmMoveInst(instReg, gepReg, cur.block);

    }

    @Override
    public void visit(IRPhiInst inst) {

//        Register instReg = cur.toReg(inst);
//
//        var operands = inst.operands;
//
//        IRBlock irBlock =new IRBlock();
//        AsmBlock block = new AsmBlock(irBlock.name);
//                block.loopDepth = irBlock.loopDepth;
//                irBlock.asmOperand = block;
//                cur.func.blocks.add(block);
        //Value branchData, IRBlock preBlock


//it seems that phi is resolved in llvm
        throw new InternalError("Phi Inst appears in ASM");
    }

    @Override
    public void visit(IRRetInst inst) {
        if (inst.isVoid()) return;
        awesomeMove(PhysicalReg.reg("a0"), inst.retVal());
    }

    // private method tools

    @Override
    public void visit(IRLoadInst inst) {
        Register instReg = cur.toReg(inst);

        if (inst.loadPtr() instanceof GlobalValue) {
//            if (((GlobalValue) inst.loadPtr()).gpRegMark) {
//                new AsmMoveInst(instReg, PhysicalReg.reg("gp"), cur.block);
//            } else {
//// todo               VirtualReg luiReg = new VirtualReg();
//                GlobalReg globalReg = (GlobalReg) cur.toReg(inst.loadPtr());
//                // awesomeALU(RV32I.AddInst,instReg,);
////                new AsmLuiInst(luiReg, new GlobalAddr(globalReg, GlobalAddr.HiLo.hi), cur.block);
//                // new AsmLiInst(instReg, new GlobalAddr(globalReg), cur.block);
//                new AsmLoadInst(inst.type.size(), instReg, globalReg, cur.toImm(0), cur.block);
//            }
        } else {


            // if it is not global, it must be loaded from stack, right? todo
            if (inst.loadPtr().asmOperand instanceof RawStackOffset) {
                new AsmLoadInst(inst.type.size(), instReg, PhysicalReg.reg("fp"), cur.toImm(inst.loadPtr()), cur.block);
            } else if (inst.loadPtr().asmOperand instanceof RawMemOffset) {
//                // must be produced by gep
//                new AsmLoadInst(inst.type.size(), instReg,
//                        null,
//                        (Immediate) inst.loadPtr().asmOperand,
//                        cur.block);
            } else {
                new AsmLoadInst(inst.type.size(), instReg, cur.toReg(inst.loadPtr()), cur.toImm(0), cur.block);
            }


            // new AsmLoadInst(inst.type.size(), instReg, cur.toReg(inst.loadPtr()), cur.toImm(0), cur.block);

        }
    }

    // awesome asm optimize

    @Override
    public void visit(IRTruncInst inst) {
        awesomeMove(cur.toReg(inst), inst.getOperand(0));
    }

    @Override
    public void visit(IRZextInst inst) {
        awesomeMove(cur.toReg(inst), inst.getOperand(0));
    }

    @Override
    public void visit(IRMoveInst inst) {
        awesomeMove(cur.toReg(inst.dest()), inst.source());
    }

    private void globalDecl(IRModule irModule) {
        for (GlobalVariable globalVar : irModule.globalVarSeg) {
            GlobalReg globalReg = new GlobalReg(globalVar.name);
            globalVar.asmOperand = globalReg;
            module.globalVarSeg.add(globalReg);
        }

//        for (StringConst strConst : irModule.stringConstSeg) {
//            GlobalReg strReg = new GlobalReg(strConst.name, strConst.constData);
//            strConst.asmOperand = strReg;
//            module.stringConstSeg.add(strReg);
//        }
    }

    //    private boolean specialGEPCheck(IRGetElementPtrInst inst) {
//        if (inst.asmOperand != null) return false;
//        for (User user : inst.users)
//            if (!(user instanceof IRLoadInst || user instanceof IRStoreInst)) return false;
//        return true;
//    }

    private void awesomeALU(String rvOp, Register dest, Value lhs, Value rhs) {
        // now support:
        // slt optimize
        // binary arithm calculate
        // remember this calculate only support two IR Value

        // div can not use this optimize because of negative num problem
        if (rvOp.equals(MLOG.MulOperation)) {
            Immediate lhsLog2 = twoPowerCheck(lhs), rhsLog2 = twoPowerCheck(rhs);
            if (lhsLog2 != null) {
                new AsmALUInst(MLOG.ShiftLeftOperation, dest, cur.toReg(rhs), lhsLog2, cur.block);
                return;
            } else if (rhsLog2 != null) {
                new AsmALUInst(MLOG.ShiftLeftOperation, dest, cur.toReg(lhs), rhsLog2, cur.block);
                return;
            }
        }

        if (AsmTranslator.hasIType(rvOp)) {
            if (validImm(rhs)) {
                new AsmALUInst(rvOp, dest, cur.toReg(lhs), cur.toImm(rhs), cur.block);
                return;
            } else if (AsmTranslator.isCommunicative(rvOp) && validImm(lhs)) {
                new AsmALUInst(rvOp, dest, cur.toReg(rhs), cur.toImm(lhs), cur.block);
                return;
            }
        } else if (rvOp.equals(MLOG.SubOperation)) {
            if (validImm(rhs)) {
                // not communicative
                new AsmALUInst(MLOG.AddOperation, dest, cur.toReg(lhs), cur.toImm(rhs).negative(), cur.block);
                return;
            }
        }

        new AsmALUInst(rvOp, dest, cur.toReg(lhs), cur.toReg(rhs), cur.block);
    }

    public void awesomeMove(Register dest, Value source) {
        if (validImm(source)) {
            new AsmLiInst(dest, cur.toImm(source), cur.block);
        } else {
            new AsmMoveInst(dest, cur.toReg(source), cur.block);
        }
    }

    @Override
    public void visit(IRStoreInst inst) {
        if (inst.storePtr() instanceof GlobalValue) {
            if (((GlobalValue) inst.storePtr()).gpRegMark) {
                new AsmMoveInst(PhysicalReg.reg("gp"), cur.toReg(inst.storeValue()), cur.block);
            } else {
//  todo              VirtualReg luiReg = new VirtualReg();
                GlobalReg globalReg = (GlobalReg) cur.toReg(inst.storePtr());
//                new AsmLuiInst(luiReg, new GlobalAddr(globalReg, GlobalAddr.HiLo.hi), cur.block);
                new AsmStoreInst(inst.storeValue().type.size(), null, cur.toReg(inst.storeValue()), cur.toImm(0), cur.block);
            }
        } else {

            if (inst.storePtr().asmOperand instanceof RawStackOffset) {
                // must be stack
                new AsmStoreInst(inst.storeValue().type.size(), PhysicalReg.reg("fp"),
                        cur.toReg(inst.storeValue()), cur.toImm(inst.storePtr()), cur.block);
            } else if (inst.storePtr().asmOperand instanceof RawMemOffset) {
                //todo
                // must be produced by gep
//                new AsmStoreInst(inst.storeValue().type.size(),
//                        null,
//                        cur.toReg(inst.storeValue()),
//                        (Immediate) inst.storePtr().asmOperand,
//                        cur.block);
            } else {
                new AsmStoreInst(inst.storeValue().type.size(), cur.toReg(inst.storePtr()), cur.toReg(inst.storeValue()), cur.toImm(0), cur.block);
            }
        }
    }
}
