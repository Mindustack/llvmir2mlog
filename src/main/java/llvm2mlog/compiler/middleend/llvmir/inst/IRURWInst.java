package llvm2mlog.compiler.middleend.llvmir.inst;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.share.pass.InstVisitor;

public class IRURWInst extends IRBaseInst {

    static String NAME = "UnReWritten";
    InstType instType;

    public IRURWInst(InstType instType, IRBaseType type, IRBlock parentBlock) {
        super(NAME, type, parentBlock);
        this.instType = instType;
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

        //todo
    }

    public enum InstType {
        SelectInst
    }
}
