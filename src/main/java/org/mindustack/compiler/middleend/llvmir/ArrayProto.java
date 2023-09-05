package org.mindustack.compiler.middleend.llvmir;

import org.mindustack.compiler.middleend.llvmir.type.IRBaseType;

public class ArrayProto extends Value {
    public ArrayProto(IRBaseType type) {
        super(type);
    }

    public ArrayProto(String name, IRBaseType type) {
        super(name, type);
    }
}
