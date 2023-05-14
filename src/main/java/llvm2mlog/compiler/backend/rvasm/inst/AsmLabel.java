package llvm2mlog.compiler.backend.rvasm.inst;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;

public class AsmLabel extends AsmBaseInst {

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
        return String.format("%s:", this.label);
    }
}
