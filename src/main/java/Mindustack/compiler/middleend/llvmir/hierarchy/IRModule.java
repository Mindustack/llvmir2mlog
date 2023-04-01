package Mindustack.compiler.middleend.llvmir.hierarchy;

import Mindustack.compiler.middleend.llvmir.constant.GlobalVariable;
import Mindustack.compiler.share.error.codegen.InternalError;
import Mindustack.compiler.share.lang.LLVM;

import java.util.ArrayList;
import java.util.Objects;

public class IRModule {

    public ArrayList<IRFunction> functions = new ArrayList<>();
    public ArrayList<IRFunction> builtinFunctions = new ArrayList<>();
 //  public ArrayList<StructProto> classes = new ArrayList<>();

    // static data segment
    public ArrayList<GlobalVariable> globalVarSeg = new ArrayList<>();
    //public ArrayList<StringConst> stringConstSeg = new ArrayList<>();



    public IRFunction getMalloc() {
        return builtinFunctions.get(0);
    }

    public IRFunction getBuiltinFunction(String name) {
        for (IRFunction builtinFunction : builtinFunctions) {
            if (Objects.equals(builtinFunction.name, LLVM.BottomStrFuncPrefix + name))
                return builtinFunction;
            if (Objects.equals(builtinFunction.name, name))
                return builtinFunction;
        }
        throw new InternalError(name);
    }

    public IRFunction getStrMethod(String op) {
        for (IRFunction builtinFunction : builtinFunctions) {
            if (Objects.equals(builtinFunction.name, LLVM.BottomStrFuncPrefix + op))
                return builtinFunction;
        }
        throw new InternalError(op);
    }
//     public void setBottomFunctions() {
//
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomPrefix + "malloc",
//                IRTranslator.heapPointerType, IRTranslator.i32Type));
//
//
//
////        todo wtf2
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.StrCatArg,
//                IRTranslator.stringType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.EqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.NotEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.LessArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.LessEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.GreaterArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//
//        builtinFunctions.add(new IRFunction(LLVM.BottomStrFuncPrefix + LLVM.GreaterEqualArg,
//                IRTranslator.boolType, IRTranslator.stringType, IRTranslator.stringType));
//    }

//    public StringConst getStringConst(String constData) {
//        for (StringConst stringConst : stringConstSeg) {
//            if (Objects.equals(stringConst.constData, constData))
//                return stringConst;
//        }
//
//        StringConst stringConst = new StringConst(constData);
//        stringConstSeg.add(stringConst);
//        return stringConst;
//    }
}
