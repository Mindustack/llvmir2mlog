package Mindustack.compiler.backend.rvasm;

import Mindustack.compiler.backend.rvasm.hierarchy.AsmFunction;
import Mindustack.compiler.backend.rvasm.inst.AsmBaseInst;
import Mindustack.compiler.backend.rvasm.operand.GlobalReg;
import Mindustack.compiler.backend.rvasm.operand.PhysicalReg;
import Mindustack.compiler.share.lang.MLOG;
import Mindustack.compiler.share.misc.Pair;

import java.util.ArrayList;

public class AsmFormatter {

    public static ArrayList<String> DataInitFormat(ArrayList<Pair<Double, Integer>> value) {
        ArrayList<String> ret = new ArrayList<>();
        for (Pair<Double, Integer> data : value) {

            if (data.first() == 0) continue;
            ret.add(String.format("%s %s cell %s",
                    MLOG.StoreInstPrefix
                    , data.first(), data.second()));//todo cell?
        }
        return ret;
    }

    public static ArrayList<String> RegInitFormat() {
        ArrayList<String> ret = new ArrayList<>();

        ret.add(String.format("%s %s %s",
                MLOG.MvInst
                , PhysicalReg.reg("fp"), 64));//todo 512?
        ret.add(String.format("%s %s %s",
                MLOG.MvInst
                , PhysicalReg.reg("sp"), PhysicalReg.reg("fp")));

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
