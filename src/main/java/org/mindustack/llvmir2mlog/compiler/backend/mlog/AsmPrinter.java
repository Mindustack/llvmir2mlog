package org.mindustack.llvmir2mlog.compiler.backend.mlog;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.ASMBuildinFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmBlock;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmFunction;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy.AsmModule;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.GlobalReg;
import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.PhysicalReg;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;
import org.mindustack.llvmir2mlog.compiler.share.misc.Pair;
import org.mindustack.llvmir2mlog.compiler.share.pass.AsmBlockPass;
import org.mindustack.llvmir2mlog.compiler.share.pass.AsmFuncPass;
import org.mindustack.llvmir2mlog.compiler.share.pass.AsmModulePass;
import org.mindustack.llvmir2mlog.debug.Log;

import java.io.PrintStream;
import java.util.ArrayList;

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

        ps.println("# compiled by @llvm2mlog\n");

        ps.println("# init");


        ps.println("jump START always");
        ps.println("stop");
        ps.println("START:");
        RegInitFormat().forEach(ps::println);

        DataInitFormat(module.dataZone).forEach(ps::println);

        BuildinFuncVarInitFormat(module.builtinFunctions).forEach(ps::println);
        
        


        module.globalVarSeg.forEach(globalVar -> {
            globalVariableFormat(globalVar).forEach(ps::println);
            ps.println();
        });


        runOnFunc(module.mainFunction);
        // ps.println("jump " + module.mainFunction.entryBlock.identifier + " always");
        

        module.functions.stream().filter(asmFunction -> !asmFunction.equals(module.mainFunction)).forEach(this::runOnFunc);

        ps.println("\n# BuiltinFunctions");

        module.builtinFunctions.forEach(function -> {
//            var x = MLOG.BuildinFunctionConfig.get(function.identifier);
            if (!function.inline) ps.println(function.getCode());
        });


        // ps.println("set @counter @counter");


        printCompileRecord();

        Log.info("Asm Print Sucess");
    }

    public static ArrayList<String> RegInitFormat() {
        ArrayList<String> ret = new ArrayList<>();

        ret.add(String.format("set %s %s", PhysicalReg.reg("sp"), MLOG.MaxMemory-1));//todo 512?
//        ret.add(String.format("set %s %s", PhysicalReg.reg("sp"), PhysicalReg.reg("fp")));
        ret.add(String.format("set %s %s", PhysicalReg.reg("zero"), 0));
        ret.add(String.format("set %s %s", PhysicalReg.reg("ra"), 1));
        return ret;
    }

    public static ArrayList<String> DataInitFormat(ArrayList<Pair<Double, Integer>> value) {
        ArrayList<String> ret = new ArrayList<>();//todo use map


        for (Pair<Double, Integer> data : value) {

            if (data.first() == 0) continue;
            ret.add(String.format("%s %s cell %s", "write", data.first(), data.second()));//todo cell?
        }
        return ret;
    }

    public static ArrayList<String> BuildinFuncVarInitFormat(ArrayList<ASMBuildinFunction> builtinFunctions) {
        ArrayList<String> ret = new ArrayList<>();

        for (ASMBuildinFunction func : builtinFunctions) {

            if (func.varInitMap.isEmpty()) continue;
            func.varInitMap.forEach((name, value) -> ret.add(String.format("set %s %s", name, value)));
            //todo cell?
        }
        return ret;

    }

    public static ArrayList<String> globalVariableFormat(GlobalReg globalReg) {

        ArrayList<String> ret = new ArrayList<>();
        ret.add("\t\t#globlvar " + globalReg.identifier);

        return ret;
    }

    @Override
    public void runOnFunc(AsmFunction function) {
        ps.println("#-------------------------------------------------<function> " + function);
        function.blocks.forEach(this::runOnBlock);
        funcCounter++;
    }

    private void printCompileRecord() {
        ps.println("#--End Compile");
        ps.println("#----funcs:" + funcCounter);
        ps.println("#----blocks:" + blockCounter);
        ps.println("#----insts:" + instructionCounter);
    }

    @Override
    public void runOnBlock(AsmBlock block) {
        ps.println("#----------------------<block>" + block.identifier);
        ps.printf("%s:\n", block.identifier);
        block.instructions.forEach(inst -> {
            ps.println(inst.format());
            instructionCounter++;
        });
        blockCounter++;
    }
}