package Mindustack.compiler.share.pass;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;

public interface IRBlockPass extends Pass {
    void runOnBlock(IRBlock block);
}
