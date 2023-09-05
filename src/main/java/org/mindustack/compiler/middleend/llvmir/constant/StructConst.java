package org.mindustack.compiler.middleend.llvmir.constant;

import org.mindustack.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.compiler.middleend.llvmir.type.StructType;
import org.mindustack.compiler.share.lang.LLVM;

import java.util.ArrayList;


public class StructConst extends org.mindustack.compiler.middleend.llvmir.constant.BaseConst {
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
