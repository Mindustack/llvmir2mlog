package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

public class IRZextInst extends IRBaseInst {

    public IRZextInst(Value fromValue, IRBaseType targetType, IRBlock parentBlock) {
        super(LLVM.ZextInst, targetType, parentBlock);
        this.addOperand(fromValue);
    }

    public Value fromValue() {
        return this.getOperand(0);
    }

    @Override
    public String format() {
        // %zext = zext i8 %a to i32;
        return this.identifier() + " = " + LLVM.ZextInst + " " + this.fromValue().typedIdentifier()
                + " to " + this.type;
    }

    @Override
    public IRBaseInst copy() {
        return new IRZextInst(fromValue(), type, null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
