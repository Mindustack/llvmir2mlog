package llvm2mlog.compiler.share.lang;

import llvm2mlog.compiler.backend.rvasm.hierarchy.ASMBuildinFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MLOG {


    public static final int SpLowUnit = 1;
    public static final int I32Unit = 1;
    public static final int MaxStackSize = Integer.MAX_VALUE;
    public static final int MaxDataZoneSize = 0x200;

    public static final String DefaultMemmory = "bank1";
    // --- Register Related ---


    public static final String VirtualRegPrefix = "v";
    public static final String FuncArgRegPrefix = "a";
    public static final String TempRegPrefix = "t";
    public static final String SavedRegPrefix = "s";


    public static final ArrayList<String> RegCalleeSaved = new ArrayList<String>(List.of(


            "s0", "s1", "s2", "s3", "s4", "s5",
            "s6", "s7", "s8", "s9", "s10", "s11"

    ));


    public static final ArrayList<String> FuncArgReg = new ArrayList<String>(List.of(
            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7"
//            ,"a8", "a9", "a10"

    ));
    public static final int MaxArgRegNum = FuncArgReg.size();

    public static final ArrayList<String> RegCallerSaved = new ArrayList<String>(List.of(

            "t0", "t1",
            "t2", "t3", "t4", "t5", "t6"//TempReg
    )) {
        {
            addAll(FuncArgReg);
        }
    };
    public static final ArrayList<String> Reg = new ArrayList<String>(Arrays.asList(
            "zero",
            "ra"//return address
            , "sp" //top of stack
            , "fp" //The address of the frame stack
            , "gp1"
            , "gp2"
            , "gp3"
            //start address of data zone  0 ok
            , "tp"//treads

            , "pc"

    )) {
        {
            addAll(RegCallerSaved);
            addAll(RegCalleeSaved);
        }
    };


    public static final String ByteKeyword = "b";
    public static final String HalfWordKeyword = "h";
    public static final String WordKeyword = "w";


    public static final String AddOperation = "add";
    public static final String SubOperation = "sub";
    public static final String MulOperation = "mul";


    public static final String OrOperation = "or";
    public static final String XorOperation = "xor";
    public static final String ShiftLeftOperation = "shl";//移位
    public static final String ShiftRightOperation = "shr";//too
    public static final String DivOperation = "div";
    public static final String ModOpertion = "mod";
    public static final String GreaterEqualSuffix = "greaterThanEq";
    public static final String GreaterSuffix = "greaterThan";
    public static final String LessEqualSuffix = "lessThanEq";
    public static final String GreaterThanSuffix ="greaterThan" ;
    public static final String LessSuffix = "lessThan";
    public static final String EqualSuffix = "equal";
    public static final String NotEqualSuffix = "notEqual";
    public static final String StrictEqualSuffix = "strictEqual";

    public static final String LessThanOperation = "lessThan";
    public static final String GreaterThanOperation = "greaterThan";
    public static final String LessThanEqOperation = "lessThanEq";
    public static final String GreaterThanEqOperation = "greaterThanEq";
    public static final String EqualOperation = "equal";
    public static final String NotEqualOperation = "notEqual";
    public static final String GPRegPrefix = "gp";
    public static final String MainFunctionIdentifier = "main";



    public static int MaxMemory = 512;

    public static void setup() {
        ASMBuildinFunction.BuildinFunctions.add(new ASMBuildinFunction("print")
                .setInlineCode("print a0\n" +
                        "printflush message1"));
        ASMBuildinFunction.BuildinFunctions.add(new ASMBuildinFunction("IPCall")
                .setCode("IPCall0:\n" +
                        "write 0 bank2 510\n" +
                        "write 0 bank2 509\n" +
                        "write a1 bank2 511\n" +
                        "IPCall5:\n" +
                        "read a1 bank2 510\n" +
                        "jump IPCall5 lessThanEq a1 0\n" +
                        "write 0 bank2 511\n" +
                        "write a1 bank2 509\n" +
                        "write 0 bank2 508\n" +
                        "IPCall10:\n" +
                        "read a1 bank2 508\n" +
                        "jump IPCall10 equal a1 0\n" +
                        "jump IPCall16 greaterThan a1 0\n" +
                        "read b0 bank2 507\n" +
                        "write IPCall_head bank2 508\n" +
                        "set a1 IPCall_head\n" +
                        "op add IPCall_head IPCall_head b0\n" +
                        "IPCall16:\n" +
                        "set @counter ra")
                .init("IPCall_head", 0)
        );
        ASMBuildinFunction.BuildinFunctions.add(new ASMBuildinFunction("IPAccept")
                .setCode("IPAccept0:\n" +
                        "set IPAccept_id a1\n" +
                        "set IPAccept_space 3\n" +
                        "op mul IPAccept_code @thisx @maph\n" +
                        "op add IPAccept_code IPAccept_code @thisy\n" +
                        "IPAccept6:\n" +
                        "read b0 bank2 511\n" +
                        "jump IPAccept6 notEqual b0 IPAccept_id\n" +
                        "write IPAccept_code bank2 510\n" +
                        "IPAccept9:\n" +
                        "read b1 bank2 509\n" +
                        "jump IPAccept9 lessThanEq b1 0\n" +
                        "jump IPAccept6 notEqual b1 IPAccept_code\n" +
                        "write IPAccept_space bank2 507\n" +
                        "write IPAccept_ptr bank2 508\n" +
                        "jump IPAccept17 greaterThanEq IPAccept_ptr 0\n" +
                        "IPAccept15:\n" +
                        "read IPAccept_ptr bank2 508\n" +
                        "jump IPAccept15 lessThan IPAccept_ptr 0\n" +
                        "IPAccept17:\n" +
                        "set a0 IPAccept_ptr\n" +
                        "set @counter ra")
                .init("IPAccept_ptr", -1));
    }
}
