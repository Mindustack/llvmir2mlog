package masterball.compiler.share.lang;

import java.util.ArrayList;
import java.util.Arrays;

public class RV32I {
    // --- Sys Config for RV ---

    public static final int ImmBound = (1 << 20);
    public static final int SpLowUnit = 16;
    public static final int I32Unit = 4;
    public static final int MaxStackSize = Integer.MAX_VALUE;


    // --- Register Related ---

    public static final int MaxArgRegNum = 8;
    public static final String VirtualRegPrefix = "v";
    public static final String FuncArgRegPrefix = "a";
    public static final String TempRegPrefix = "t";
    public static final String SavedRegPrefix = "s";
    public static final ArrayList<String> RV32Reg = new ArrayList<String>(Arrays.asList(
            "zero", "ra", "sp", "gp", "tp", "t0", "t1", "t2", "s0", "s1",
            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7",
            "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
            "t3", "t4", "t5", "t6"
    ));

    // --- Byte Width Keyword ---

    public static final String ByteKeyword = "b";
    public static final String HalfWordKeyword = "h";
    public static final String WordKeyword = "w";

    // --- Compare Suffix ---

    public static final String GreaterEqualSuffix = "ge";
    public static final String LessSuffix = "lt";
    public static final String EqualSuffix = "eq";
    public static final String NotEqualSuffix = "ne";

    // --- RV32 Inst ---

    public static final String ITypeSuffix = "i";
    public static final String BrInstPrefix = "b";
    public static final String CallInst = "call";
    public static final String JmpInstPrefix = "jump";
    public static final String LaInst = "set";//将地址值rot加载到寄存器rd
    public static final String LiInst = "set";//将立即数imm加载到寄存器rd
    public static final String LoadInstPrefix = "read";
    public static final String StoreInstPrefix = "write";
    // public static final String LuiInst = "lui";// 加载立即数到高位（lui）将 20 位常量加载到寄存器的高 20 位。
    public static final String MvInst = "set";
    public static final String RetInst = "return";
    public static final String SltInst = "slt";
    //与条件控制流指令类似，RV32I还提供了一组条件置位指令set。它会通过判断指令中给定的条件然会对目标寄存器置0或1。
    public static final String SeqzInst = "seqz";
    public static final String SnezInst = "snez";
    /*
    slt rd, rs1, rs2	如果rs1值小于rs2（有符号），则rd置1，否则置0
slti rd, rs1, imm	如果rs1值小于立即数imm（符号扩展后），则rd置1，否则置0
sltu rd, rs1, rs2	如果rs1值小于rs2（无符号），则rd置1，否则置0
sltui rd, rs1, imm	如果rs1值小于立即数imm（无符号），则rd置1，否则置0

seqz rd, rs1	如果rs1值等于0，则rd置1，否则置0（伪指令）
snez rd, rs1	如果rs1值不等于0，则rd置1，否则置0（伪指令）
sltz rd, rs1	如果rs1值小于0，则rd置1，否则置0（伪指令）
sgtz rd, rs1	如果rs1值大于0，则rd置1，否则置0（伪指令） 
*/
    public static final String TailInst = "tail";


    public static final String AddInst = "op add";
    public static final String SubInst = "op sub";
    public static final String MulInst = "op mul";
    public static final String AndInst = "op and";
    public static final String OrInst = "op or";
    public static final String XorInst = "op xor";
    public static final String ShiftLeftInst = "op sll";//移位
    public static final String ShiftRightInst = "op sra";//too
    public static final String DivInst = "op div";
    public static final String ModInst = "op rem";
}
