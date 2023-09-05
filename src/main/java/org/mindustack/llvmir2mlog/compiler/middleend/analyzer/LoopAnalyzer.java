package org.mindustack.llvmir2mlog.compiler.middleend.analyzer;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.Loop;
import org.mindustack.llvmir2mlog.compiler.share.misc.Pair;
import org.mindustack.llvmir2mlog.compiler.share.pass.IRFuncPass;
import org.mindustack.llvmir2mlog.debug.Log;

import java.util.*;

public class LoopAnalyzer implements IRFuncPass {

    // <head, tail>
    private final Map<IRBlock, Loop> headToLoopMap = new HashMap<>();
    private final ArrayList<Pair<IRBlock, IRBlock>> backEdge = new ArrayList<>();
    private final Stack<Loop> loopStack = new Stack<>();
    private final HashSet<IRBlock> visited = new HashSet<>();

    private void buildLoopNestTree(IRFunction function, IRBlock block) {
        if (visited.contains(block)) return;
        visited.add(block);

        // Log.info("build", block.identifier());

        // filter the inner loop
        Loop outerLoop = null;
        if (!loopStack.empty()) {
            outerLoop = loopStack.peek();
            while (!outerLoop.blocks.contains(block)) {
                loopStack.pop();
                if (loopStack.empty()) {
                    outerLoop = null;
                    break;
                }
                outerLoop = loopStack.peek();
            }
        }

        if (headToLoopMap.containsKey(block)) {
            var nowLoop = headToLoopMap.get(block);
            if (outerLoop != null) {
                outerLoop.addNestedLoop(nowLoop);
            } else {
                function.topLevelLoops.add(nowLoop);
            }
            loopStack.push(nowLoop);
        }

        block.loopDepth = loopStack.size();

        for (IRBlock suc : block.nexts) buildLoopNestTree(function, suc);
    }

    private void buildNaturalLoop(IRBlock edgeHead, IRBlock edgeTail) {
        headToLoopMap.putIfAbsent(edgeHead, new Loop(edgeHead));
        headToLoopMap.get(edgeHead).tailers.add(edgeTail);
        headToLoopMap.get(edgeHead).addBlock(edgeHead);
        headToLoopMap.get(edgeHead).addBlock(edgeTail);

        Queue<IRBlock> workQueue = new LinkedList<>();
        workQueue.offer(edgeTail);

        while (!workQueue.isEmpty()) {
            IRBlock nowBlock = workQueue.poll();
            for (IRBlock pre : nowBlock.prevs)
                if (!headToLoopMap.get(edgeHead).blocks.contains(pre)) {
                    headToLoopMap.get(edgeHead).addBlock(pre);
                    workQueue.offer(pre);
                }
        }
    }

    private void collectBackEdge(IRFunction function) {
        for (IRBlock block : function.blocks) {
            for (IRBlock suc : block.nexts) {
                if (block.dtNode.doms.contains(suc.dtNode)) {
                    backEdge.add(new Pair<>(suc, block));
                    break;
                }
            }
        }
    }

    private void init(IRFunction function) {
        new CFGBuilder().runOnFunc(function);
        new DomTreeBuilder(false).runOnFunc(function);
        function.topLevelLoops.clear();
        function.blocks.forEach(block -> {
            block.loopDepth = 0;
            block.belongLoop = null;
        });
    }

    @Override
    public void runOnFunc(IRFunction function) {
        Log.track("loop analyse", function.identifier());

        init(function);

        collectBackEdge(function);

        backEdge.forEach(edge -> buildNaturalLoop(edge.first(), edge.second()));
        buildLoopNestTree(function, function.entryBlock);

        // backEdge.forEach(edge -> Log.info("back edge", edge.first().identifier(), edge.second().identifier()));

        /*
        function.blocks.forEach(block -> {
            Log.info("depth", block.identifier(), block.loopDepth);
        });
        */
    }
}