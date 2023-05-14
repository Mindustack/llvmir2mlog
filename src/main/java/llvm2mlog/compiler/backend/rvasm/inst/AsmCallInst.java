package llvm2mlog.compiler.backend.rvasm.inst;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import llvm2mlog.compiler.backend.rvasm.operand.Register;
import llvm2mlog.compiler.share.lang.MLOG;

import java.util.HashSet;

public class AsmCallInst extends AsmBaseInst {
    public final AsmFunction callFunc;

    public boolean isTailCall;

    public AsmCallInst(AsmFunction callFunc, AsmBlock parentBlock, boolean isTailCall) {
        super(null, null, null, null, parentBlock);
        this.callFunc = callFunc;
        this.isTailCall = isTailCall;
    }

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
        return new AsmCallInst(callFunc, null, isTailCall);
    }

    @Override
    public String format() {
        return
                "op add ra @counter 1" + "\n"
                        + String.format("\tjump %s always", callFunc.entryBlock.identifier)
                ;
    }
}
