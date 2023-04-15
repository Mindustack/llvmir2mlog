package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;

public class AsmExplainInst extends AsmBaseInst {

    public static boolean ExplainShow = false;
    private final String info;

    public AsmExplainInst(String info, AsmBlock parentBlock) {

        super(null, null, null, null, parentBlock);
        if (!ExplainShow) parentBlock.instructions.remove(this);
        this.info = info;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmLabel(this.info, null);
    }

    @Override
    public String format() {
        return String.format("                              #%s", this.info);
    }
}
