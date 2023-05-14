package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;

public interface IRFuncPass extends Pass {
    void runOnFunc(IRFunction function);
}
