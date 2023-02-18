package darksword.console.display;

import java.io.PrintStream;

public class Displayer {

    private static final String hint = "<darksword interpreter>: ";
    private static final int InterpretColor = 35, FinishColor = 41;
    private static PrintStream ps = System.out;

    private static void colorPrintln(int color, String content) {
        ps.format("\033[%dm%s\033[0m\n", color, content);
    }

    public static void interpretRow(RowMark mark) {
        colorPrintln(InterpretColor, hint + "now >>> " + mark.row + ": " + mark.code);
    }

    public static void interpretFinish(int exitCode) {
        colorPrintln(FinishColor, hint + "interpret finish. Exit Code: " + exitCode);
    }

}
