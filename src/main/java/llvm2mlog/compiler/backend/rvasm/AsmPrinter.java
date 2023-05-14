package llvm2mlog.compiler.backend.rvasm;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmBlock;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmModule;
import llvm2mlog.compiler.share.lang.MLOG;
import llvm2mlog.compiler.share.pass.AsmBlockPass;
import llvm2mlog.compiler.share.pass.AsmFuncPass;
import llvm2mlog.compiler.share.pass.AsmModulePass;
import llvm2mlog.debug.Log;

import java.io.PrintStream;

public class AsmPrinter implements AsmModulePass, AsmFuncPass, AsmBlockPass {

    private final PrintStream ps;

    public int funcCounter = 0;
    public int blockCounter = 0;
    public int instructionCounter = 0;

    public AsmPrinter(PrintStream ps) {
        this.ps = ps;

    }

    private void printBuildinFunction() {

    }

    @Override
    public void runOnModule(AsmModule module) {
        Log.info("Asm Printer Start Sucess");

        ps.println("# compiled by @llvm2mlog");


        AsmFormatter.RegInitFormat().forEach(ps::println);

        AsmFormatter.DataInitFormat(module.dataZone).forEach(ps::println);
        ps.println("jump 0 strictEqual zero 0");

        module.globalVarSeg.forEach(globalVar -> {
            AsmFormatter.globalVariableFormat(globalVar).forEach(ps::println);
            ps.println();
        });

        ps.println("jump " + module.mainFunction.entryBlock.identifier + " always");

        ps.println("\t# -- Start BuiltinFunction\n");
        module.builtinFunctions.forEach(function -> {
            var x = MLOG.BuildinFunctionConfig.get(function.identifier);
            if (!((boolean) x.get("inline"))) ps.println(x);
        });
        ps.println("\t# -- End BuiltinFunction\n");


        runOnFunc(module.mainFunction);

        // ps.println("set @counter @counter");

        module.functions.stream().filter(asmFunction -> !asmFunction.identifier.equals(MLOG.MainFunctionIdentifier)).forEach(this::runOnFunc);


        printCompileRecord();
        Log.info("Asm Print Sucess");
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