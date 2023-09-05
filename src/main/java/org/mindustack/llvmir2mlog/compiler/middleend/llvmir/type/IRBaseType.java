package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type;

public abstract class IRBaseType {

    abstract public boolean match(IRBaseType other);

    public void setName(String name) {

    }

    abstract public int size(); // byte

    @Override
    abstract public String toString();
}
