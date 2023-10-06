package org.mindustack.llvmir2mlog.compiler.backend.optim;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.inst.AsmMoveInst;
import org.mindustack.llvmir2mlog.compiler.share.pass.AsmFuncPass;

public class CoalesceMoves implements AsmFuncPass {
    @Override
    public void runOnFunc(AsmFunction function) {
        for (AsmBlock block : function.blocks) {
            block.instructions.removeIf(inst -> inst instanceof AsmMoveInst && inst.rd.color == inst.rs1.color);
        }
    }
}
