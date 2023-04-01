package Mindustack;

import Mindustack.compiler.share.error.CompileError;
import Mindustack.console.Console;
import Mindustack.console.error.ConsoleError;
import Mindustack.debug.Statistics;
import Mindustack.debug.Timer;

public class Mindustack {
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
