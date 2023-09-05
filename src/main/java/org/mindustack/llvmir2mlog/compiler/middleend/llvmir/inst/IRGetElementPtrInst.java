package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.PointerType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

import java.util.ArrayList;

public class IRGetElementPtrInst extends IRBaseInst {

    public IRBaseType SourseType;
    /**
     * headPointer is the field (struct* or a pointer)
     * yieldType / retType is the type of the result
     * hint: move ptr: getelement i32, i32* ptr %a, i32 offset
     */

    private String elementName = null;

    public IRGetElementPtrInst(String elementName, Value headPointer, IRBaseType yieldType, IRBlock parentBlock, Value... indices) {
        super(addrRename(elementName), yieldType, parentBlock);
        assert headPointer.type instanceof PointerType;
        this.addOperand(headPointer);
        for (Value index : indices) this.addOperand(index);

        this.elementName = elementName;
    }

    public IRGetElementPtrInst(Value headPointer, IRBaseType yieldType, IRBlock parentBlock, Value... indices) {
        super(LLVM.GetElementPtrInst, yieldType, parentBlock);
        assert headPointer.type instanceof PointerType;
        this.addOperand(headPointer);
        for (Value index : indices) this.addOperand(index);
    }

    public IRGetElementPtrInst(Value headPointer, IRBaseType yieldType, IRBlock parentBlock, ArrayList<Value> indices) {
        super(LLVM.GetElementPtrInst, yieldType, parentBlock);
        assert headPointer.type instanceof PointerType;
        this.addOperand(headPointer);
        for (Value index : indices) this.addOperand(index);
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }

    // GetElementPtr: indices 1 or 2
    @Override
    public IRBaseInst copy() {//todo
        IRGetElementPtrInst irGetElementPtrInst;
        if (elementName == null) {
            if (indicesNum() == 1) {
                irGetElementPtrInst = new IRGetElementPtrInst(headPointer(), type, null, getIndex(0));

                //return irGetElementPtrInst1;
            } else {
                assert indicesNum() == 2;
                irGetElementPtrInst = new IRGetElementPtrInst(headPointer(), type, null, getIndex(0), getIndex(1));
                //return irGetElementPtrInst;
            }
        } else {
            if (indicesNum() == 1) {
                irGetElementPtrInst = new IRGetElementPtrInst(elementName, headPointer(), type, null, getIndex(0));
//                return irGetElementPtrInst1;
            } else {
                assert indicesNum() == 2;
                irGetElementPtrInst = new IRGetElementPtrInst(elementName, headPointer(), type, null, getIndex(0), getIndex(1));

            }
        }
//        irGetElementPtrInst.addSourceInfo(this.SourceInfo);
        irGetElementPtrInst.SourseType = SourseType;
        return irGetElementPtrInst;
    }

    public int indicesNum() {
        return this.operandSize() - 1;
    }

    public Value headPointer() {
        return this.getOperand(0);
    }

//    public Value memberIndex() {
//        return this.getIndex(1);
//    }

    public Value ptrMoveIndex() {
        return this.getIndex(0);
    }

    public Value getIndex(int pos) {
        return this.getOperand(pos + 1);
    }

//    public void setSourseType(IRBaseType type) {
//        this.setSourseType=type;
//    }
}
