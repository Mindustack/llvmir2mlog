package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.type.IRFuncType;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

import java.util.ArrayList;

public class IRCallInst extends IRBaseInst {

    public boolean isTailCall = false;
    private boolean noaliasFlag = false;

    public IRCallInst(IRFunction callFunc, IRBlock parentBlock, ArrayList<Value> callArgs) {
        super(callFunc.name + LLVM.CallSuffix,
                ((IRFuncType) callFunc.type).retType,
                parentBlock);
        this.addOperand(callFunc);
        for (int i = 0; i < callArgs.size(); i++) this.addOperand(callArgs.get(i));
    }

    public IRCallInst(IRFunction callFunc, IRBlock parentBlock, Value... callArgs) {
        super(callFunc.name + LLVM.CallSuffix,
                ((IRFuncType) callFunc.type).retType,
                parentBlock);
        this.addOperand(callFunc);
        for (Value arg : callArgs) this.addOperand(arg);
    }

    public IRFunction callFunc() {
        return (IRFunction) this.getOperand(0);
    }

    public Value getArg(int index) {
        return this.getOperand(index + 1);
    }

    // noalias is for LLVM IR "noalias" keyword

    public IRCallInst noalias() {
        noaliasFlag = true;
        return this;
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    @Override
    public boolean isValueSelf() {
        return !callFunc().isVoid();
    }

    public boolean isTailRecursive() {
        //    return false;
        return isTailCall && callFunc() == this.parentBlock.parentFunction;
    }

    @Override
    public IRBaseInst copy() {
        ArrayList<Value> args = new ArrayList<Value>();
        for (int i = 0; i < this.callFunc().getArgNum(); i++)
            args.add(getArg(i));
        return new IRCallInst(callFunc(), null, args);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
