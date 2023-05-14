package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.share.lang.LLVM;
import llvm2mlog.compiler.share.pass.InstVisitor;

public class IRBitCastInst extends IRBaseInst {
    public IRBitCastInst(Value fromValue, IRBaseType targetType, IRBlock parentBlock) {
        super(LLVM.BitCastInst, targetType, parentBlock);
        this.addOperand(fromValue);
    }

    public Value fromValue() {
        return this.getOperand(0);
    }

    @Override
    public IRBaseInst copy() {
        return new IRBitCastInst(fromValue(), type, null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
