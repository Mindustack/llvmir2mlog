package org.mindustack.compiler.backend.rvasm.hierarchy;

import org.mindustack.compiler.backend.rvasm.operand.GlobalReg;
import org.mindustack.compiler.share.misc.Pair;

import java.util.ArrayList;

public class AsmModule {

    public ArrayList<AsmFunction> functions = new ArrayList<>();

    public AsmFunction mainFunction;

    public AsmFunction initFunction;

    public ArrayList<Pair<Double, Integer>> dataZone = new ArrayList<>();

    public ArrayList<GlobalReg> globalVarSeg = new ArrayList<>();
    public ArrayList<ASMBuildinFunction> builtinFunctions = new ArrayList<>();

//    public ArrayList<GlobalReg> stringConstSeg = new ArrayList<>();
}
