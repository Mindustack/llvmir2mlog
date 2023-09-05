package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;
import org.jetbrains.annotations.NotNull;

public class IRStoreInst extends IRBaseInst {

    public IRStoreInst(@NotNull Value storePtr, @NotNull Value storeValue, IRBlock parentBlock) {
        super(LLVM.StoreInst, storeValue.type, parentBlock);
        this.addOperand(storeValue);
        this.addOperand(storePtr);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        return new IRStoreInst(storePtr(), storeValue(), null);
    }

    public Value storePtr() {
        return this.getOperand(1);
    }

    public Value storeValue() {
        return this.getOperand(0);
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    public void replacePtr(Value value) {
        this.resetOperand(1, value);
    }
}
