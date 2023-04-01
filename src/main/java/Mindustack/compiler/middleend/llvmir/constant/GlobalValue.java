package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.type.IRBaseType;

public class GlobalValue extends BaseConst {
    public boolean gpRegMark = false;

    public GlobalValue(String name, IRBaseType type) {
        super(name, type);
    }

    @Override
    public String identifier() {
        return "@" + this.name;
    }
}
