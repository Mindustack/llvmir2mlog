package masterball.compiler.backend.rvasm.inst;

import masterball.compiler.backend.rvasm.hierarchy.AsmBlock;
import masterball.compiler.backend.rvasm.operand.Register;
import masterball.compiler.share.lang.MLOG;

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
