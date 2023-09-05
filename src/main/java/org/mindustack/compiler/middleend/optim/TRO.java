package org.mindustack.compiler.middleend.optim;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.compiler.middleend.llvmir.inst.IRBrInst;
import org.mindustack.compiler.middleend.llvmir.inst.IRCallInst;
import org.mindustack.compiler.middleend.llvmir.inst.IRMoveInst;
import org.mindustack.compiler.share.lang.LLVM;
import org.mindustack.compiler.share.pass.IRFuncPass;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Tail Recursion Optimization
 * <p>
 * 1. create a new entry (because we do not want sp back)
 * 2. move all arguments
 *
 * @requirement: do this after SSADestructor because it directly uses Move and does not consider Phi
 * and DO NOT run CFGSimplifier because it will merge new entry!
 */

public class TRO implements IRFuncPass {

    private IRBlock tailEntry = null;
    private ArrayList<Value> tparaList = null;

    @Override
    public void runOnFunc(IRFunction function) {
        var funcBlocks = new LinkedList<>(function.blocks);

        for (IRBlock block : funcBlocks) {
            var it = block.instructions.listIterator();
            IRCallInst trCall = null;

            while (it.hasNext()) {
                var inst = it.next();
                if (inst instanceof IRCallInst && ((IRCallInst) inst).isTailRecursive()) {
                    trCall = (IRCallInst) inst;
                    // if a tail call has only one pre, it must be endless dfs
                }

                if (trCall != null) it.remove();
                // after call, there will be two inst: move and jump
                // ignore the move (because it will do in tail call)
            }

            if (trCall != null) {
                if (tailEntry == null) {
                    tailEntry = function.entryBlock;
                    function.entryBlock = new IRBlock(LLVM.TRNewHeaderBlockLabel, function);

                    // reorder
                    function.blocks.remove(function.entryBlock);
                    function.blocks.addFirst(function.entryBlock);

                    new IRBrInst(tailEntry, function.entryBlock); // terminate it
                }

                if (tparaList == null) {
                    tparaList = new ArrayList<>();
                    for (int i = 0; i < function.getArgNum(); i++)
                        tparaList.add(new Value(LLVM.TParaReg, function.getArgType(i)));
                }

                for (int i = 0; i < trCall.callFunc().getArgNum(); i++) {
                    // why should we use tpara?
                    // consider func(a, b)
                    // move a, b
                    // move b, a
                    block.tAddLast(new IRMoveInst(tparaList.get(i), trCall.getArg(i), null));
                }

                for (int i = 0; i < trCall.callFunc().getArgNum(); i++)
                    block.tAddLast(new IRMoveInst(trCall.callFunc().getArg(i), tparaList.get(i), null));


                block.tAddLast(new IRBrInst(tailEntry, null));
            }
        }
    }
}
