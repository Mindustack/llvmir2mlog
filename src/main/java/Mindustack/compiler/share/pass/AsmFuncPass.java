package Mindustack.compiler.share.pass;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;

public interface AsmFuncPass extends Pass {
    void runOnFunc(AsmFunction function);
}
