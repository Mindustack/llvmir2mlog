package Mindustack.compiler.middleend.llvmir.type;

public class LabelType extends IRBaseType {
    @Override
    public boolean match(IRBaseType other) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "label";
    }
}
