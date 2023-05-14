package llvm2mlog.compiler.backend.optim;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.inst.AsmMoveInst;
import llvm2mlog.compiler.share.pass.AsmFuncPass;

public class CoalesceMoves implements AsmFuncPass {
    @Override
    public void runOnFunc(AsmFunction function) {
        for (AsmBlock block : function.blocks) {
            block.instructions.removeIf(inst -> inst instanceof AsmMoveInst && inst.rd.color == inst.rs1.color);
        }
    }
}
