package Mindustack.compiler.share.pass;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;

public interface AsmModulePass extends Pass {
    void runOnModule(AsmModule module);
}
