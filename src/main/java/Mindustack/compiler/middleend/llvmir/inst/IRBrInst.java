package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.VoidType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

public class IRBrInst extends IRBaseInst {
    public IRBrInst(IRBlock destBlock, IRBlock parentBlock) {
        super(LLVM.BrInst, new VoidType(), parentBlock);
        this.addOperand(destBlock);
    }

    public IRBrInst(Value condition, IRBlock ifTrueBlock, IRBlock ifFalseBlock, IRBlock parentBlock) {
        super(LLVM.BrInst, new VoidType(), parentBlock);
        this.addOperand(condition);
        this.addOperand(ifTrueBlock);
        this.addOperand(ifFalseBlock);
    }

    public boolean isJump() {
        return this.operandSize() == 1;
    }

    public IRBlock destBlock() {
        assert isJump();
        return (IRBlock) this.getOperand(0);
    }

    public Value condition() {
        assert !isJump();
        return this.getOperand(0);
    }

    public IRBlock ifTrueBlock() {
        return (IRBlock) this.getOperand(1);
    }

    public IRBlock ifFalseBlock() {
        return (IRBlock) this.getOperand(2);
    }

    public void resetDestBlock(IRBlock newBlock) {
        this.resetOperand(0, newBlock);
    }

    public void resetIfTrueBlock(IRBlock newBlock) {
        this.resetOperand(1, newBlock);
    }

    public void resetIfFalseBlock(IRBlock newBlock) {
        this.resetOperand(2, newBlock);
    }

    @Override
    public boolean isTerminator() {
        return true;
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    @Override
    public IRBaseInst copy() {
        if (isJump()) return new IRBrInst(destBlock(), null);
        return new IRBrInst(condition(), ifTrueBlock(), ifFalseBlock(), null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
