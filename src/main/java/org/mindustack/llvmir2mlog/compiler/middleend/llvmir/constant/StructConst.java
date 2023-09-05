package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.constant;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.StructType;
import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;

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
