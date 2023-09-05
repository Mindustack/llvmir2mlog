package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.constant;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.NumType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;

public class NumConst extends BaseConst {
    private int constData;

    public NumConst(int constData) {
        super(LLVM.ConstAnon, new NumType());
        this.setConstData(constData);
    }

    public NumConst(int constData, int bitWidth) {
        super(LLVM.ConstAnon, new NumType(bitWidth));
        this.setConstData(constData);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NumConst && getConstData() == ((NumConst) o).getConstData();
    }

    public int getConstData() {
        return constData;
    }

    public void setConstData(int constData) {
        this.constData = constData;
    }

    @Override
    public String toString() {
        return super.identifier();
    }

    // constant identifier: simply a number
    @Override
    public String identifier() {
        return String.valueOf(getConstData());
    }
}
