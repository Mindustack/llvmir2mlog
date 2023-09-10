import org.mindustack.llvmir2mlog.llvm2mlog;
import org.mindustack.minterpreter.Minterpreter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;

public class CompileTest {

    static final String base = "src/test/resources/";

    @org.junit.jupiter.api.BeforeAll
    public static void setUp() throws Exception {

    }

    static void test(String filename, int limit, int expect) {
        PrintStream out;
        File ofile;
        try {
            ofile = new File(base + "output/" + filename + ".mlog");
            ofile.createNewFile();
            out = new PrintStream(ofile);
        } catch (Exception e) {

            e.printStackTrace();
            throw new RuntimeException(e);

        }

        out.println("#\n#\n#\n#\n#\n#------" + filename + "\n#\n#\n#\n#\n#\n#");

        try {
            llvm2mlog.compile(new FileInputStream(base + filename + ".ll"), out);
        } catch (FileNotFoundException e) {
            out.close();
            throw new RuntimeException(e);
        }
        int test = 1;
        try {
            test = Minterpreter.test(new FileInputStream(ofile), expect, limit, System.out);

        } catch (FileNotFoundException e) {

            throw new RuntimeException(e);
        }
        assertEquals(test, 0);

    }

    @org.junit.jupiter.api.Test
    void testRecursion() {

        test("fib",1024,8);

    }

    @org.junit.jupiter.api.Test
    void testBuildinFUnction() {
        // var file = "src/test/resources/ipac.ll";
        // test(file);
    }

}
