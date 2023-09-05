package org.mindustack.compiler.middleend.llvmir.inst;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.type.PointerType;
import org.mindustack.compiler.share.pass.InstVisitor;

public class IRLoadInst extends IRBaseInst {
    public IRLoadInst(Value loadPtr, IRBlock parentBlock) {
        super(Value.resolveRename(loadPtr.name),
                ((PointerType) loadPtr.type).pointedType,
                parentBlock);
        this.addOperand(loadPtr);
    }

    public Value loadPtr() {
        return this.getOperand(0);
    }

    public void replacePtr(Value value) {
        this.resetOperand(0, value);
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    @Override
    public IRBaseInst copy() {
        return new IRLoadInst(loadPtr(), null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
