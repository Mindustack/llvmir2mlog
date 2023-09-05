package org.mindustack.llvmir2mlog.compiler.share.warn;

public class ZeroDivisionWarning extends Warning {
    public ZeroDivisionWarning() {
        super("integer division or modulo by zero");
    }
}
