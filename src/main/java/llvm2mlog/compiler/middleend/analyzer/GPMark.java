package llvm2mlog.compiler.middleend.analyzer;

import llvm2mlog.compiler.middleend.llvmir.User;
import llvm2mlog.compiler.middleend.llvmir.constant.GlobalValue;
import llvm2mlog.compiler.middleend.llvmir.hierarchy.IRModule;
import llvm2mlog.compiler.middleend.llvmir.inst.IRBaseInst;
import llvm2mlog.compiler.share.pass.IRModulePass;
import llvm2mlog.debug.Log;

import java.util.HashMap;

/**
 * this pass intends to find the most frequently used global pointer and mark it
 * in Asm Stage, it will use "gp" to store it
 */

public class GPMark implements IRModulePass {
    private final HashMap<GlobalValue, Integer> useCount = new HashMap<>();

    @Override
    public void runOnModule(IRModule module) {
        module.functions.forEach(func -> new LoopAnalyzer().runOnFunc(func));

        for (GlobalValue glo : module.globalVarSeg) {
            for (User user : glo.users) {
                assert user instanceof IRBaseInst;
                useCount.put(glo, (int) Math.pow(10, ((IRBaseInst) user).parentBlock.loopDepth));
            }
        }

        // string constant not marked

        GlobalValue marked = null;


//        useCount.entrySet().stream().sorted()//todo
        for (var entry : useCount.entrySet()) {

            if (marked == null) marked = entry.getKey();
            else {
                if (entry.getValue() > useCount.get(marked)) marked = entry.getKey();
            }
        }

        if (marked != null) {
            Log.info("gp mark: ", marked.identifier());
            marked.gpRegMark = 1;
        }


    }
}
