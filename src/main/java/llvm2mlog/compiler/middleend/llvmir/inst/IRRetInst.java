package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.type.VoidType;
import llvm2mlog.compiler.share.lang.LLVM;
import llvm2mlog.compiler.share.pass.InstVisitor;

public class IRRetInst extends IRBaseInst {

    public IRRetInst(IRBlock parentBlock) {
        super(LLVM.RetInst, new VoidType(), parentBlock);
    }

    public IRRetInst(Value retVal, IRBlock parentBlock) {
        super(LLVM.RetInst, retVal.type, parentBlock);
        this.addOperand(retVal);
    }

    public Value retVal() {
        return this.getOperand(0);
    }

    public boolean isVoid() {
        return this.operandSize() == 0;
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    @Override
    public boolean isTerminator() {
        return true;
    }

    @Override
    public IRBaseInst copy() {
        if (isVoid()) return new IRRetInst(null);
        return new IRRetInst(retVal(), null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
