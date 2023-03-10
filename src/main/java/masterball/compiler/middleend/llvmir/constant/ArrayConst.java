package masterball.compiler.middleend.llvmir.constant;

import masterball.compiler.middleend.llvmir.type.ArrayType;
import masterball.compiler.middleend.llvmir.type.IRBaseType;
import masterball.compiler.share.lang.LLVM;

import java.util.ArrayList;

public class ArrayConst extends BaseConst {
    public ArrayList<BaseConst> constData;

    public ArrayConst(IRBaseType type, int length) {
        super(LLVM.ConstAnon, new ArrayType(type, length));
    }
}
