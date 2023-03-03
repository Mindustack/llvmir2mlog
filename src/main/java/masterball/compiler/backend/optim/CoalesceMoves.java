package masterball.compiler.backend.optim;

import masterball.compiler.backend.rvasm.hierarchy.AsmBlock;
import masterball.compiler.backend.rvasm.hierarchy.AsmFunction;
import masterball.compiler.backend.rvasm.inst.AsmMoveInst;
import masterball.compiler.share.pass.AsmFuncPass;

public class CoalesceMoves implements AsmFuncPass {
    @Override
    public void runOnFunc(AsmFunction function) {
        for (AsmBlock block : function.blocks) {
            block.instructions.removeIf(inst -> inst instanceof AsmMoveInst && inst.rd.color == inst.rs1.color);
        }
    }
}
