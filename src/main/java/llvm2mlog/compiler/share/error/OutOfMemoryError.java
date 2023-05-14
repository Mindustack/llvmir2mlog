package llvm2mlog.compiler.share.error;

public class OutOfMemoryError extends VirtualMachineError {
    public OutOfMemoryError(String msg) {
        super("OOM Error in: " + msg);
    }
}
