package masterball.compiler.middleend.llvmir.constant;

import masterball.compiler.middleend.llvmir.type.IRBaseType;
import masterball.compiler.middleend.llvmir.type.StructType;
import masterball.compiler.share.lang.LLVM;

import java.util.ArrayList;


public class StructConst extends BaseConst {
    public ArrayList<BaseConst> constData;

    public StructConst(IRBaseType type) {
        super(LLVM.ConstAnon, new StructType());
    }
}
