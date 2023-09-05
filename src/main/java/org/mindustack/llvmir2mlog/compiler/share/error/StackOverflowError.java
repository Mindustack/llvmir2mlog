package org.mindustack.llvmir2mlog.compiler.share.error;

public class StackOverflowError extends VirtualMachineError {
    public StackOverflowError() {
        super("STACK OVERFLOW!!!");
    }
}
