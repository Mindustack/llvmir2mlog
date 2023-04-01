package Mindustack.compiler.middleend.llvmir;

import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.middleend.llvmir.type.StructType;
import Mindustack.compiler.share.lang.LLVM;

public class StructProto extends Value {
    public StructProto(IRBaseType type) {
        super(LLVM.StructPrefix, type);
    }

    public StructType struct() {
        return (StructType) this.type;
    }
}
