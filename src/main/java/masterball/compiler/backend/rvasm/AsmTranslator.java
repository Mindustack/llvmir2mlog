package masterball.compiler.backend.rvasm;

import masterball.compiler.share.lang.LLVM;
import masterball.compiler.share.lang.MLOG;
import masterball.compiler.share.misc.Pair;

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
                return MLOG.DivInst;
            case LLVM.ModInst:
                return MLOG.ModInst;
            case LLVM.ShiftLeftInst:
                return MLOG.ShiftLeftInst;
            case LLVM.ShiftRightInst:
                return MLOG.ShiftRightInst;
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
            default:
                return new Pair<>(irOp, false);
        }
    }

    public static boolean isCommunicative(String rvOp) {
        switch (rvOp) {
            case MLOG.SubInst:
            case MLOG.DivInst:
            case MLOG.ModInst:
            case MLOG.ShiftLeftInst:
            case MLOG.ShiftRightInst:
            case MLOG.SltInst:
                return false;
            default:
                return true;
        }
    }

    public static boolean hasIType(String rvOp) {
        switch (rvOp) {
            case MLOG.SubInst:
            case MLOG.MulInst:
            case MLOG.DivInst:
            case MLOG.ModInst:
                return false;
            default:
                return true;
        }
    }
}
