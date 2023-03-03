package masterball.compiler.backend.rvasm.inst;

import masterball.compiler.backend.rvasm.hierarchy.AsmBlock;
import masterball.compiler.backend.rvasm.operand.Immediate;
import masterball.compiler.backend.rvasm.operand.Register;
import masterball.compiler.share.lang.RV32I;

public class AsmLoadInst extends AsmBaseInst {
    private final int byteWidth;

    public AsmLoadInst(int byteWidth, Register rd, Register rs1, Immediate imm, AsmBlock parentBlock) {
        super(rd, rs1, null, imm, parentBlock);
        this.byteWidth = byteWidth;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmLoadInst(byteWidth, rd, rs1, imm, null);
    }

    @Override
    public String format() {
        // lw rd, offset(rs1)
        //yes it is
        if (imm.value == 0) {

            return String.format("%s %s cell %s",
                    RV32I.LoadInstPrefix
                    , rd, rs1);
        }
        return String.format("op add %s %s %s\n", rs1, imm, rs1) +
                String.format("%s %s cell %s",
                        RV32I.LoadInstPrefix
                        //+ AsmTranslator.translateByteWidth(byteWidth)
                        , rd, rs1);
    }
}
