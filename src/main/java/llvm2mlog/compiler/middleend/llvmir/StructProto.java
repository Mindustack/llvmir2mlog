package llvm2mlog.compiler.middleend.llvmir;

import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.middleend.llvmir.type.StructType;
import llvm2mlog.compiler.share.lang.LLVM;

public class StructProto extends Value {
    public StructProto(IRBaseType type) {
        super(LLVM.StructPrefix, type);
    }

    public StructType struct() {
        return (StructType) this.type;
    }
}
