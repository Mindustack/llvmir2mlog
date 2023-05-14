package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;

public interface IRBlockPass extends Pass {
    void runOnBlock(IRBlock block);
}
