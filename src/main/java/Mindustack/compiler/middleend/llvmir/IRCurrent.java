package Mindustack.compiler.middleend.llvmir;

import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.inst.IRBrInst;

import java.util.Stack;

public class IRCurrent {
    // break/continue support
    private final Stack<IRBlock> contTargetBlocks = new Stack<>(),
            breakTargetBlocks = new Stack<>();
    // current pointer
    public IRBlock block = null;
    public IRFunction func = null;

    public void terminateAllBlocks() {
        for (IRBlock block : this.func.blocks)
            if (!block.isTerminated) new IRBrInst(this.func.exitBlock, block);
    }

    public void loopSetKeywordTarget(IRBlock contTargetBlock, IRBlock breakTargetBlock) {
        contTargetBlocks.push(contTargetBlock);
        breakTargetBlocks.push(breakTargetBlock);
    }

    public void loopPopKeywordTarget() {
        contTargetBlocks.pop();
        breakTargetBlocks.pop();
    }

//    public void setControlBr(String controlWord) {
//        switch (controlWord) {
//            case MxStar.continueKw:
//                new IRBrInst(contTargetBlocks.peek(), block);
//                break;
//            case MxStar.breakKw:
//                new IRBrInst(breakTargetBlocks.peek(), block);
//                break;
//            default:
//                throw new InternalError(controlWord);
//        }
//    }

//    public Value getThis() {
//        if (null == null || this.func == null)
//            throw new InternalError("IR this appears in not in a class");
//        return this.func.getOperand(0);
//    }
}
