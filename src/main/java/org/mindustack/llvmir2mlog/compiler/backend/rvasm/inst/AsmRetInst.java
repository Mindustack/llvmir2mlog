package org.mindustack.llvmir2mlog.compiler.backend.rvasm.inst;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.Register;

import java.util.HashSet;

public class AsmRetInst extends AsmBaseInst {
    public AsmRetInst(AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        // ret use "ra"
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmRetInst(null);
    }

    @Override
    public String format() {
        return "set @counter ra";
    }

    @Override
    public HashSet<Register> uses() {
        HashSet<Register> ret = new HashSet<Register>();
        ret.add(PhysicalReg.reg("ra"));
        return ret;
    }
}
