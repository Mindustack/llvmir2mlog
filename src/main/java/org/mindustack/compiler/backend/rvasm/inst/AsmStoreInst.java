package org.mindustack.compiler.backend.rvasm.inst;

import org.mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.compiler.backend.rvasm.operand.Immediate;
import org.mindustack.compiler.backend.rvasm.operand.Register;
import org.mindustack.compiler.share.lang.MLOG;

import java.util.Objects;

public class AsmStoreInst extends AsmBaseInst {

    public AsmStoreInst(Register adr, Register rs2, Immediate imm, AsmBlock parentBlock) {
        super(null, adr, rs2, imm, parentBlock);
        // System.out.println(rs1);
    }

    @Override
    public AsmBaseInst copy() {
        return new AsmStoreInst(rs1, rs2, imm, null);
    }

    @Override
    public String format() {
        // sw rs2, offset(rs1)

        if (imm.value == 0) {

            return String.format("write %s %s %s"

                    , rs2, MLOG.DefaultMemmory, rs1);
        }
        if (Objects.equals(rs1.toString(), "zero")) {

            return String.format("write %s %s %s"


                    //+ AsmTranslator.translateByteWidth(byteWidth)
                    , rd, MLOG.DefaultMemmory, imm);
        } else {
            return String.format("op add b0 %s %s\n", imm, rs1) +
                    String.format("write %s %s b0"

                            //  + AsmTranslator.translateByteWidth(byteWidth)
                            , rs2, MLOG.DefaultMemmory);
        }


    }
}
