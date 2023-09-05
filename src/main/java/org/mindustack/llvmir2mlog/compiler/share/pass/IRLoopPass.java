package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.Loop;

public interface IRLoopPass extends Pass {
    void runOnLoop(Loop loop);
}
