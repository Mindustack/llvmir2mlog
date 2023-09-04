import llvm2mlog.llvm2mlog;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTest {
    public static void main(String[] args) {

    }
    @org.junit.jupiter.api.BeforeAll
public static void setUpClass() throws Exception {
try {
PrintStream out = new PrintStream(new FileOutputStream("output.txt",true));
System.setOut(out);
} catch (IOException e) {
e.printStackTrace();
}
}

    static void test(String file) {
    	
    System.out.println("#\n#\n#\n#\n#\n#------"+file+"\n#\n#\n#\n#\n#\n#");
    
	try {
            llvm2mlog.compile(new FileInputStream(file), System.out);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    
    }

    
 


    @org.junit.jupiter.api.Test
    void testBuildinFUnction() {
        var file = "src/test/resources/ipac.ll";
        test(file);
    }

    @org.junit.jupiter.api.Test
    void testRecursion() {
        var file = "src/test/resources/fib.ll";
        test(file);

    }
    
}
