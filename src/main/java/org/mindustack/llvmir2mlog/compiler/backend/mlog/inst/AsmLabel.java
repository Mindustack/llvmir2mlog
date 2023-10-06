package org.mindustack.llvmir2mlog.compiler.backend.mlog.inst;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;

public class AsmLabel extends AsmBaseInst {

    //    todo wtf
    private final String label;

    public AsmLabel(String label, AsmBlock parentBlock) {
        super(null, null, null, null, parentBlock);
        this.label = label;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmLabel(this.label, null);
    }

    @Override
    public String format() {
        return null;
    }
}
