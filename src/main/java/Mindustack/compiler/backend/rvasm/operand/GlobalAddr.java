package Mindustack.compiler.backend.rvasm.operand;

// to deal with global variable
// lui  %hi(glb)
// lw	a0, %lo(glb)(a0) todo

public class GlobalAddr extends Immediate {
    public GlobalReg reg;

    public GlobalAddr(GlobalReg reg) {
        super("%" + String.format("%s", reg));
        this.reg = reg;
    }


}
