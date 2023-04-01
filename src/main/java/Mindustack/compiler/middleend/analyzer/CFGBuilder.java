package Mindustack.compiler.middleend.analyzer;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.inst.IRBrInst;
import Mindustack.compiler.share.pass.IRFuncPass;

public class CFGBuilder implements IRFuncPass {

    private void init(IRFunction function) {
        for (IRBlock block : function.blocks) {
            block.prevs.clear();
            block.nexts.clear();
        }
    }

    @Override
    public void runOnFunc(IRFunction function) {
        init(function);

        for (IRBlock block : function.blocks) {
            var terminator = block.terminator();
            if (terminator instanceof IRBrInst) {
                if (((IRBrInst) terminator).isJump()) {
                    block.linkBlock(((IRBrInst) terminator).destBlock());
                } else {
                    block.linkBlock(((IRBrInst) terminator).ifTrueBlock());
                    block.linkBlock(((IRBrInst) terminator).ifFalseBlock());
                }
            }
        }
    }
}
