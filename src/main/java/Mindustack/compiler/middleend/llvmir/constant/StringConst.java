package Mindustack.compiler.middleend.llvmir.constant;

import Mindustack.compiler.middleend.llvmir.type.ArrayType;
import Mindustack.compiler.middleend.llvmir.type.NumType;
import Mindustack.compiler.middleend.llvmir.type.PointerType;
import Mindustack.compiler.share.lang.LLVM;

import java.util.Objects;

public class StringConst extends GlobalValue {

    public String constData;

    public StringConst(String constData) {
        super(LLVM.StrConstAnon,
                new PointerType(new ArrayType(new NumType(8), constData.length() + 1))
        );
        this.constData = constData;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof StringConst && Objects.equals(constData, ((StringConst) o).constData);
    }


    public String constDataFormat() {
        return "c\"" +
                constData.replace("\\", "\\5C")
                        .replace("\n", "\\0A")
                        .replace("\0", "\\00")
                        .replace("\t", "\\09")
                        .replace("\"", "\\22")
                + "\\00\"";
    }
}
