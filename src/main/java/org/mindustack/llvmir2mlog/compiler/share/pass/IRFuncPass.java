package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;

public interface IRFuncPass extends Pass {
    void runOnFunc(IRFunction function);
}
