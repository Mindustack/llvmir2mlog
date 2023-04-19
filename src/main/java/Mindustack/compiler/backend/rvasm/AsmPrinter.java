package Mindustack.compiler.backend.rvasm;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.share.pass.AsmBlockPass;
import Mindustack.compiler.share.pass.AsmFuncPass;
import Mindustack.compiler.share.pass.AsmModulePass;
import Mindustack.debug.Log;

import java.io.PrintStream;

public class AsmPrinter implements AsmModulePass, AsmFuncPass, AsmBlockPass {

    private final static String TAB = "\t";
    private final PrintStream ps;

    public int funcEndCounter = 0;

    public AsmPrinter(PrintStream ps) {
        this.ps = ps;

    }

    @Override
    public void runOnModule(AsmModule module) {
        Log.info("Asm Printer Start Sucess");

//        ps.println("# fileName: " + irFileName + TAB + " compiled by @Masterball.");
//        ps.println(TAB + ".text");
        module.functions.forEach(this::runOnFunc);
//        module.globalVarSeg.forEach(globalVar -> {
//            AsmFormatter.globalVariableFormat(globalVar).forEach(ps::println);
//            ps.println();
//        });
//        module.stringConstSeg.forEach(stringConst -> {
//            AsmFormatter.stringConstFormat(stringConst).forEach(ps::println);
//            ps.println();
//        });
    }

    @Override
    public void runOnFunc(AsmFunction function) {
        // some invalid print in ravel

//        AsmFormatter.functionHeaderFormat(function).forEach(ps::println);
//        ps.println(function.identifier + ":");
//        // ps.println(TAB + ".cfi_startproc");
        function.blocks.forEach(this::runOnBlock);
//        // ps.println(".Lfunc_end" + funcEndCounter + ":");
//        ps.println(TAB + ".size" + TAB + function + ", .-" + function);
        funcEndCounter++;
        // ps.println(TAB + ".cfi_endproc");
//        ps.println("                                        # -- End function");
    }

    @Override
    public void runOnBlock(AsmBlock block) {
        ps.println(block.identifier + ":");
        block.instructions.forEach(inst -> ps.println(AsmFormatter.instFormat(inst)));
        // block.instructions.forEach(inst -> System.out.println(AsmFormatter.instFormat(inst)) );
    }
}