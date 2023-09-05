package org.mindustack.compiler.middleend.llvmir.inst;

import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.compiler.middleend.llvmir.type.PointerType;
import org.mindustack.compiler.share.pass.InstVisitor;

public class IRAllocaInst extends IRBaseInst {
    public String allocaName;
    public IRBaseType allocaType;

    // PS: allocaType is the *pointedType* of this Inst
    public IRAllocaInst(String allocaName, IRBaseType allocaType, IRBlock parentBlock) {
        super(addrRename(allocaName),
                new PointerType(allocaType), parentBlock, true);

        this.allocaName = allocaName;
        this.allocaType = allocaType;
    }

    @Override
    public IRBaseInst copy() {
        return new IRAllocaInst(allocaName, allocaType, null);
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
