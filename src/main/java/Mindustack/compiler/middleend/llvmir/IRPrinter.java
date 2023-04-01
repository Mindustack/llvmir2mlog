package Mindustack.compiler.middleend.llvmir;

import Mindustack.compiler.middleend.llvmir.constant.GlobalVariable;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import Mindustack.compiler.middleend.llvmir.hierarchy.IRModule;
import Mindustack.compiler.middleend.llvmir.inst.IRBaseInst;
import Mindustack.compiler.share.pass.IRBlockPass;
import Mindustack.compiler.share.pass.IRFuncPass;
import Mindustack.compiler.share.pass.IRModulePass;

import java.io.PrintStream;

public class IRPrinter implements IRModulePass, IRFuncPass, IRBlockPass {

    private static final String INDENT = "  ";

    // based on hierarchy

    private final PrintStream ps;


    public IRPrinter(PrintStream ps) {
        this.ps = ps;

    }

    @Override
    public void runOnFunc(IRFunction function) {
        ps.println(IRFormatter.funcDefFormat(function) + " {");
        ps.print("\n");
        for (int i = 0; i < function.blocks.size(); i++) {
            runOnBlock(function.blocks.get(i));
            ps.print("\n");
        }
        ps.println("}\n");
    }

    @Override
    public void runOnBlock(IRBlock block) {
        block.setComment();
        ps.println(block.name + ":" + block.commentFormat());
        for (IRBaseInst inst : block.phiInsts) {
            ps.println(INDENT + IRFormatter.instFormat(inst));
        }
        for (IRBaseInst inst : block.instructions) {
            ps.println(INDENT + IRFormatter.instFormat(inst));
        }
    }

    @Override
    public void runOnModule(IRModule module) {
//        ps.printf("; ModuleID = '%s'%n", mxFileName);
//        ps.printf("source_filename = \"%s\"%n", mxFileName);
//        ps.println(TargetInfo.dataLayout);
//        ps.println(TargetInfo.triple + "\n");

        for (IRFunction func : module.builtinFunctions) ps.println(IRFormatter.funcDeclFormat(func));
        ps.print('\n');

        for (GlobalVariable globalVar : module.globalVarSeg) ps.println(IRFormatter.globalVarInitFormat(globalVar));
        if (module.globalVarSeg.size() > 0) ps.print('\n');

//        for (StringConst stringConst : module.stringConstSeg)
//            ps.println(IRFormatter.stringConstInitFormat(stringConst));
        // if (module.stringConstSeg.size() > 0) ps.print('\n');

        //for (StructProto structProto : module.classes) ps.println(IRFormatter.classInitFormat(structProto));

        // if (module.classes.size() > 0) ps.print('\n');
        for (IRFunction func : module.functions) runOnFunc(func);

    }

}
