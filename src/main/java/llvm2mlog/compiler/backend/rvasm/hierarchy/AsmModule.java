package llvm2mlog.compiler.backend.rvasm.hierarchy;

import llvm2mlog.compiler.backend.rvasm.operand.GlobalReg;
import llvm2mlog.compiler.share.misc.Pair;

import java.util.ArrayList;

public class AsmModule {

    public ArrayList<AsmFunction> functions = new ArrayList<>();

    public AsmFunction mainFunction;

    public AsmFunction initFunction;

    public ArrayList<Pair<Double, Integer>> dataZone = new ArrayList<>();

    public ArrayList<GlobalReg> globalVarSeg = new ArrayList<>();
    public ArrayList<AsmFunction> builtinFunctions = new ArrayList<>();

//    public ArrayList<GlobalReg> stringConstSeg = new ArrayList<>();
}
