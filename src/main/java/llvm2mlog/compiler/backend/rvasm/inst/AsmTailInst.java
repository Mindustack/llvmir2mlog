package llvm2mlog.compiler.backend.rvasm.inst;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import llvm2mlog.compiler.backend.rvasm.operand.Register;
import llvm2mlog.compiler.share.lang.MLOG;

import java.util.HashSet;

public class AsmTailInst extends AsmBaseInst {
//todo
    private final AsmFunction callFunc;

    public AsmTailInst(AsmFunction callFunc, AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        this.callFunc = callFunc;
    }
//todo wanna give up this but...
    @Override
    public HashSet<Register> uses() {
        HashSet<Register> ret = new HashSet<>();
        for (int i = 0; i < Integer.min(MLOG.MaxArgRegNum, callFunc.arguments.size()); i++)
            ret.add(PhysicalReg.a(i));
        return ret;
    }

    @Override
    public HashSet<Register> defs() {
        return new HashSet<>(PhysicalReg.callerSaved);
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmTailInst(callFunc, null);
    }

    @Override
    public String format() {
        // tail symbol
        return String.format("%s %s %s", "jump always", callFunc.identifier, "_LabelForTail");
    }

}
