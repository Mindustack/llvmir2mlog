import darksword.interpreter.MB2;
import masterball.compiler.middleend.llvmir.IRPrinter;

import java.io.IOException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        try {
            var mb2 = new MB2();
            String s = "E:\\WORKSPACE\\llvmir2mlog\\src\\main\\resources\\out";
            new IRPrinter( s,new PrintStream(s)              ).runOnModule(mb2.irModule);

          //  System.out.println(mb2.irModule);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}