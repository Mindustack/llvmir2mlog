package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.PhysicalReg;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;

import java.util.HashSet;

public class AsmTailInst extends AsmBaseInst {
    //todo
    private final AsmFunction callFunc;

    public AsmTailInst(AsmFunction callFunc, AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        this.callFunc = callFunc;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmTailInst(callFunc, null);
    }

    @Override
    public HashSet<Register> defs() {
        return new HashSet<>(PhysicalReg.callerSaved);
    }

    @Override
    public String format() {
        // tail symbol
        return String.format("%s %s %s", "jump always", callFunc.identifier, "_LabelForTail");
    }

    //todo wanna give up this but...
    @Override
    public HashSet<Register> uses() {
        HashSet<Register> ret = new HashSet<>();
        for (int i = 0; i < Integer.min(MLOG.MaxArgRegNum, callFunc.arguments.size()); i++)
            ret.add(PhysicalReg.a(i));
        return ret;
    }

}
