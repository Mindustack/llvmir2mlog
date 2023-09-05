package org.mindustack.compiler.backend.rvasm.inst;

import org.mindustack.compiler.backend.rvasm.hierarchy.ASMBuildinFunction;
import org.mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import org.mindustack.compiler.backend.rvasm.operand.PhysicalReg;
import org.mindustack.compiler.backend.rvasm.operand.Register;
import org.mindustack.compiler.share.lang.MLOG;

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
        if (callFunc instanceof ASMBuildinFunction && ((ASMBuildinFunction) callFunc).inline) {
            return ((ASMBuildinFunction) callFunc).getInlineCode();
        } else {
            return
                    String.format("op add ra @counter 1\njump %s always", callFunc.entryBlock.identifier)
                    ;
        }

    }
}
