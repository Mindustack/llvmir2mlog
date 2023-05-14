package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmModule;

public interface AsmModulePass extends Pass {
    void runOnModule(AsmModule module);
}
