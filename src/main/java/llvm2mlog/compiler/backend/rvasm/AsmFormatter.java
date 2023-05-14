package llvm2mlog.compiler.backend.rvasm;

import llvm2mlog.compiler.backend.rvasm.hierarchy.AsmFunction;
import llvm2mlog.compiler.backend.rvasm.inst.AsmBaseInst;
import llvm2mlog.compiler.backend.rvasm.operand.GlobalReg;
import llvm2mlog.compiler.backend.rvasm.operand.PhysicalReg;
import llvm2mlog.compiler.share.lang.MLOG;
import llvm2mlog.compiler.share.misc.Pair;

import java.util.ArrayList;

public class AsmFormatter {

    public static ArrayList<String> DataInitFormat(ArrayList<Pair<Double, Integer>> value) {
        ArrayList<String> ret = new ArrayList<>();


        for (Pair<Double, Integer> data : value) {

            if (data.first() == 0) continue;
            ret.add(String.format("%s %s cell %s",
                    "write"
                    , data.first(), data.second()));//todo cell?
        }
        return ret;
    }

    public static ArrayList<String> RegInitFormat() {
        ArrayList<String> ret = new ArrayList<>();

        ret.add(String.format(
                "set %s %s"
                , PhysicalReg.reg("fp"), MLOG.MaxMemory));//todo 512?
        ret.add(String.format("set %s %s"
                , PhysicalReg.reg("sp"), PhysicalReg.reg("fp")));
        ret.add(String.format(
                "set %s %s"
                , PhysicalReg.reg("zero"), 0));

        return ret;
    }

    public static ArrayList<String> globalVariableFormat(GlobalReg globalReg) {

        ArrayList<String> ret = new ArrayList<>();
        ret.add("\t\t#globlvar " + globalReg.identifier);

        return ret;
    }

    public static ArrayList<String> functionHeaderFormat(AsmFunction function) {
        ArrayList<String> ret = new ArrayList<>();
        ret.add("\t\t" + "# -- Start function " + function);
        return ret;
    }

    public static String instFormat(AsmBaseInst inst) {
        return "\t" + inst.format();
    }

}
