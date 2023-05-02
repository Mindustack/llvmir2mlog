package Mindustack.compiler.backend.rvasm.inst;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.share.lang.MLOG;

public class AsmInlineCallInst extends AsmCallInst {
    public AsmInlineCallInst(AsmFunction callFunc, AsmBlock parentBlock, boolean isTailCall) {
        super(callFunc, parentBlock, isTailCall);
    }

    public String format() {

        return (String) MLOG.BuildinFunctionConfig.get(callFunc.identifier).get("code")

                ;
    }
}
