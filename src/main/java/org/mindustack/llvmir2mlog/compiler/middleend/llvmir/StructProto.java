package org.mindustack.llvmir2mlog.compiler.middleend.llvmir;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.StructType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;

public class StructProto extends Value {
    public StructProto(IRBaseType type) {
        super(LLVM.StructPrefix, type);
    }

    public StructType struct() {
        return (StructType) this.type;
    }
}
