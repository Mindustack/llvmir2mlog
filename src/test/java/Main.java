import darksword.interpreter.MB2;
import masterball.compiler.middleend.llvmir.IRPrinter;

import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws IOException {
        MB2 mb2;
        String s;

        mb2 = new MB2();

















        s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";
        new IRPrinter(s, new PrintStream(s)).runOnModule(mb2.irModule);

        //  System.out.println(mb2.irModule);


//        AsmBuilder builder = new AsmBuilder();
//        builder.runOnModule(mb2.irModule);
//        AsmModule module = builder.module;
//
//        // Graph Coloring
//        new RegisterAllocator().runOnModule(module);
//
//        // Stack Allocate. Eliminate RawStackOffset
//        new StackAllocator().runOnModule(module);
//
//        // Optimize Assembly. Don't comment it directly because there are some necessary passes.
//        new BackEndOptimizer().runOnModule(module);
//        s=s+2;
//        new AsmPrinter(
//                s,
//              new PrintStream(s)
//        ).runOnModule(module);


    }
}