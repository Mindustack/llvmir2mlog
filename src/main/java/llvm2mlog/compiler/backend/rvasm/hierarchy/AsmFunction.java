package llvm2mlog.compiler.backend.rvasm.hierarchy;

import llvm2mlog.compiler.backend.rvasm.operand.BaseOperand;
import llvm2mlog.compiler.backend.rvasm.operand.Register;

import java.util.ArrayList;

public class AsmFunction extends BaseOperand {

    public final ArrayList<AsmBlock> blocks = new ArrayList<>();
    public final ArrayList<Register> arguments = new ArrayList<>();

    public AsmBlock entryBlock, exitBlock;

    public boolean inline = false;

    public int callerArgStackUse = 0,
            allocaStackUse = 0,
            spillStackUse = 0,
            calleeArgStackUse = 0,
            totalStackUse = 0;

    public AsmFunction(String identifier) {
        super(identifier);
    }
}
