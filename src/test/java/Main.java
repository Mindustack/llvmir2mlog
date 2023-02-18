import darksword.interpreter.MB2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            var mb2 = new MB2();


            System.out.println(mb2.irModule);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}