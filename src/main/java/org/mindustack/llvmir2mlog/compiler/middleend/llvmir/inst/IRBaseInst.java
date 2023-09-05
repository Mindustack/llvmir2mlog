package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.inst;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.User;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.Value;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.share.pass.InstVisitor;

public abstract class IRBaseInst extends User {

    public IRBlock parentBlock;
    public String instName;

    public Object temp;

    public IRBaseInst(String name, IRBaseType type, IRBlock parentBlock) {
        super(name, type);
        setParentBlock(parentBlock);
    }

    public void setParentBlock(IRBlock parentBlock) {
        this.parentBlock = parentBlock;
        if (parentBlock != null) parentBlock.addInst(this);
    }

    public IRBaseInst(String name, IRBaseType type, IRBlock parentBlock, boolean frontInsert) {
        super(name, type);
        this.instName = name; // instName is the same with value name before rename
        setParentBlockAtHead(parentBlock);
    }

    public void setParentBlockAtHead(IRBlock parentBlock) {
        this.parentBlock = parentBlock;
        if (parentBlock != null) parentBlock.instructions.addFirst(this);
    }

    public abstract void accept(InstVisitor visitor);

    // copy method will create a copy of the original instruction
    // the parentBlock will be set "null"
    public abstract IRBaseInst copy();

    //    @Override
//    public String toString() {
//        return "IRBaseInst{" +
//                "parentBlock=" + parentBlock +
//                ", instContent='" + this.format() + '\'' +
//                '}';
//    }
//    String SourceInfo;

//    public void addSourceInfo(String source) {
//        SourceInfo = source;
//    }

    public boolean isTerminator() {
        return false;
    }

    public boolean isValueSelf() {
        return true;
    }

    public boolean mayHaveSideEffects() {
        return false;
    }

    // before an instruction removed/replaced, call it
    public void removedFromAllUsers() {
        for (Value value : operands) {
            if (value != null)
                value.users.remove(this);
        }
    }
}
