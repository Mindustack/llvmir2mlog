package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.User;
import Mindustack.compiler.middleend.llvmir.type.IRBaseType;

public class BaseConst extends User {

    public BaseConst(String name, IRBaseType type) {
        super(name, type);
    }
}
