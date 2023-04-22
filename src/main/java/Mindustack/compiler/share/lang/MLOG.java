package Mindustack.compiler.share.lang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MLOG {


    public static final int SpLowUnit = 1;
    public static final int I32Unit = 1;
    public static final int MaxStackSize = Integer.MAX_VALUE;
    public static final int MaxDataZoneSize = 0x200;


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
            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7"//FuncArgReg//FuncArgReg

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


    public static final String BrInstPrefix = "jump";


    public static final String CallInst = "jump always";
    public static final String JmpInstPrefix = "jump always";
    public static final String LiInst = "set";//将立即数imm加载到寄存器rd
    public static final String LoadInstPrefix = "read";
    public static final String StoreInstPrefix = "write";
    // public static final String LuiInst = "lui";// 加载立即数到高位（lui）将 20 位常量加载到寄存器的高 20 位。
    public static final String MvInst = "set";
    public static final String RetInst = "set @counter ra";
    public static final String TailInst = "jump always";

    public static final String LabelForTailSuffix = "_LabelForTail";

    public static final String AddOperation = "add";
    public static final String SubOperation = "sub";
    public static final String MulOperation = "mul";


    public static final String OrOperation = "or";
    public static final String XorOperation = "xor";
    public static final String ShiftLeftOperation = "sll";//移位
    public static final String ShiftOperation = "sra";//too
    public static final String DivOperation = "div";
    public static final String ModOpertion = "mod";
    public static final String GreaterEqualSuffix = "greaterThanEq";
    public static final String GreaterSuffix = "greaterThan";
    public static final String LessEqualSuffix = "lessThanEq";

    //  public static final String GreaterThanSuffix ="greaterThan" ;


    public static final String LessSuffix = "lessThan";
    public static final String EqualSuffix = "equal";
    public static final String NotEqualSuffix = "notEqual";
    public static final String StrictEqualSuffix = "strictEqual";

    public static final String LessThanOperation = "lessThan";
    //与条件控制流指令类似，RV32I还提供了一组条件置位指令set。它会通过判断指令中给定的条件然会对目标寄存器置0或1。

    /*Conditions:
     * equal
     * notEqual
     * lessThan
     * lessThanEq
     * greaterThan
     * greaterThanEq
     * strictEqual
     */
    public static final String GreaterThanOperation = "greaterThan";
    public static final String LessThanEqOperation = "lessThanEq";
    public static final String GreaterThanEqOperation = "greaterThanEq";
    public static final String EqualOperation = "equal";
    public static final String NotEqualOperation = "notEqual";
    public static final String GPRegPrefix = "gp";
}
