package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.type.BoolType;
import llvm2mlog.compiler.share.lang.LLVM;
import llvm2mlog.compiler.share.pass.InstVisitor;

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
