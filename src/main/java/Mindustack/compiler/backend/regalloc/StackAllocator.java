package Mindustack.compiler.backend.regalloc;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.backend.rvasm.inst.AsmBaseInst;
import Mindustack.compiler.backend.rvasm.operand.Immediate;
import Mindustack.compiler.backend.rvasm.operand.RawStackOffset;
import Mindustack.compiler.share.lang.MLOG;
import Mindustack.compiler.share.pass.AsmFuncPass;
import Mindustack.compiler.share.pass.AsmModulePass;

public class StackAllocator implements AsmModulePass, AsmFuncPass {

    @Override
    public void runOnModule(AsmModule module) {
        module.functions.forEach(this::runOnFunc);
    }

    @Override
    public void runOnFunc(AsmFunction function) {
        function.totalStackUse += function.callerArgStackUse + function.allocaStackUse + function.spillStackUse;

        if (function.totalStackUse % MLOG.SpLowUnit != 0)
            function.totalStackUse = (function.totalStackUse / MLOG.SpLowUnit + 1) * MLOG.SpLowUnit;


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
                            break;
                        }
                        case alloca: {
                            inst.imm = new Immediate(inst.imm.value + function.callerArgStackUse);
                            break;
                        }
                        case spill: {
                            inst.imm = new Immediate(inst.imm.value + function.callerArgStackUse + function.allocaStackUse);
                            break;
                        }
                        case calleeArg: {
                            inst.imm = new Immediate(inst.imm.value
                                    + function.totalStackUse
                            );
                            break;
                        }
                        case lowerSp: {
                            inst.imm = new Immediate(-function.totalStackUse);
                            break;
                        }
                        case raiseSp: {
                            inst.imm = new Immediate(function.totalStackUse);
                            break;
                        }
                    }
                }
            }
        }
    }
}
