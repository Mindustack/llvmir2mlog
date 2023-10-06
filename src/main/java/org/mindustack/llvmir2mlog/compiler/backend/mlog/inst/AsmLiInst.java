package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Immediate;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;

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
