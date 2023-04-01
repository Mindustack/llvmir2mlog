package Mindustack.compiler.share.error.codegen;

import Mindustack.compiler.share.error.CodegenError;

public class InternalError extends CodegenError {
    public static final String internal = "InternalError happened. ";

    public InternalError(String msg) {
        super(internal + msg);
    }
}
