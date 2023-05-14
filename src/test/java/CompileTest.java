import llvm2mlog.llvm2mlog;
import org.junit.jupiter.api.DisplayName;

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

    @DisplayName("测试function Call")
    @org.junit.jupiter.api.Test
    void testFunctionCall() {
        var file = "src/test/resources/test.ll";
        test(file);
    }
}
