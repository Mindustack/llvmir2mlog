package masterball.compiler.middleend.llvmir.constant;

import masterball.compiler.middleend.llvmir.type.NumType;
import masterball.compiler.share.lang.LLVM;

public class NumConst extends BaseConst {
    public int constData;

    public NumConst(int constData) {
        super(LLVM.ConstAnon, new NumType());
        this.constData = constData;
    }

    public NumConst(int constData, int bitWidth) {
        super(LLVM.ConstAnon, new NumType(bitWidth));
        this.constData = constData;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NumConst && constData == ((NumConst) o).constData;
    }

    // constant identifier: simply a number
    @Override
    public String identifier() {
        return String.valueOf(constData);
    }
}
