package org.mindustack.compiler.middleend.llvmir.inst;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.type.BoolType;
import org.mindustack.compiler.share.lang.LLVM;
import org.mindustack.compiler.share.pass.InstVisitor;

public class IRICmpInst extends IRBaseInst {
    public String op;

    public IRICmpInst(String op, Value lhs, Value rhs, IRBlock parentBlock) {
        super(LLVM.ICmpInst, new BoolType(), parentBlock);
        this.op = op;
        this.addOperand(lhs);
        this.addOperand(rhs);
    }

    public Value lhs() {
        return this.getOperand(0);
    }

    public Value rhs() {
        return this.getOperand(1);
    }

    public boolean forBr() {
        return this.users.size() == 1 && this.users.get(0) instanceof IRBrInst;
    }

    @Override
    public IRBaseInst copy() {
        return new IRICmpInst(op, lhs(), rhs(), null);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
