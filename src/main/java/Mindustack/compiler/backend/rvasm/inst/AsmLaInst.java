package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.operand.Register;
import Mindustack.compiler.share.lang.MLOG;

public class AsmLaInst extends AsmBaseInst {
    private final String symbol;

    public AsmLaInst(Register rd, String symbol, AsmBlock parentBlock) {
        super(rd, null, null, null, parentBlock);
        this.symbol = symbol;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmLaInst(rd, symbol, null);
    }

    @Override
    public String format() {
        // la rd, symbol
        return String.format("%s %s %s", MLOG.LaInst, rd, symbol);
    }
}
