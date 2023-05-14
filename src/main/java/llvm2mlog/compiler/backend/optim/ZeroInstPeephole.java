package llvm2mlog.compiler.backend.optim;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.inst.AsmALUInst;
import llvm2mlog.compiler.backend.rvasm.inst.AsmBaseInst;
import llvm2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import llvm2mlog.compiler.share.lang.MLOG;
import llvm2mlog.compiler.share.pass.AsmFuncPass;

public class ZeroInstPeephole implements AsmFuncPass {

    @Override
    public void runOnFunc(AsmFunction function) {

        for (AsmBlock block : function.blocks) {
            var it = block.instructions.iterator();

            while (it.hasNext()) {
                AsmBaseInst inst = it.next();

                if (inst instanceof AsmALUInst) {
                    String op = ((AsmALUInst) inst).op;

                    switch (op) {
                        case MLOG.AddOperation:
                        case MLOG.SubOperation:
                        case MLOG.OrOperation:
                        case MLOG.XorOperation:
                        case MLOG.ShiftLeftOperation:
                        case MLOG.ShiftRightOperation: {
                            if (inst.rd.color == inst.rs1.color) {
                                if (inst.imm != null && inst.imm.value == 0) it.remove();
                                if (inst.rs2 != null && inst.rs2.color == PhysicalReg.reg("zero")) it.remove();
                            }
                        }
                    }
                }
            }
        }

    }
}
