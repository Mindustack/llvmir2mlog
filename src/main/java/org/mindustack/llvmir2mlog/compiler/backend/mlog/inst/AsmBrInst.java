package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;

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
        return String.format("jump %s %s %s %s", dest, op, rs1, rs2);
    }
}
