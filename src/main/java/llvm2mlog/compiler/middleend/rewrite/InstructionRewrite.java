package llvm2mlog.compiler.middleend.rewrite;

import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import llvm2mlog.compiler.share.pass.IRBlockPass;
import llvm2mlog.compiler.share.pass.IRFuncPass;

public class InstructionRewrite implements IRFuncPass, IRBlockPass {
    @Override
    public void runOnFunc(IRFunction function) {

        function.blocks.forEach(this::runOnBlock);
    }

    @Override
    public void runOnBlock(IRBlock block) {


    }
}
