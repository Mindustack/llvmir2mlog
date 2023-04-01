package Mindustack.compiler.share.error;

public class NoMainFunc extends VirtualMachineError {
    public NoMainFunc() {
        super("no main function found!");
    }
}
