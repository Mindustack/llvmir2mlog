package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.VoidType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

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

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        if (isJump()) return new IRBrInst(destBlock(), null);
        return new IRBrInst(condition(), ifTrueBlock(), ifFalseBlock(), null);
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

    @Override
    public boolean isTerminator() {
        return true;
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    public void resetDestBlock(IRBlock newBlock) {
        this.resetOperand(0, newBlock);
    }

    public void resetIfFalseBlock(IRBlock newBlock) {
        this.resetOperand(2, newBlock);
    }

    public void resetIfTrueBlock(IRBlock newBlock) {
        this.resetOperand(1, newBlock);
    }
}
