package org.mindustack.llvmir2mlog.compiler.backend.rvasm.inst;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.Immediate;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand.Register;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;

import java.util.Objects;

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

            return String.format("read %s %s %s"

                    , rd, MLOG.DefaultMemmory, rs1);
        }

        if (Objects.equals(rs1.toString(), "zero")) {

            return String.format("read %s %s %s",


                    //+ AsmTranslator.translateByteWidth(byteWidth)
                    rd, MLOG.DefaultMemmory, imm);
        } else {
            return String.format("op add b0 %s %s\n", imm, rs1) +

                    String.format("read %s %s b0",


                            //+ AsmTranslator.translateByteWidth(byteWidth)
                            rd, MLOG.DefaultMemmory);
        }

    }
}
