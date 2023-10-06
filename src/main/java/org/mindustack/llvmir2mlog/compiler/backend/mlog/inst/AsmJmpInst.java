package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;

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
