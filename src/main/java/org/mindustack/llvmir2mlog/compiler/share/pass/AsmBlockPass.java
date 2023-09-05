package org.mindustack.llvmir2mlog.compiler.share.pass;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;

public interface AsmBlockPass extends Pass {
    void runOnBlock(AsmBlock block);
}
