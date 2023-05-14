package llvm2mlog.compiler.middleend.llvmir.constant;

import llvm2mlog.compiler.middleend.llvmir.Value;
import llvm2mlog.compiler.middleend.llvmir.type.IRBaseType;
import llvm2mlog.compiler.middleend.llvmir.type.PointerType;

public class GlobalVariable extends GlobalValue {

    // global var is a pointer

    // for constant replace
    public Value initValue;

    public int dimension = 0;

    public GlobalVariable(String name, IRBaseType type) {
        super(name, new PointerType(type));
    }

    public IRBaseType pointedType() {
        return ((PointerType) this.type).pointedType;
    }
}
