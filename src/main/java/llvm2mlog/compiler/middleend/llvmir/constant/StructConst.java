package llvm2mlog.compiler.middleend.llvmir.constant;

import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.middleend.llvmir.type.StructType;
import llvm2mlog.compiler.share.lang.LLVM;

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
