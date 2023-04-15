package Mindustack.compiler.middleend.llvmir.inst;

import Mindustack.compiler.middleend.llvmir.IRTranslator;
import Mindustack.compiler.middleend.llvmir.Value;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.share.lang.LLVM;
import Mindustack.compiler.share.pass.InstVisitor;

/*
 It is a fake instruction which can not be recognized by llc
 It is value itself is meaningless (void inst)
 created by SSADestructor
*/

public class IRMoveInst extends IRBaseInst {

    public IRMoveInst(Value dest, Value source, IRBlock parentBlock) {
        super(LLVM.MoveInst, IRTranslator.voidType, parentBlock);
        this.addOperand(dest);
        this.addOperand(source);

        dest.moveDefs.add(this);
    }

    public Value dest() {
        return this.getOperand(0);
    }

    public Value source() {
        return this.getOperand(1);
    }

    @Override
    public IRBaseInst copy() {
        return new IRMoveInst(dest(), source(), null);
    }

    @Override
    public boolean isValueSelf() {
        return false;
    }

    @Override
    public void accept(InstVisitor visitor) {
        visitor.visit(this);
    }
}
