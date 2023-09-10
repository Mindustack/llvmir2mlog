package org.mindustack.llvmir2mlog;

import org.mindustack.llvmir2mlog.compiler.backend.optim.BackEndOptimizer;
import org.mindustack.llvmir2mlog.compiler.backend.regalloc.RegisterAllocator;
import org.mindustack.llvmir2mlog.compiler.backend.regalloc.StackAllocator;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.AsmBuilder;
import org.mindustack.llvmir2mlog.compiler.backend.rvasm.AsmPrinter;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.IRBuilder;
import org.mindustack.llvmir2mlog.compiler.middleend.llvmir.hierarchy.IRModule;
import org.mindustack.llvmir2mlog.compiler.middleend.optim.MiddleEndOptimizer;
import org.mindustack.llvmir2mlog.compiler.share.error.CompileError;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;
import org.mindustack.llvmir2mlog.console.Console;
import org.mindustack.llvmir2mlog.console.error.ConsoleError;
import org.mindustack.llvmir2mlog.debug.Log;
import org.mindustack.llvmir2mlog.debug.Statistics;
import org.mindustack.llvmir2mlog.debug.Timer;
import org.mindustack.minterpreter.Memory;
import org.antlr.v4.runtime.CharStreams;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class llvm2mlog {
    static {
        MLOG.setup();
    }

    public static void main(String[] args) throws Exception {
        try {
            Timer.start();

            Console console = new Console(args);
            if (console.showHelp || console.showVersion) return;


//            IRBuilder IRBuilder = new IRBuilder(CharStreams.fromStream(new FileInputStream(new File(file))));
//
//
//        // new MiddleEndOptimizer().runOnModule(IRBuilder.irModule);
//
//
//        // s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";
//
//        PrintStream printStream = System.out;
//        new IRPrinter(printStream).runOnModule(IRBuilder.irModule);
//
//        System.out.println("==========================");
//
//
//        AsmBuilder builder = new AsmBuilder();
//        builder.runOnModule(IRBuilder.irModule);
//        AsmModule module = builder.module;
//
////         Graph Coloring
//        new RegisterAllocator().runOnModule(module);
////
//        // Stack Allocate. Eliminate RawStackOffset
//        new StackAllocator().runOnModule(module);
////
//        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
//        new BackEndOptimizer().runOnModule(module);
//
//
//
//        new AsmPrinter(
//
//                printStream
//        ).runOnModule(module);
//


//            FrontEnd frontEnd = new FrontEnd(console);
//            if (console.fsyntaxOnly) return;
//            MiddleEnd middleEnd = new MiddleEnd(frontEnd, console);
//
//            if (console.irOnly) return;
//            BackEnd backEnd = new BackEnd(middleEnd, console);


            Timer.display();

            Statistics.show("spill");
        } catch (Exception e) {
            errorHandle(e);
        }
        System.exit(0);
    }

    private static void errorHandle(Exception e) {
        if (e instanceof CompileError) {
            ((CompileError) e).tell();
            throw new RuntimeException();
        } else if (e instanceof ConsoleError) {
            ((ConsoleError) e).tell();
            throw new RuntimeException();
        } else {
            e.printStackTrace();
        }
    }


    public static void compile(InputStream code, PrintStream output) {

        IRBuilder IRBuilder = new IRBuilder();
//        AsmExplainInst.ExplainShow = false;
        Log.setVerbose(Log.Verbose.off);
        try {

            IRBuilder.run(CharStreams.fromStream(code));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return;
        } catch (IOException e) {
            return;
        }

        IRModule module = IRBuilder.irModule;


        
        // new MiddleEndRewriter().runOnModule(module);
        new MiddleEndOptimizer().runOnModule(module);


        // s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";


        //  new IRPrinter(printStream).runOnModule(IRBuilder.irModule);

        // System.out.println("==========================");


        AsmBuilder builder = new AsmBuilder();
        builder.runOnModule(IRBuilder.irModule);

//         Graph Coloring
        new RegisterAllocator().runOnModule(builder.module);
//
        // Stack Allocate. Eliminate RawStackOffset
        new StackAllocator().runOnModule(builder.module);
//
        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
        new BackEndOptimizer().runOnModule(builder.module);


        new AsmPrinter(

                output).runOnModule(builder.module);

//import java.io.*;

// ...

//        String filePath = "Log/MlogOut.s";
//        // FileOutputStream
//        try {
//            FileOutputStream fileOutput = new FileOutputStream(filePath, true);
//            printStream = new PrintStream(fileOutput);
//
//            printStream.println("\n\ntime:" + System.nanoTime() / 1000);
//            AsmPrinter printer = new AsmPrinter(printStream);
//            printer.runOnModule(builder.module);
//
//            printStream.close();
//            fileOutput.close();
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
//public class BackEnd {
//
//    public final AsmModule module;
//
//    public final ArrayList<AsmFunction> functions = new ArrayList<>();
//
//    public BackEnd(MiddleEnd middleEnd, Console console) {
//        // Assembly Builder
//        AsmBuilder builder = new AsmBuilder();
//        builder.runOnModule(middleEnd.irModule);
//        this.module = builder.module;
//
//        // Graph Coloring
//        new RegisterAllocator().runOnModule(this.module);
//
//        // Stack Allocate. Eliminate RawStackOffset
//        new StackAllocator().runOnModule(this.module);
//
//        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
//        new BackEndOptimizer().runOnModule(this.module);
//
//        if (console.canPrintASM) {
//            // ASM Printer
//            new AsmPrinter(
//                    Console.getFileName(Config.getPath(Config.Option.ASMOutput)),
//                    (PrintStream) Config.getArgValue(Config.Option.ASMOutput)
//            ).runOnModule(this.module);
//        }
//
//        Log.track("BackEnd started successfully.");
//    }
//}
//class DarkSwordVM {
//
//    public static void main(String[] args) throws Exception {
//        try {
//            Console console = new Console(args);
//            if (console.showHelp || console.showVersion) return;
//
//            Interpreter interpreter = new Interpreter(console);
//
//            Timer.start();
//            interpreter.interpret();
//
//            // absolute running time
//            Timer.display();
//
//            benchmark();
//        }
//        catch (Exception e) {
//            errorHandle(e);
//        }
//        System.exit(0);
//    }
//
//    private static void benchmark() {
//        // a simple benchmark
//        int optLevel = (int) Config.getArgValue(Config.Option.OptLevel);
//
//        double interpreterWeight = 10, ravelWeight = 0.1,
//                o0Weight = 100, o1Weight = 300, o2Weight = 500;
//
//        double interpreterCost = interpreterWeight * Statistics.get("interpreter");
//        double ravelCost = ravelWeight * Statistics.get("ravel");
//        double compilingCost = 0;
//
//        switch (optLevel) {
//            case 0: compilingCost = o0Weight * Statistics.get("compile"); break;
//            case 1: compilingCost = o1Weight * Statistics.get("compile"); break;
//            case 2: compilingCost = o2Weight * Statistics.get("compile"); break;
//        }
//
//        System.out.println("[darksword] simple JIT benchmark: ");
//        System.out.printf("interpreter cost=%f, ravel cost=%f, compiling cost=%f, total=%f\n",
//                            interpreterCost, ravelCost, compilingCost, interpreterCost + ravelCost + compilingCost);
//    }
//
//    private static void errorHandle(Exception e) {
//        if (e instanceof CompileError) {
//            ((CompileError) e).tell();
//            throw new RuntimeException();
//        }
//        else if (e instanceof VirtualMachineError) {
//            ((VirtualMachineError) e).tell();
//            throw new RuntimeException();
//        }
//        else if (e instanceof ConsoleError) {
//            ((ConsoleError) e).tell();
//            throw new RuntimeException();
//        }
//        else {
//            e.printStackTrace();
//        }
//    }
//}
