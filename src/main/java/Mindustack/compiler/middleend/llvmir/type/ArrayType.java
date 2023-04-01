package Mindustack.compiler.middleend.llvmir.type;

// ArrayType in LLVM IR
// only use it to implement string          NO!!!!!!!!!!!!!!!!!!!!!!!!!!!!
// Array in MxStar is compiled to Pointer.

import Mindustack.compiler.middleend.llvmir.ArrayProto;
import Mindustack.compiler.middleend.llvmir.Value;

import java.util.ArrayList;

public class ArrayType extends IRBaseType {
    public IRBaseType elementType;
    public int length;

    public final ArrayProto arrayProto;
    public ArrayList<Value> elements = new ArrayList<Value>();

    public ArrayType(IRBaseType elementType, int length) {
        this.elementType = elementType;
        this.length = length;
        this.arrayProto = new ArrayProto(elementType);
        this.elements = new ArrayList<Value>();
    }

    @Override
    public boolean match(IRBaseType other) {
        return false;
    }

    // align size
    @Override
    public int size() {
        return elementType.size() * length;
    }

    @Override
    public String toString() {
        return "[" + length + " x " + elementType + "]";
    }
}
