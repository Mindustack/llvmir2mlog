package org.mindustack.compiler.middleend.llvmir.type;

public class NumType extends IRBaseType {
    public final int bitWidth;

    public NumType() {
        this.bitWidth = 32;
    }

    public NumType(int bitWidth) {
        this.bitWidth = bitWidth;
    }

    @Override
    public boolean match(IRBaseType other) {
        return other instanceof NumType && ((NumType) other).bitWidth == bitWidth;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public String toString() {
        return "i" + 32
                //  bitWidth
                ;
    }
}
