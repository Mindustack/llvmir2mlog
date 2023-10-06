package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;

public class AsmMoveInst extends AsmBaseInst {
    public AsmMoveInst(Register rd, Register rs1, AsmBlock parentBlock) {
        super(rd, rs1, null, null, parentBlock);
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmMoveInst(rd, rs1, null);
    }

    @Override
    public String format() {
        // mv rd, rs1
        return String.format("set %s %s", rd, rs1);
    }
}
