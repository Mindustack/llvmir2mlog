package org.mindustack.compiler.middleend.llvmir.constant;

import org.mindustack.compiler.middleend.llvmir.IRTranslator;
import org.mindustack.compiler.share.lang.LLVM;

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
