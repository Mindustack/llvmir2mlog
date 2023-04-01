package Mindustack.compiler.share.pass;

import Mindustack.compiler.middleend.llvmir.hierarchy.Loop;

public interface IRLoopPass extends Pass {
    void runOnLoop(Loop loop);
}
