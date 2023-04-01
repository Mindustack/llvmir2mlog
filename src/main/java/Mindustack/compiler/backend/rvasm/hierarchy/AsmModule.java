package Mindustack.compiler.backend.rvasm.hierarchy;

import Mindustack.compiler.backend.rvasm.operand.GlobalReg;

import java.util.ArrayList;

public class AsmModule {

    public ArrayList<AsmFunction> functions = new ArrayList<>();
    public ArrayList<GlobalReg> globalVarSeg = new ArrayList<>();
    public ArrayList<GlobalReg> stringConstSeg = new ArrayList<>();
}
