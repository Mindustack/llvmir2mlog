package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmModule;

public interface AsmModulePass extends Pass {
    void runOnModule(AsmModule module);
}
