package org.mindustack.llvmir2mlog.compiler.middleend.rewrite;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRBaseInst;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRURWInst;
import org.mindustack.llvmir2mlog.compiler.share.pass.IRBlockPass;
import org.mindustack.llvmir2mlog.compiler.share.pass.IRFuncPass;

import java.util.ArrayList;

public class Rewriter implements IRFuncPass, IRBlockPass {
    IRFunction curFunc;
    ArrayList<IRBlock> blocksToRemove = new ArrayList<>();

    public void remove(IRBlock irBlock) {
        blocksToRemove.add(irBlock);
    }
    public void remove(IRBaseInst inst){
        
    }

    @Override
    public void runOnFunc(IRFunction function) {
        curFunc = function;
        function.blocks.forEach(this::runOnBlock);
        function.blocks.removeAll(blocksToRemove);
    }

    @Override
    public void runOnBlock(IRBlock block) {
        blocksToRemove.clear();
        for (int i = 0; i < block.instructions.size(); i++) {
            var irBaseInst = block.instructions.get(i);
            if (irBaseInst instanceof IRURWInst) {
                ((IRURWInst) irBaseInst).rewrite(this, i, block, curFunc);
            }
        }


    }
}
