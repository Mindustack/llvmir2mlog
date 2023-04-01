package Mindustack.compiler.share.pass;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;

public interface IRFuncPass extends Pass {
    void runOnFunc(IRFunction function);
}
