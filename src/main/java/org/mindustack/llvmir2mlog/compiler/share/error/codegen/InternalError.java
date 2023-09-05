package org.mindustack.llvmir2mlog.compiler.share.error.codegen;

import org.mindustack.llvmir2mlog.compiler.share.error.CodegenError;

public class InternalError extends CodegenError {
    public static final String internal = "InternalError happened. ";

    public InternalError(String msg) {
        super(internal + msg);
    }
}
