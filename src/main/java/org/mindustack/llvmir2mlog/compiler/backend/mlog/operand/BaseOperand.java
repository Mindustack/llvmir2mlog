package org.mindustack.llvmir2mlog.compiler.backend.mlog.operand;

public abstract class BaseOperand {
    public String identifier;

    public BaseOperand(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
