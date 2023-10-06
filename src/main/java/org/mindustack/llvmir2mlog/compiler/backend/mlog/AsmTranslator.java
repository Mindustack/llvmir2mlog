package org.mindustack.llvmir2mlog.compiler.backend.mlog;

import org.mindustack.llvmir2mlog.compiler.share.lang.LLVM;
import org.mindustack.llvmir2mlog.compiler.share.lang.MLOG;
import org.mindustack.llvmir2mlog.compiler.share.misc.Pair;

public class AsmTranslator {

    public static String translateByteWidth(int byteWidth) {
        switch (byteWidth) {
            case 1:
                return MLOG.ByteKeyword;
            case 2:
                return MLOG.HalfWordKeyword;
            case 4:
            case 8:
                return MLOG.WordKeyword; // pointer type 64bit -> 32bit
        }
        return "";
    }

    public static String translateArithmOp(String irOp) {
        switch (irOp) {
            case LLVM.DivInst:
                return MLOG.DivOperation;
            case LLVM.ModInst:
                return MLOG.ModOpertion;
            case LLVM.ShiftLeftInst:
                return MLOG.ShiftLeftOperation;
            case LLVM.ShiftRightInst:
                return MLOG.ShiftRightOperation;
            // notice: LLVM IR and RV32 Asm have many in common
            default:
                return irOp;
        }
    }

    // second param: swap flag (e.g. a > b to b < a)
    public static Pair<String, Boolean> translateCmpOp(String irOp) {
        switch (irOp) {
            case LLVM.GreaterArg:
                return new Pair<>(MLOG.LessSuffix, true);
            case LLVM.GreaterEqualArg:
                return new Pair<>(MLOG.GreaterEqualSuffix, false);
            case LLVM.LessArg:
                return new Pair<>(MLOG.LessSuffix, false);
            case LLVM.LessEqualArg:
                return new Pair<>(MLOG.GreaterEqualSuffix, true);
            case LLVM.EqualArg:
                return new Pair<>(MLOG.EqualSuffix, true);
            case LLVM.NotEqualArg:
                return new Pair<>(MLOG.NotEqualSuffix, true);

            default:
                return new Pair<>(irOp, false);
        }
    }

    public static boolean isCommunicative(String rvOp) {
        switch (rvOp) {
            case MLOG.SubOperation://todo why not add
            case MLOG.DivOperation:
            case MLOG.ModOpertion:
            case MLOG.ShiftLeftOperation:
            case MLOG.ShiftRightOperation:
            case MLOG.LessThanOperation:
//            case MLOG.NotEqualOperation:
//            case MLOG.EqualOperation:
//            case MLOG.GreaterThanOperation:
//            case MLOG.LessThanEqOperation:
//            case MLOG.op
                return false;
            default:
                return true;
        }
    }

    public static boolean hasIType(String rvOp) {
        switch (rvOp) {
            case MLOG.SubOperation:
            case MLOG.MulOperation:
            case MLOG.DivOperation:
            case MLOG.ModOpertion:
                return false;
            default:
                return true;
        }
    }
}
