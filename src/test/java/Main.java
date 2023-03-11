import darksword.interpreter.MB2;
import masterball.compiler.backend.optim.BackEndOptimizer;
import masterball.compiler.backend.regalloc.RegisterAllocator;
import masterball.compiler.backend.regalloc.StackAllocator;
import masterball.compiler.backend.rvasm.AsmBuilder;
import masterball.compiler.backend.rvasm.AsmPrinter;
import masterball.compiler.backend.rvasm.hierarchy.AsmModule;

import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        MB2 mb2;
        String s;

        mb2 = new MB2();


        // new MiddleEndOptimizer().runOnModule(mb2.irModule);


        // s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";

        PrintStream printStream = System.out;
        // new IRPrinter( printStream).runOnModule(mb2.irModule);

        //System.out.println(mb2.irModule);


        AsmBuilder builder = new AsmBuilder();
        builder.runOnModule(mb2.irModule);
        AsmModule module = builder.module;

//         Graph Coloring
        new RegisterAllocator().runOnModule(module);
//
        // Stack Allocate. Eliminate RawStackOffset
        new StackAllocator().runOnModule(module);
//
        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
        new BackEndOptimizer().runOnModule(module);



        new AsmPrinter(

                printStream
        ).runOnModule(module);


    }
}