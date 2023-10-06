package org.mindustack.llvmir2mlog.compiler.backend.mlog.operand;

public class GlobalReg extends VirtualReg {
//    public String stringConst;

    public GlobalReg(String identifier) {
        super();
        this.identifier = identifier;
    }

//    public GlobalReg(String identifier, String stringConst) {
//        super();
//         this.identifier = identifier;
//        this.stringConst = stringConst;
//    }

//    public String stringDataFormat() {
//        return stringConst.replace("\\", "\\\\")
//                .replace("\n", "\\n")
//                .replace("\0", "")
//                .replace("\t", "\\t")
//                .replace("\"", "\\\"");
//    }
}
