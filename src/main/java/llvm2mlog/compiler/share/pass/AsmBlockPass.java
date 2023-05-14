package llvm2mlog.compiler.share.pass;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;

public interface AsmBlockPass extends Pass {
    void runOnBlock(AsmBlock block);
}
