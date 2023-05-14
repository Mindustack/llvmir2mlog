package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRModule;

public interface IRModulePass extends Pass {
    void runOnModule(IRModule module);
}
