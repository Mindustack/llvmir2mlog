package Mindustack.compiler.share.pass;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;

public interface IRModulePass extends Pass {
    void runOnModule(IRModule module);
}
