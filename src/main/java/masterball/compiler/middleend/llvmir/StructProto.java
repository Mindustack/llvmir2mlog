package masterball.compiler.middleend.llvmir;

import masterball.compiler.middleend.llvmir.type.IRBaseType;
import masterball.compiler.middleend.llvmir.type.StructType;
import masterball.compiler.share.lang.LLVM;

public class StructProto extends Value {
    public StructProto(IRBaseType type) {
        super(LLVM.StructPrefix, type);
    }

    public StructType struct() {
        return (StructType) this.type;
    }
}
