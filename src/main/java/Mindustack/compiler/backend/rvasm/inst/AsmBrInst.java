package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.operand.Register;
import Mindustack.compiler.share.lang.MLOG;

// no beqz now

public class AsmBrInst extends AsmBaseInst {
    public AsmBlock dest;
    String op;

    public AsmBrInst(String op, Register rs1, Register rs2, AsmBlock dest, AsmBlock parentBlock) {
        super(null, rs1, rs2, null, parentBlock);
        this.op = op;
        this.dest = dest;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmBrInst(op, rs1, rs2, dest, null);
    }

    @Override
    public String format() {
        // beq rs1, rs2, dest
        return String.format("%s %s %s %s %s", MLOG.BrInstPrefix, op, rs1, rs2, dest);
    }
}
