package org.mindustack.llvmir2mlog.compiler.backend.rvasm.inst;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.Immediate;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.Register;

// Arithm and Logic Inst
// add, sub, ...
// slt, seqz, ...

public class AsmALUInst extends AsmBaseInst {
    static final String symbol = "op";
    public final String op;

    public AsmALUInst(String op, Register rd, Register rs1, Register rs2, AsmBlock parentBlock) {
        super(rd, rs1, rs2, null, parentBlock);
        this.op = op;
    }

    public AsmALUInst(String op, Register rd, Register rs1, Immediate imm, AsmBlock parentBlock) {
        super(rd, rs1, null, imm, parentBlock);
        this.op = op;
    }

    public AsmALUInst(String op, Register rd, Register rs1, AsmBlock parentBlock) {
        super(rd, rs1, null, null, parentBlock);
        this.op = op;
    }

    @Override
    public AsmBaseInst copy() {
        if (imm != null)
            return new AsmALUInst(op, rd, rs1, imm, null);
        return new AsmALUInst(op, rd, rs1, rs2, null);
    }

    @Override
    public String format() {
        // add rd, rs1, rs2
        // addi rd, rs1, imm


        if (this.imm != null) // I-Type
            return String.format("%s %s %s %s %s", symbol, op
//                    + RV32I.ITypeSuffix
                    , rd, rs1, imm);
        else if (this.rs2 != null) // R-Type
            return String.format("%s %s %s %s %s", symbol, op, rd, rs1, rs2);
        else
            // unary, maybe pseudo inst
            return String.format("%s %s %s %s", symbol, op, rd, rs1);
    }
}
