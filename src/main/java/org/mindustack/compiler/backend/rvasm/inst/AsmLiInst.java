package org.mindustack.compiler.backend.rvasm.inst;

import org.mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.compiler.backend.rvasm.operand.Immediate;
import org.mindustack.compiler.backend.rvasm.operand.Register;

public class AsmLiInst extends AsmBaseInst {
    public AsmLiInst(Register rd, Immediate imm, AsmBlock parentBlock) {
        super(rd, null, null, imm, parentBlock);
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmLiInst(rd, imm, null);
    }

    @Override
    public String format() {
        return String.format("set %s %s", rd, imm);
    }//set a number
}
