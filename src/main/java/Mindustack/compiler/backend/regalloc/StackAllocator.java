package Mindustack.compiler.backend.regalloc;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.backend.rvasm.inst.AsmBaseInst;
import Mindustack.compiler.backend.rvasm.operand.Immediate;
import Mindustack.compiler.backend.rvasm.operand.RawStackOffset;
import Mindustack.compiler.share.pass.AsmFuncPass;
import Mindustack.compiler.share.pass.AsmModulePass;

public class StackAllocator implements AsmModulePass, AsmFuncPass {

    @Override
    public void runOnModule(AsmModule module) {
        module.functions.forEach(this::runOnFunc);
    }

    @Override
    public void runOnFunc(AsmFunction function) {
        function.totalStackUse += function.callerArgStackUse + function.allocaStackUse + function.spillStackUse + 1;


//        Log.report(function.identifier, function.totalStackUse, function.callerArgStackUse, function.allocaStackUse, function.spillStackUse);

        // waiting for solving
        //if (function.totalStackUse >= RV32I.ImmBound) throw new StackOverflowError();

        // stack allocate
        for (AsmBlock block : function.blocks) {
            for (AsmBaseInst inst : block.instructions) {
                if (inst.imm instanceof RawStackOffset) {
                    switch (((RawStackOffset) inst.imm).level) {
                        case callerArg: {
                            inst.imm = new Immediate(inst.imm.value + 1);

                            // throw new RuntimeException("unsolved");
                            break;
                        }
                        case alloca: {
                            inst.imm = new Immediate(inst.imm.value + function.callerArgStackUse + 1).negative();
                            break;
                        }
                        case spill: {
                            inst.imm = new Immediate(inst.imm.value + function.callerArgStackUse + function.allocaStackUse + 1).negative();
                            break;
                        }
                        case calleeArg: {
                            inst.imm = new Immediate(inst.imm.value
                                    + function.totalStackUse
                            );
                            break;
                        }
                        case SpFromFp: {
                            inst.imm = new Immediate(function.totalStackUse);
                            break;
                        }
//                        case raiseSp: {
//                            inst.imm = new Immediate(function.totalStackUse);
//                            break;
//                        }
                    }
                }
            }
        }
    }
}
