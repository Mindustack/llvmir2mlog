package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

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
