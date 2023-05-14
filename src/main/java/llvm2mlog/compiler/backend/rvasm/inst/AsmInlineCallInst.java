package llvm2mlog.compiler.backend.rvasm.inst;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.share.lang.MLOG;

public class AsmInlineCallInst extends AsmCallInst {
    public AsmInlineCallInst(AsmFunction callFunc, AsmBlock parentBlock, boolean isTailCall) {
        super(callFunc, parentBlock, isTailCall);
    }

    public String format() {

        return (String) MLOG.BuildinFunctionConfig.get(callFunc.identifier).get("code")

                ;
    }
}
