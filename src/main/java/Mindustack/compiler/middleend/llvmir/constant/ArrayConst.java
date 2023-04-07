package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.type.ArrayType;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.share.lang.LLVM;

import java.util.ArrayList;

public class ArrayConst extends BaseConst {
    public ArrayList<BaseConst> constData;

    public ArrayConst(IRBaseType type, int length) {
        super(LLVM.ConstAnon, new ArrayType(type, length));
        constData = new ArrayList<>();
    }
}
