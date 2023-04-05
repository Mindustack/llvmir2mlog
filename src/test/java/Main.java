import Mindustack.compiler.backend.regalloc.RegisterAllocator;
import Mindustack.compiler.backend.regalloc.StackAllocator;
import Mindustack.compiler.backend.rvasm.AsmBuilder;
import Mindustack.compiler.backend.rvasm.AsmPrinter;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.middleend.llvmir.IRBuilder;
import Mindustack.compiler.middleend.optim.MiddleEndOptimizer;
import org.antlr.v4.runtime.CharStreams;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        IRBuilder IRBuilder;
        //String s;
        var file = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\test4.ll";

        IRBuilder = new IRBuilder(CharStreams.fromStream(new FileInputStream(new File(file))));


        new MiddleEndOptimizer().runOnModule(IRBuilder.irModule);


        // s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";

        PrintStream printStream = System.out;
        //  new IRPrinter(printStream).runOnModule(IRBuilder.irModule);

        // System.out.println("==========================");


        AsmBuilder builder = new AsmBuilder();
        builder.runOnModule(IRBuilder.irModule);
        AsmModule module = builder.module;

//         Graph Coloring
       new RegisterAllocator().runOnModule(module);
//
        // Stack Allocate. Eliminate RawStackOffset
        new StackAllocator().runOnModule(module);
//
        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
        // new BackEndOptimizer().runOnModule(module);


        new AsmPrinter(

                printStream
        ).runOnModule(module);

//import java.io.*;

// ...

        String filePath = "Log/MlogOut.s";
        // FileOutputStream
        FileOutputStream fileOutput = new FileOutputStream(filePath, true);
        printStream = new PrintStream(fileOutput);

        AsmPrinter printer = new AsmPrinter(printStream);
        printer.runOnModule(module);

        printStream.close();
        fileOutput.close();


    }
}
