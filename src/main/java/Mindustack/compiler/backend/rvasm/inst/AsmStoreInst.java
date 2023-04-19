package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.operand.Immediate;
import Mindustack.compiler.backend.rvasm.operand.Register;
import Mindustack.compiler.share.lang.MLOG;

public class AsmStoreInst extends AsmBaseInst {
    private int byteWidth = 1;

    public AsmStoreInst(Register adr, Register rs2, Immediate imm, AsmBlock parentBlock) {
        super(null, adr, rs2, imm, parentBlock);
        // System.out.println(rs1);
        this.byteWidth = byteWidth;
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmStoreInst(rs1, rs2, imm, null);
    }

    @Override
    public String format() {
        // sw rs2, offset(rs1)

        if (imm.value == 0) {

            return String.format("%s %s cell %s",
                    MLOG.StoreInstPrefix
                    , rs2, rs1);
        }


        return String.format("op add tf %s %s\n", imm, rs1) +
                String.format("\t%s %s cell tf",
                        MLOG.StoreInstPrefix
                        //  + AsmTranslator.translateByteWidth(byteWidth)
                        , rs2);
    }
}
