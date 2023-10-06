package org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy;

import org.mindustack.llvmir2mlog.compiler.backend.mlog.operand.GlobalReg;
import org.mindustack.llvmir2mlog.compiler.share.misc.Pair;

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
