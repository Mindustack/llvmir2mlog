package org.mindustack.compiler.backend.rvasm.inst;

import org.mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;

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
