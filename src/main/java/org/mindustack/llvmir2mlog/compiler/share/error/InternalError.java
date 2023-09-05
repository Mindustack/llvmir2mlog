package org.mindustack.llvmir2mlog.compiler.share.error;

public class InternalError extends VirtualMachineError {

    public static final String internal = "InternalError happened. ";

    public InternalError(String message) {
        super(internal + message);
    }
}
