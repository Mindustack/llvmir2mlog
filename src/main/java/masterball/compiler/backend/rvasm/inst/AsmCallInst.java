package masterball.compiler.backend.rvasm.inst;

import masterball.compiler.backend.rvasm.hierarchy.AsmBlock;
import masterball.compiler.backend.rvasm.hierarchy.AsmFunction;
import masterball.compiler.backend.rvasm.operand.PhysicalReg;
import masterball.compiler.backend.rvasm.operand.Register;
import masterball.compiler.share.lang.MLOG;

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
        // call symbol
        return
                "op add ra @counter 2" + "\n"
                        + String.format("\t%s %s", MLOG.CallInst, callFunc.entryBlock.identifier)
                ;
    }
}
