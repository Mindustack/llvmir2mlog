import Mindustack.compiler.backend.optim.BackEndOptimizer;
import Mindustack.compiler.backend.regalloc.RegisterAllocator;
import Mindustack.compiler.backend.regalloc.StackAllocator;
import Mindustack.compiler.backend.rvasm.AsmBuilder;
import Mindustack.compiler.backend.rvasm.AsmPrinter;
import Mindustack.compiler.middleend.analyzer.CallGraphAnalyzer;
import Mindustack.compiler.middleend.analyzer.LoopAnalyzer;
import Mindustack.compiler.middleend.llvmir.IRBuilder;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;
import Mindustack.compiler.middleend.optim.*;
import Mindustack.compiler.middleend.optim.ssa.Mem2Reg;
import Mindustack.compiler.middleend.optim.ssa.SSADestructor;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        IRBuilder IRBuilder;
        //String s;
        var file = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\test4.ll";

        IRBuilder = new IRBuilder(CharStreams.fromStream(new FileInputStream(new File(file))));
        IRModule module = IRBuilder.irModule;


        new CallGraphAnalyzer().runOnModule(module);

        for (IRFunction function : module.functions) {
            new Glo2Loc().runOnFunc(function);
            new Mem2Reg().runOnFunc(function);
        }

        for (int i = 1; i <= 7; i++) {

            new FuncInliner(false).runOnModule(module);

//            for (IRFunction function : module.functions) {
//                new CFGSimplifier().runOnFunc(function);
//                new GVN().runOnFunc(function);
//                new SCCP().runOnFunc(function);
//               new ADCE().runOnFunc(function);
//                new CFGSimplifier().runOnFunc(function);
//                new IVTrans().runOnFunc(function);
//                new LICM().runOnFunc(function);
//                new LocalMO().runOnFunc(function);
//                new CFGSimplifier().runOnFunc(function);
//            }
        }

        new FuncInliner(true).runOnModule(module);
//
//        for (IRFunction function : module.functions) {
//            new GVN().runOnFunc(function);
//            new CFGSimplifier().runOnFunc(function);
//           new ADCE().runOnFunc(function);
//            new CFGSimplifier().runOnFunc(function);
//            new LICM().runOnFunc(function);
//            new CFGSimplifier().runOnFunc(function);
//        }

        // re-analyze info for asm
        for (IRFunction function : module.functions) {
            new SSADestructor().runOnFunc(function);
            new CFGSimplifier().runOnFunc(function);
            new LocalMO().runOnFunc(function);
            new TRO().runOnFunc(function);
            new LoopAnalyzer().runOnFunc(function);
            new InstAdapter().runOnFunc(function);
        }

        //new MiddleEndOptimizer().runOnModule(module);


        // s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";

        PrintStream printStream = System.out;
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

                printStream
        ).runOnModule(builder.module);

//import java.io.*;

// ...

        String filePath = "Log/MlogOut.s";
        // FileOutputStream
        FileOutputStream fileOutput = new FileOutputStream(filePath, true);
        printStream = new PrintStream(fileOutput);

        AsmPrinter printer = new AsmPrinter(printStream);
        printer.runOnModule(builder.module);

        printStream.close();
        fileOutput.close();


    }
}
