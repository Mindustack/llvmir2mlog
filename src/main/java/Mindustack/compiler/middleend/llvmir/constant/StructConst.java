package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.type.IRBaseType;
import Mindustack.compiler.middleend.llvmir.type.StructType;
import Mindustack.compiler.share.lang.LLVM;

import java.util.ArrayList;


public class StructConst extends BaseConst {
    public ArrayList<BaseConst> constData;

    public StructConst(IRBaseType type) {
        // constData=new ArrayList<>();
        super(LLVM.ConstAnon, new StructType());

        constData = new ArrayList<>();
    }

    public int size() {
        return this.type.size();
    }
}
