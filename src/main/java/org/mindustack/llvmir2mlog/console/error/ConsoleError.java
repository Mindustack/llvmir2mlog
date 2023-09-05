package org.mindustack.llvmir2mlog.console.error;

public class ConsoleError extends Exception {
    public String message;

    public ConsoleError(String message) {
        this.message = message;
    }

    public void tell() {
        System.err.println("<masterball console>: " + message);
    }

}
