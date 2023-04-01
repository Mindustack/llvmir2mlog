package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.type.BoolType;
import Mindustack.compiler.share.lang.LLVM;

public class BoolConst extends BaseConst {
    public boolean constData;

    public BoolConst(boolean constData) {
        super(LLVM.ConstAnon, new BoolType());
        this.constData = constData;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof BoolConst && constData == ((BoolConst) o).constData;
    }

    @Override
    public String identifier() {
        return constData ? "true" : "false";
    }
}
