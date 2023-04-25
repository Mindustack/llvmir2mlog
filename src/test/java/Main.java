import Mindustack.compiler.backend.optim.BackEndOptimizer;
import Mindustack.compiler.backend.regalloc.RegisterAllocator;
import Mindustack.compiler.backend.regalloc.StackAllocator;
import Mindustack.compiler.backend.rvasm.AsmBuilder;
import Mindustack.compiler.backend.rvasm.AsmPrinter;
import Mindustack.compiler.backend.rvasm.inst.AsmExplainInst;
import Mindustack.compiler.middleend.llvmir.IRBuilder;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;
import Mindustack.compiler.middleend.optim.MiddleEndOptimizer;
import Mindustack.debug.Log;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        IRBuilder IRBuilder;
        AsmExplainInst.ExplainShow = false;
        //String s;
        var file = "src/main/resources/test.ll";
        Log.setVerbose(Log.Verbose.all);
        IRBuilder = new IRBuilder(CharStreams.fromStream(new FileInputStream(new File(file))));
        IRModule module = IRBuilder.irModule;


        new MiddleEndOptimizer().runOnModule(module);


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

        printStream.println("\n\ntime:" + System.nanoTime() / 1000);
        AsmPrinter printer = new AsmPrinter(printStream);
        printer.runOnModule(builder.module);

        printStream.close();
        fileOutput.close();


    }
}
