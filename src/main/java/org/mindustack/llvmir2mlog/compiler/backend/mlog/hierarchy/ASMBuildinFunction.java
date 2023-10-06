package org.mindustack.llvmir2mlog.compiler.backend.mlog.hierarchy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;

public class ASMBuildinFunction extends AsmFunction {
    public static final ArrayList<ASMBuildinFunction> BuildinFunctions = new ArrayList<>();
    public boolean inline = false;
    public LinkedHashMap<String, Double> varInitMap = new LinkedHashMap<>();
    String inlineCode;
    String code;

    public ASMBuildinFunction(String identifier) {
        super(identifier);
    }

    public static ASMBuildinFunction get(String identifier) {

        var asmBuildinFunction = BuildinFunctions.stream().filter(asmBuildinFunc -> Objects.equals(asmBuildinFunc.identifier, identifier)).findFirst().get();

//        asmBuildinFunction.allocaStackUse=0;
        asmBuildinFunction.arguments.clear();
        asmBuildinFunction.blocks.clear();
//        asmBuildinFunction.calleeArgStackUse=0;
//        asmBuildinFunction.callerArgStackUse=0;
        asmBuildinFunction.entryBlock = null;
        asmBuildinFunction.exitBlock = null;
//        asmBuildinFunction.spillStackUse=0;
//        asmBuildinFunction.totalStackUse=0;
        return asmBuildinFunction;
    }

    public String getCode() {
        return code;
    }

    public ASMBuildinFunction setCode(String code) {
        if (code == null) {
            return this;
        }
        this.inline = false;
        this.code = code;
        return this;
    }

    public String getInlineCode() {
        return inlineCode;
    }

    public ASMBuildinFunction setInlineCode(String inlineCode) {
        if (inlineCode == null) {
            return this;
        }
        this.inline = true;
        this.inlineCode = inlineCode;
        return this;
    }

    public ASMBuildinFunction init(String var, double value) {
        this.varInitMap.put(var, value);
        return this;
    }
}
