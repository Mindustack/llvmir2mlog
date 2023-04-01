package Mindustack.compiler.share.error;

public class ZeroDivisionError extends VirtualMachineError {
    public ZeroDivisionError() {
        super("divided by Zero!");
    }
}
