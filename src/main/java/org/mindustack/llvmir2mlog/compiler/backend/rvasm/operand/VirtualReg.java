package org.mindustack.llvmir2mlog.compiler.backend.rvasm.operand;

import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;

public class VirtualReg extends Register {

    public static int virtualRegNum = 0;
    public final int num, size;

    public VirtualReg() {
        super(MLOG.VirtualRegPrefix + virtualRegNum);
        this.num = virtualRegNum;
        this.size = 4;
        virtualRegNum++;
    }

    public VirtualReg(int size) {
        super(MLOG.VirtualRegPrefix + virtualRegNum);
        this.num = virtualRegNum;
        this.size = size;
        virtualRegNum++;
    }

    public static void regNumReset() {
        virtualRegNum = 0;
    }
}
