package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.share.lang.LLVM;
import llvm2mlog.compiler.share.pass.InstVisitor;

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
