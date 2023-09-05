package org.mindustack.compiler.middleend.llvmir.constant;

import org.mindustack.compiler.middleend.llvmir.type.IRBaseType;

public class GlobalValue extends BaseConst {
    public int gpRegMark = 0;

    public GlobalValue(String name, IRBaseType type) {
        super(name, type);
    }

    @Override
    public String identifier() {
        return "@" + this.name;
    }

    @Override
    public String toString() {
        return identifier();
    }
}
