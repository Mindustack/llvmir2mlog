package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;

public interface AsmFuncPass extends Pass {
    void runOnFunc(AsmFunction function);
}
