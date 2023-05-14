package llvm2mlog.compiler.backend.rvasm.inst;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import llvm2mlog.compiler.backend.rvasm.operand.Register;

import java.util.HashSet;

public class AsmRetInst extends AsmBaseInst {
    public AsmRetInst(AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        // ret use "ra"
    }

    @Override
    public HashSet<Register> uses() {
        HashSet<Register> ret = new HashSet<Register>();
        ret.add(PhysicalReg.reg("ra"));
        return ret;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmRetInst(null);
    }

    @Override
    public String format() {
        return "set @counter ra";
    }
}
