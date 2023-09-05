package org.mindustack.llvmir2mlog.compiler.backend.optim;

import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.hierarchy.AsmModule;
import org.mindustack.llvmir2mlog.compiler.share.pass.AsmModulePass;

public class BackEndOptimizer implements AsmModulePass {
    @Override
    public void runOnModule(AsmModule module) {
        for (AsmFunction function : module.functions) {
            //new TCO().runOnFunc(function); todo not mature

            new CoalesceMoves().runOnFunc(function);
            new ZeroInstPeephole().runOnFunc(function);
            new BlockMerge().runOnFunc(function);
            new ReorderBlock().runOnFunc(function);
            new RedundantInst().runOnFunc(function);
            new LoadStorePeephole().runOnFunc(function);
        }
    }
}
