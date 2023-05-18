package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import llvm2mlog.compiler.middleend.rewrite.Rewriter;
import llvm2mlog.compiler.share.pass.InstVisitor;

public abstract class IRURWInst extends IRBaseInst {

    static String NAME = "UnReWritten";


    public IRURWInst() {
        super(NAME, null, null);

    }

    public IRURWInst addData(Value value) {
        this.operands.add(value);
        return this;
    }

    @Override
    public IRBaseInst copy() {
        return null;
    }

    @Override
    public void accept(InstVisitor visitor) {
    }

    public abstract void rewrite(Rewriter rewriter, int index, IRBlock curBlock, IRFunction curFunc);

}
