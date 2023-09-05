package org.mindustack.llvmir2mlog.compiler.share.error;

public class NoMainFunc extends VirtualMachineError {
    public NoMainFunc() {
        super("no main function found!");
    }
}
