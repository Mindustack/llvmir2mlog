package org.mindustack.llvmir2mlog.compiler.backend.mlog.operand;

public class RawMemOffset extends Immediate {
    public Register pointer;

    public RawMemOffset(Register pointer, int offset) {
        super(offset);
        this.pointer = pointer;
    }
}
