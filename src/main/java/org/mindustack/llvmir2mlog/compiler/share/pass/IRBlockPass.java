package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;

public interface IRBlockPass extends Pass {
    void runOnBlock(IRBlock block);
}
