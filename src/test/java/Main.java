import Mindustack.compiler.backend.optim.BackEndOptimizer;
import Mindustack.compiler.backend.regalloc.RegisterAllocator;
import Mindustack.compiler.backend.rvasm.AsmBuilder;
import Mindustack.compiler.backend.rvasm.AsmPrinter;
import Mindustack.compiler.backend.rvasm.hierarchy.AsmModule;
import Mindustack.compiler.middleend.llvmir.IRBuilder;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        IRBuilder IRBuilder;
        //String s;
        var file = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\test2.ll";

        IRBuilder = new IRBuilder(CharStreams.fromStream(new FileInputStream(new File(file))));


        // new MiddleEndOptimizer().runOnModule(IRBuilder.irModule);


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
        // new StackAllocator().runOnModule(module);
//
        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
        new BackEndOptimizer().runOnModule(module);



        new AsmPrinter(

                printStream
        ).runOnModule(module);


    }
}