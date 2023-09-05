package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRFuncType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

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

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public IRBaseInst copy() {
        ArrayList<Value> args = new ArrayList<Value>();
        for (int i = 0; i < this.callFunc().getArgNum(); i++)
            args.add(getArg(i));
        return new IRCallInst(callFunc(), null, args);
    }

    // noalias is for LLVM IR "noalias" keyword

    public Value getArg(int index) {
        return this.getOperand(index + 1);
    }

    @Override
    public boolean isValueSelf() {
        return !callFunc().isVoid();
    }

    public IRFunction callFunc() {
        return (IRFunction) this.getOperand(0);
    }

    @Override
    public boolean mayHaveSideEffects() {
        return true;
    }

    public boolean isTailRecursive() {
        //    return false;
        return isTailCall && callFunc() == this.parentBlock.parentFunction;
    }

    public IRCallInst noalias() {
        noaliasFlag = true;
        return this;
    }
}
