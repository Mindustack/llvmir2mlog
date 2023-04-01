package Mindustack.compiler.middleend.optim;

import Mindustack.compiler.middleend.analyzer.AliasAnalyzer;
import Mindustack.compiler.middleend.analyzer.CFGBuilder;
import Mindustack.compiler.middleend.analyzer.LoopAnalyzer;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.hierarchy.Loop;
import Mindustack.compiler.middleend.llvmir.inst.IRBaseInst;
import Mindustack.compiler.middleend.llvmir.inst.IRBrInst;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.IRFuncPass;
import Mindustack.compiler.share.pass.IRLoopPass;
import Mindustack.debug.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Loop Invariant Code Motion
 * <p>
 * fix: some strange problem
 */

public class LICM implements IRFuncPass, IRLoopPass {

    private final AliasAnalyzer analyzer = new AliasAnalyzer();
    private final HashSet<IRBaseInst> motionAble = new LinkedHashSet<>();

    @Override
    public void runOnFunc(IRFunction function) {
        Log.info("LICM", function.identifier());
        new CFGBuilder().runOnFunc(function);
        new LoopAnalyzer().runOnFunc(function);
        function.topLevelLoops.forEach(this::runOnLoop);
    }

    private void createPreHeader(Loop loop) {
        var preHeader = new IRBlock(LLVM.PreHeaderBlockLabel, loop.header.parentFunction);
        loop.preHeader = preHeader;
        ArrayList<IRBlock> headerPrevs = new ArrayList<>(loop.header.prevs);

        for (var pre : headerPrevs) {
            if (loop.tailers.contains(pre)) continue;
            // this block must be one?

            preHeader.prevs.add(pre);
            loop.header.prevs.remove(pre);

            pre.redirectSucBlock(loop.header, preHeader);
            loop.header.redirectPreBlock(pre, preHeader);
        }

        new IRBrInst(loop.header, preHeader);
        preHeader.nexts.add(loop.header);

        Loop curFa = loop.fatherLoop;
        while (curFa != null) {
            curFa.blocks.add(loop.preHeader);
            curFa = curFa.fatherLoop;
        }

        if (loop.header.parentFunction.entryBlock == loop.header)
            loop.header.parentFunction.entryBlock = preHeader;
    }

    private void collectMotionAble(Loop loop) {
        for (IRBlock block : loop.blocks)
            for (IRBaseInst inst : block.instructions)
                if (loop.isInstInvariant(inst, analyzer)) motionAble.add(inst);
    }

    private void motionInst(Loop loop) {
        for (IRBaseInst inst : motionAble) {
            // Log.info("motion: ", inst.format());

            inst.parentBlock.instructions.remove(inst);
            loop.preHeader.tAddBeforeTerminator(inst);
        }

        motionAble.clear();
    }

    @Override
    public void runOnLoop(Loop loop) {
        // motion children first
        loop.nestedLoops.forEach(this::runOnLoop);

        // Log.info("now run loop", loop.header.identifier());
        // loop.blocks.forEach(b -> Log.info(b.identifier()));

        createPreHeader(loop);
        while (true) {
            analyzer.runOnFunc(loop.header.parentFunction);
            collectMotionAble(loop);

            // Log.mark("motion able");
            // motionAble.forEach(i -> Log.info(i.format()));

            if (motionAble.isEmpty()) break;
            motionInst(loop);
        }
    }
}
