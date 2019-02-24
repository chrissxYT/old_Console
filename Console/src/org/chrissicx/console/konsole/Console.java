package org.chrissicx.console.konsole;

public class Console {
    public static final String INFO_MSG = "[INFO] ";
    public static final String WARN_MSG = "[WARN] ";
    public static final String ERROR_MSG = "[ERROR] ";
    
    public void writeLine(final String msg) {
    	System.out.println(msg);
    }
    
    public void writeInfo(final String msg) {
    	writeLine(INFO_MSG + msg);
    }
    
    public void writeWarn(final String msg) {
    	writeLine(WARN_MSG + msg);
    }
    
    public void writeError(final String msg) {
    	writeLine(ERROR_MSG + msg);
    }
}
