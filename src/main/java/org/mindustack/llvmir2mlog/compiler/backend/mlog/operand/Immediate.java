package org.mindustack.llvmir2mlog.compiler.backend.mlog.operand;

public class Immediate extends BaseOperand {
    public int value;

    public Immediate(int value) {
        super(String.valueOf(value));
        this.value = value;
    }

    // for Global Addr
    protected Immediate(String identifier) {
        super(identifier);
        this.value = 0;
    }

    public Immediate negative() {
        return new Immediate(-value);
    }
}
