import llvm2mlog.llvm2mlog;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTest {
    public static void main(String[] args) {
        var file = "src/test/resources/test.ll";
        test(file);
    }

    static void test(String file) {
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
