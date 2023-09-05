package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;

public interface AsmFuncPass extends Pass {
    void runOnFunc(AsmFunction function);
}
