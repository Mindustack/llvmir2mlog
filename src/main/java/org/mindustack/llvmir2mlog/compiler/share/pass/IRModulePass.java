package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRModule;

public interface IRModulePass extends Pass {
    void runOnModule(IRModule module);
}
