package org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.inst.AsmBaseInst;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.BaseOperand;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.Register;
import org.mindustack.llvmir2mlog.compiler.share.error.codegen.InternalError;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AsmBlock extends BaseOperand {

    public LinkedList<AsmBaseInst> instructions = new LinkedList<>();

    // control flow graph
    public ArrayList<AsmBlock> prevs = new ArrayList<>(), nexts = new ArrayList<>();

    // liveIn and LiveOut in block, assigned in LivenessAnalyzer
    public HashSet<Register> liveIn = new HashSet<>(), liveOut = new HashSet<>();

    // from IRBlock
    public int loopDepth = 0;

    public AsmBlock(String label) {
        super(label);
    }

    public void addInst(AsmBaseInst inst) {
        instructions.add(inst);
    }

    public AsmBaseInst terminator() {
        if (instructions.isEmpty()) throw new InternalError("empty AsmBLock! no terminator! " + this.identifier);
        return instructions.getLast();
    }
}
