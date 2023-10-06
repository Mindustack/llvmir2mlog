package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.ASMBuildinFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.PhysicalReg;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;

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
    public AsmBaseInst copy() {
        return new AsmCallInst(callFunc, null, isTailCall);
    }

    @Override
    public HashSet<Register> defs() {
        return new HashSet<>(PhysicalReg.callerSaved);
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

    @Override
    public HashSet<Register> uses() {
        HashSet<Register> ret = new HashSet<>();
        for (int i = 0; i < Integer.min(MLOG.MaxArgRegNum, callFunc.arguments.size()); i++)
            ret.add(PhysicalReg.a(i));
        return ret;
    }
}
