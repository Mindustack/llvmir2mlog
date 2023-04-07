package Mindustack.compiler.backend.rvasm.operand;

// RawStackOffset will be turned to Immediate with correct position
// throw an error if there is RawStackOffset not be eliminated

public class RawStackOffset extends Immediate {

    public RawType level;

    public RawStackOffset(int offset, RawType level) {
        super(offset);
        this.level = level;
    }

    public enum RawType {alloca, spill, SpFromFp, callerArg, calleeArg}

    /*
    @Override
    public String toString() {
        throw new InternalError(this);
    }
    */
}
