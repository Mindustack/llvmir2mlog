package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.operand.Register;
import Mindustack.compiler.share.lang.MLOG;

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
        return String.format("%s %s %s", MLOG.MvInst, rd, rs1);
    }
}