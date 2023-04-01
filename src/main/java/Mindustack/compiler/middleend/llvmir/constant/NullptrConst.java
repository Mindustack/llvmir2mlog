package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.IRTranslator;
import Mindustack.compiler.share.lang.LLVM;

public class NullptrConst extends BaseConst {
    public NullptrConst() {
        super(LLVM.ConstAnon, IRTranslator.nullType);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof NullptrConst;
    }

    @Override
    public String identifier() {
        return LLVM.Nullptr;
    }
}
