package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.User;
import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.share.pass.InstVisitor;

public abstract class IRBaseInst extends User {

    public IRBlock parentBlock;
    public String instName;

    public IRBaseInst(String name, IRBaseType type, IRBlock parentBlock) {
        super(name, type);
        setParentBlock(parentBlock);
    }

    public IRBaseInst(String name, IRBaseType type, IRBlock parentBlock, boolean frontInsert) {
        super(name, type);
        this.instName = name; // instName is the same with value name before rename
        setParentBlockAtHead(parentBlock);
    }

    public void setParentBlock(IRBlock parentBlock) {
        this.parentBlock = parentBlock;
        if (parentBlock != null) parentBlock.addInst(this);
    }

    public void setParentBlockAtHead(IRBlock parentBlock) {
        this.parentBlock = parentBlock;
        if (parentBlock != null) parentBlock.instructions.addFirst(this);
    }

    // before an instruction removed/replaced, call it
    public void removedFromAllUsers() {
        for (Value value : operands) {
            if (value != null)
                value.users.remove(this);
        }
    }

    public boolean mayHaveSideEffects() {
        return false;
    }

    //    @Override
//    public String toString() {
//        return "IRBaseInst{" +
//                "parentBlock=" + parentBlock +
//                ", instContent='" + this.format() + '\'' +
//                '}';
//    }
    String SourceInfo;

    public void addSourceInfo(String source) {
        SourceInfo = source;
    }


    public abstract String format();

    public boolean isTerminator() {
        return false;
    }

    public boolean isValueSelf() {
        return true;
    }

    // copy method will create a copy of the original instruction
    // the parentBlock will be set "null"
    public abstract IRBaseInst copy();

    public abstract void accept(InstVisitor visitor);
}
