package Mindustack.compiler.backend.rvasm;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmBlock;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.share.lang.MLOG;
import Mindustack.compiler.share.pass.AsmBlockPass;
import Mindustack.compiler.share.pass.AsmFuncPass;
import Mindustack.compiler.share.pass.AsmModulePass;
import Mindustack.debug.Log;

import java.io.PrintStream;

public class AsmPrinter implements AsmModulePass, AsmFuncPass, AsmBlockPass {

    private final PrintStream ps;

    public int funcCounter = 0;
    public int blockCounter = 0;
    public int instructionCounter = 0;

    public AsmPrinter(PrintStream ps) {
        this.ps = ps;

    }

    @Override
    public void runOnModule(AsmModule module) {
        Log.info("Asm Printer Start Sucess");

        ps.println("# compiled by @Mindustack");


        AsmFormatter.RegInitFormat().forEach(ps::println);

        AsmFormatter.DataInitFormat(module.dataZone).forEach(ps::println);
        ps.println("jump 0 strictEqual ra 0");

        module.globalVarSeg.forEach(globalVar -> {
            AsmFormatter.globalVariableFormat(globalVar).forEach(ps::println);
            ps.println();
        });

        ps.println("jump " + module.mainFunction.entryBlock.identifier + " always");

        printBuildinFunction();


        runOnFunc(module.mainFunction);

        // ps.println("set @counter @counter");

        module.functions.stream().filter(asmFunction -> !asmFunction.identifier.equals(MLOG.MainFunctionIdentifier)).forEach(this::runOnFunc);


        printCompileRecord();
        Log.info("Asm Print Sucess");
    }

    private void printBuildinFunction() {
        ps.println("\t# -- Start BuiltinFunction\n");
        ps.println(MLOG.BuildinFunction);
        ps.println("\t# -- End BuiltinFunction\n");
    }

    @Override
    public void runOnFunc(AsmFunction function) {

        AsmFormatter.functionHeaderFormat(function).forEach(ps::println);
        function.blocks.forEach(this::runOnBlock);
        funcCounter++;
        ps.println("\t\t# -- End function\n");
    }

    private void printCompileRecord() {
        ps.println("\t\t\t\t\t# -- End Compile");
        ps.println("\t\t\t\t\t#\t\t total func:" + funcCounter);
        ps.println("\t\t\t\t\t#\t\t total block:" + blockCounter);
        ps.println("\t\t\t\t\t#\t\t total inst:" + instructionCounter);
    }

    @Override
    public void runOnBlock(AsmBlock block) {
        ps.println(block.identifier + ":");
        block.instructions.forEach(inst -> {
            ps.println(AsmFormatter.instFormat(inst));
            instructionCounter++;
        });
        blockCounter++;
    }
}