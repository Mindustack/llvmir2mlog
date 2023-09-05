package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

public class IRBitCastInst extends IRBaseInst {
    public IRBitCastInst(Value fromValue, IRBaseType targetType, IRBlock parentBlock) {
        super(LLVM.BitCastInst, targetType, parentBlock);
        this.addOperand(fromValue);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        return new IRBitCastInst(fromValue(), type, null);
    }

    public Value fromValue() {
        return this.getOperand(0);
    }
}
