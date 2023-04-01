package masterball.compiler.share.error;

public class CodegenError extends CompileError {
    public static String runtimeErrorHint = "[Codegen Error]: ";

    //  public CodegenError(CodePos codePos, String message) {
    //     super(runtimeErrorHint + message + codePos);
    // }

    // unable to target local
    public CodegenError(String message) {
        super(runtimeErrorHint + message);
    }
}
