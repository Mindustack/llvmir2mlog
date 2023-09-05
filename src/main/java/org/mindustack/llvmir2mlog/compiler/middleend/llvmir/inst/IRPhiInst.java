package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.share.error.codegen.InternalError;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

// number of PhiInst operands must be even

public class IRPhiInst extends IRBaseInst {

    public IRPhiInst(IRBaseType yieldType, IRBlock parentBlock, Value... operands) {
        super(LLVM.PhiInst, yieldType, parentBlock);

        for (Value operand : operands) this.addOperand(operand);

        if (operands.length % 2 != 0) throw new InternalError("invalid Phi operands num");
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        IRPhiInst ret = new IRPhiInst(type, null);
        for (int i = 0; i < this.operandSize(); i += 2)
            ret.addBranch(this.getOperand(i), (IRBlock) this.getOperand(i + 1));
        return ret;
    }

    public void addBranch(Value branchData, IRBlock preBlock) {
        this.addOperand(branchData);
        this.addOperand(preBlock);
    }
}
