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
import org.junit.jupiter.api.*;
import java.io.*;

public class Tester {
    public static void main(String[] args) {
init();
var file = "src/test/resources/test.ll";
test(file);
    }
 static   IRBuilder IRBuilder;
     @BeforeAll
   static void init(){
    	IRBuilder = new IRBuilder();
    	AsmExplainInst.ExplainShow = false;
        //String s;
        
        Log.setVerbose(Log.Verbose.all);
    	}
    
        @DisplayName("我的第一个测试")
    @Test
    void testFirstTest() {
        System.out.println("我的第一个测试开始测试");
    }

    @DisplayName("我的第二个测试")
    @Test
    void testSecondTest() {
        System.out.println("我的第二个测试开始测试");
    }
  static  void test(String file){
  	try{
    	        IRBuilder.run(CharStreams.fromStream(new FileInputStream(new File(file))));
        }
        catch(  FileNotFoundException e){
        	      e.printStackTrace();
        System.out.println(file+"not found");
        return;
        	}
        catch(IOException e){
        	return;
        	}
       
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
        try{
        	FileOutputStream fileOutput = new FileOutputStream(filePath, true);
        printStream = new PrintStream(fileOutput);

        printStream.println("\n\ntime:" + System.nanoTime() / 1000);
        AsmPrinter printer = new AsmPrinter(printStream);
        printer.runOnModule(builder.module);

        	}
        catch(FileNotFoundException e){
        	}
        
        catch(IOException e){
        	
        	}
       finally{        printStream.close();
        fileOutput.close();
       	
       	}

}
}
