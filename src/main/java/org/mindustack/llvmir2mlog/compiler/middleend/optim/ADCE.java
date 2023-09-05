package org.mindustack.llvmir2mlog.compiler.middleend.optim;

import org.mindustack.llvmir2mlog.compiler.middleend.analyzer.CFGBuilder;
import org.mindustack.llvmir2mlog.compiler.middleend.analyzer.DomTreeBuilder;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRBaseInst;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRBrInst;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRLoadInst;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst.IRPhiInst;
import org.mindustack.llvmir2mlog.compiler.share.pass.IRFuncPass;
import org.mindustack.llvmir2mlog.debug.Log;

import java.util.*;

/**
 * Aggressive Dead Code Elimination Pass
 * <p>
 * all instructions and blocks are marked dead at first
 * Notice: if a block is live, it's control dependencies are live
 * Control Dependence = DF of the postDomTree
 *
 * @requirement: DomTreeBuilder
 * @reference: LLVM project /lib/Transforms/Scalar/ADCE.cpp
 */

public class ADCE implements IRFuncPass {

    private final Queue<IRBaseInst> instWorklist = new LinkedList<>();

    private final Set<IRBaseInst> liveInst = new HashSet<>();
    private final Set<IRBlock> liveBlock = new HashSet<>();

    private List<IRBlock> getCD(IRBlock block) {
        return block.dtNode.domFrontier;
    }

    private void init(IRFunction function) {
        new CFGBuilder().runOnFunc(function);
        new DomTreeBuilder(true).runOnFunc(function);
        /*
        Log.mark("ADCE: " + function.identifier());

        function.blocks.forEach(block -> {
            if (block.dtNode.idom != null)
             Log.report("idom: ", block.identifier(), block.dtNode.idom.fromBlock.identifier());
        });
        function.blocks.forEach(block -> block.dtNode.domFrontier.forEach(
                df -> Log.report("df", block.identifier(), df.identifier())
        ));
        */
        for (IRBlock block : function.blocks)
            for (IRBaseInst inst : block.instructions)
                if (isAlwaysLive(inst)) markInstLive(inst);
    }

    private boolean isAlwaysLive(IRBaseInst inst) {
        // special for load inst
        return inst.mayHaveSideEffects() && !(inst instanceof IRLoadInst);
    }

    private void markBlockLive(IRBlock block) {
        if (!liveBlock.contains(block)) {
            liveBlock.add(block);
            for (IRBlock cd : getCD(block))
                markTerminator(cd);
        }
    }

    private void markInstLive(IRBaseInst inst) {
        if (!inst.moveDefs.isEmpty() && inst instanceof IRPhiInst) {
            inst.moveDefs.forEach(this::markInstLive);
        } else {
            if (!liveInst.contains(inst)) {
                liveInst.add(inst);
                instWorklist.offer(inst);
            }
        }
    }

    private void markTerminator(IRBlock block) {
        markInstLive(block.terminator());
    }

    @Override
    public void runOnFunc(IRFunction function) {
        Log.track("ADCE", function.identifier());

        init(function);

        while (!instWorklist.isEmpty()) {
            IRBaseInst inst = instWorklist.poll();

            // Log.info("working...", inst.format(), inst.parentBlock.identifier());

            markInstLive(inst);
            markBlockLive(inst.parentBlock);

            inst.operands.forEach(operand -> {
                if (operand instanceof IRBaseInst) {
                    markInstLive((IRBaseInst) operand);
                } else if (operand instanceof IRBlock) markTerminator((IRBlock) operand);
            });
        }

        for (IRBlock block : function.blocks) {
            var it = block.instructions.iterator();
            while (it.hasNext()) {
                var inst = it.next();
                if (!liveInst.contains(inst)) {
                    if (inst.isTerminator()) {
                        if (inst instanceof IRBrInst &&
                                !((IRBrInst) inst).isJump() &&
                                block.dtNode.idom != null) {
                            IRBlock newDest = block.dtNode.idom.fromBlock;
                            while (!liveBlock.contains(newDest)) newDest = newDest.dtNode.idom.fromBlock;
                            inst.removedFromAllUsers();
                            var newTerminator = new IRBrInst(newDest, null);
                            block.tReplaceTerminator(newTerminator);
                        }
                    } else {
                        inst.removedFromAllUsers();
                        it.remove();
                    }
                }
            }
        }
    }
}
