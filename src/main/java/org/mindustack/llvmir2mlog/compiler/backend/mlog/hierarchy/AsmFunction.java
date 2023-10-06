package org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.BaseOperand;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;

import java.util.ArrayList;

public class AsmFunction extends BaseOperand {

    public final ArrayList<AsmBlock> blocks = new ArrayList<>();
    public final ArrayList<Register> arguments = new ArrayList<>();

    public AsmBlock entryBlock, exitBlock;


    public int callerArgStackUse = 0,
            allocaStackUse = 0,
            spillStackUse = 0,
            calleeArgStackUse = 0,
            totalStackUse = 0;

    public AsmFunction(String identifier) {
        super(identifier);
    }
}
