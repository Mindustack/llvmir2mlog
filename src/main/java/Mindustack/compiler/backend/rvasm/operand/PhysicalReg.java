package Mindustack.compiler.backend.rvasm.operand;

import Mindustack.compiler.share.lang.MLOG;

import java.util.ArrayList;
import java.util.HashMap;

public class PhysicalReg extends Register {
    /*
     * RV32 Physical Reg Arch
     */
    public static final HashMap<String, PhysicalReg> phyRegs = new HashMap<>() {
        {
            MLOG.Reg.forEach(regName -> put(regName, new PhysicalReg(regName)));
        }
    };

    // calling convention
    public static ArrayList<PhysicalReg> callerSaved = new ArrayList<>() {
        {
            MLOG.RegCallerSaved.forEach(regName -> add(phyRegs.get(regName)));
            add(reg("ra"));
        }
    };
    public static ArrayList<PhysicalReg> calleeSaved = new ArrayList<>() {
        {
            MLOG.RegCalleeSaved.forEach(regName -> add(phyRegs.get(regName)));
        }
    };
    public static ArrayList<PhysicalReg> assignable = new ArrayList<>() {
        {
            addAll(callerSaved);
            addAll(calleeSaved);
        }
    };


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

    public static PhysicalReg gp(int index) {
        return phyRegs.get(MLOG.GPRegPrefix + index);
    }
}
