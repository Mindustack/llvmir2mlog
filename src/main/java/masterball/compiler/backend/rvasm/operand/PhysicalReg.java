package masterball.compiler.backend.rvasm.operand;

import masterball.compiler.share.lang.MLOG;

import java.util.ArrayList;
import java.util.HashMap;

public class PhysicalReg extends Register {
    /*
     * RV32 Physical Reg Arch
     */
    public static final HashMap<String, PhysicalReg> phyRegs = new HashMap<>() {
        {
            MLOG.RV32Reg.forEach(regName -> put(regName, new PhysicalReg(regName)));
        }
    };
    // calling convention
    public static ArrayList<PhysicalReg> callerSaved = new ArrayList<>();
    public static ArrayList<PhysicalReg> calleeSaved = new ArrayList<>();
    public static ArrayList<PhysicalReg> assignable = new ArrayList<>();

    static {
        for (int i = 0; i <= 6; ++i) callerSaved.add(t(i));
        for (int i = 0; i <= 7; ++i) callerSaved.add(a(i));
        callerSaved.add(reg("ra"));

        for (int i = 0; i <= 11; ++i) calleeSaved.add(s(i));

        assignable.addAll(callerSaved);
        assignable.addAll(calleeSaved);
    }

    public PhysicalReg(String identifier) {
        super(identifier);
    }

    public static PhysicalReg reg(String regName) {
        return phyRegs.get(regName);
    }

    public static PhysicalReg a(int index) {
        return phyRegs.get(MLOG.FuncArgRegPrefix + index);
    }

    public static PhysicalReg t(int index) {
        return phyRegs.get(MLOG.TempRegPrefix + index);
    }

    public static PhysicalReg s(int index) {
        return phyRegs.get(MLOG.SavedRegPrefix + index);
    }
}
