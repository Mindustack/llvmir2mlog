package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.rewrite.Rewriter;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

public abstract class IRURWInst extends IRBaseInst {

    static String NAME = "UnReWritten";


    public IRURWInst() {
        super(NAME, null, null);

    }

    @Override
    public void accept(InstVisitor visitor) {
    }

    @Override
    public IRBaseInst copy() {
        return null;
    }

    public IRURWInst addData(Value value) {
        this.operands.add(value);
        return this;
    }

    public abstract void rewrite(Rewriter rewriter, int index, IRBlock curBlock, IRFunction curFunc);

}
