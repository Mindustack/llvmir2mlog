package org.mindustack.llvmir2mlog.console.error;

public class NoArgumentValue extends ConsoleError {

    public NoArgumentValue(String argName) {
        super("no argument value provided for argument name \"" + argName + "\"");
    }

}
