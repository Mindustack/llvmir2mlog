package org.mindustack.compiler.backend.rvasm.inst;

import org.mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;

public class AsmJmpInst extends AsmBaseInst {
    public AsmBlock dest;

    public AsmJmpInst(AsmBlock dest, AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        this.dest = dest;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmJmpInst(dest, null);
    }

    @Override
    public String format() {
        // j offset
        return String.format("jump %s always", dest);
    }
}
