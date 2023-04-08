package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.constant.NullptrConst;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.PointerType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;
import org.jetbrains.annotations.NotNull;

public class IRStoreInst extends IRBaseInst {

    public IRStoreInst(@NotNull Value storePtr, @NotNull Value storeValue, IRBlock parentBlock) {
        super(LLVM.StoreInst, storeValue.type, parentBlock);
        this.addOperand(storeValue);
        this.addOperand(storePtr);
    }

    public Value storeValue() {
        return this.getOperand(0);
    }

    public Value storePtr() {
        return this.getOperand(1);
    }

    public void replacePtr(Value value) {
        this.resetOperand(1, value);
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    @Override
    public String format() {
        // store i32 %1, i32* %i, align 4
        // nullptr has the same type with destPtr.pointedType
        if (this.storeValue() instanceof NullptrConst) {
            return LLVM.StoreInst + " " + ((PointerType) this.storePtr().type).pointedType + " " +
                    this.storeValue().identifier() + ", " + this.storePtr().typedIdentifier() + ", align " + this.type.size();
        }

        return LLVM.StoreInst + " " + this.storeValue().typedIdentifier() + ", " + this.storePtr().typedIdentifier() + ", align " + this.type.size();
    }

    @Override
    public IRBaseInst copy() {
        return new IRStoreInst(storePtr(), storeValue(), null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
