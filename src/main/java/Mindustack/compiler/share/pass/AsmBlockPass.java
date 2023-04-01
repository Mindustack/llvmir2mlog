package Mindustack.compiler.share.pass;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;

public interface AsmBlockPass extends Pass {
    void runOnBlock(AsmBlock block);
}
