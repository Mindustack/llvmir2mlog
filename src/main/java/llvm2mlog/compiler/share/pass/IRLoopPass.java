package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.middleend.llvmir.hierarchy.Loop;

public interface IRLoopPass extends Pass {
    void runOnLoop(Loop loop);
}
