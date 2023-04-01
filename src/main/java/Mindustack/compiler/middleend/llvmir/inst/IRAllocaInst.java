package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.middleend.llvmir.type.PointerType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

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
    public String format() {
        // %alloca = alloca <type>, align <size>
        return this.identifier() + " = " + LLVM.AllocaInst + " " +
                this.allocaType + ", align " + this.allocaType.size();
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
