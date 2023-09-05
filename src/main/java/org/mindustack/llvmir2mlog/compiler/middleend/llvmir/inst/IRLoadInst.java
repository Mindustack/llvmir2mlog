package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.PointerType;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

public class IRLoadInst extends IRBaseInst {
    public IRLoadInst(Value loadPtr, IRBlock parentBlock) {
        super(Value.resolveRename(loadPtr.name),
                ((PointerType) loadPtr.type).pointedType,
                parentBlock);
        this.addOperand(loadPtr);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        return new IRLoadInst(loadPtr(), null);
    }

    public Value loadPtr() {
        return this.getOperand(0);
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    public void replacePtr(Value value) {
        this.resetOperand(0, value);
    }
}
