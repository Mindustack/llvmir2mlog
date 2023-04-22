package Mindustack.compiler.backend.rvasm;

import Mindustack.compiler.backend.rvasm.inst.AsmBaseInst;
import Mindustack.compiler.backend.rvasm.operand.PhysicalReg;
import Mindustack.compiler.share.lang.MLOG;
import Mindustack.compiler.share.misc.Pair;

import java.util.ArrayList;

public class AsmFormatter {

    public final static String TAB = "\t";

    public static ArrayList<String> DataInitFormat(ArrayList<Pair<Double, Integer>> value) {
        ArrayList<String> ret = new ArrayList<>();
        for (Pair<Double, Integer> data : value) {

            if (data.first() == 0) continue;
            ret.add(String.format("%s %s cell %s",
                    MLOG.StoreInstPrefix
                    , data.first(), data.second()));//todo cell?
//        return ;
        }
        /*
            .type	.Lanon.strconst,@object # @anon.strconst
            .section	.rodata.str1.1,"aMS",@progbits,1
        .Lanon.strconst:
            .asciz	"Hello World!"
            .size	.Lanon.strconst, 13
         */

//
//        ret.add(TAB + ".section" + TAB + ".rodata");
//        ret.add(globalReg.identifier + ":");
//        ret.add(TAB + ".asciz" + TAB + "\"" + globalReg.stringDataFormat() + "\"");
//        ret.add(TAB + ".size" + TAB + globalReg.identifier + ", " + globalReg.stringConst.length());
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
//    public static ArrayList<String> globalVariableFormat(GlobalReg globalReg) {
//        /*
//        	.type	glb,@object             # @glb
//            .section	.sbss,"aw",@nobits
//            .globl	glb
//            .p2align	2
//        glb:
//            .word	0                       # 0x0
//            .size	glb, 4
//
//         */
//        ArrayList<String> ret = new ArrayList<>();
//        ret.add(TAB + ".type" + TAB + globalReg + ",@object");
//        ret.add(TAB + ".section" + TAB + ".bss");
//        ret.add(TAB + ".globl" + TAB + globalReg.identifier);
//        ret.add(globalReg.identifier + ":");
//        ret.add(TAB + ".word" + TAB + 0);
//        ret.add(TAB + ".size" + TAB + globalReg.identifier + ", 4");
//        return ret;
//    }

//    public static ArrayList<String> functionHeaderFormat(AsmFunction function) {
//        ArrayList<String> ret = new ArrayList<>();
//        ret.add(TAB + ".globl" + TAB + function);
//        ret.add(TAB + ".p2align" + TAB + "1");
//        ret.add(TAB + ".type" + TAB + function + "," + "@function");
//        return ret;
//    }

    public static String instFormat(AsmBaseInst inst) {
        return TAB + inst.format();
    }
}
