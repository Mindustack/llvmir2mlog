package org.mindustack.compiler.middleend.llvmir.inst;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.compiler.share.lang.LLVM;
import org.mindustack.compiler.share.pass.InstVisitor;

public class IRCastInst extends IRBaseInst {

    public IRCastInst(Value fromValue, IRBaseType targetType, IRBlock parentBlock) {
        super(LLVM.TruncInst, targetType, parentBlock);
        this.addOperand(fromValue);
    }

    public Value fromValue() {
        return this.getOperand(0);
    }

    @Override
    public IRBaseInst copy() {
        return new IRCastInst(fromValue(), type, null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
