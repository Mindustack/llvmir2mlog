package org.mindustack.compiler.middleend.llvmir.inst;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.type.VoidType;
import org.mindustack.compiler.share.lang.LLVM;
import org.mindustack.compiler.share.pass.InstVisitor;

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
