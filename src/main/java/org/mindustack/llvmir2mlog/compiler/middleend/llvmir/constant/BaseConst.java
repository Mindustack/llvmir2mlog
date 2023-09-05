package org.mindustack.llvmir2mlog.compiler.middleend.llvmir.constant;

import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.User;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.type.IRBaseType;

public class BaseConst extends User {

    public BaseConst(String name, IRBaseType type) {
        super(name, type);
    }

    public int size() {
        return 1;
    }
}
