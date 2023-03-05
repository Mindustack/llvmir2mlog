package masterball.compiler.share.lang;

import java.util.ArrayList;
import java.util.Arrays;

public class MLOG {
    // --- Sys Config for RV ---

  //  public static final int ImmBound = (1 << 20);
  public static final int SpLowUnit = 1;
    public static final int I32Unit = 1;
    public static final int MaxStackSize = Integer.MAX_VALUE;


    // --- Register Related ---

    public static final int MaxArgRegNum = 8;
    public static final String VirtualRegPrefix = "v";
    public static final String FuncArgRegPrefix = "a";
    public static final String TempRegPrefix = "t";
    public static final String SavedRegPrefix = "s";
    public static final ArrayList<String> RV32Reg = new ArrayList<String>(Arrays.asList(
            "zero", "ra", "sp", "gp", "tp",

            "a0", "a1", "a2", "a3", "a4", "a5", "a6", "a7",
            "s0", "s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s11",
            "t0", "t1", "t2", "t3", "t4", "t5", "t6"
    ));

    // --- Byte Width Keyword ---

    public static final String ByteKeyword = "b";
    public static final String HalfWordKeyword = "h";
    public static final String WordKeyword = "w";

    // --- Compare Suffix ---

    public static final String GreaterEqualSuffix = "greaterThan";
    public static final String LessSuffix = "lessThan";
    public static final String EqualSuffix = "equal";
    public static final String NotEqualSuffix = "notEqual";

    // --- RV32 Inst ---

    //  public static final String ITypeSuffix = "i";

    public static final String BrInstPrefix = "jump";
    public static final String CallInst = "jump always";
    public static final String JmpInstPrefix = "jump always";
    public static final String LaInst = "set";//将地址值rot加载到寄存器rd
    public static final String LiInst = "set";//将立即数imm加载到寄存器rd
    public static final String LoadInstPrefix = "read";
    public static final String StoreInstPrefix = "write";
    // public static final String LuiInst = "lui";// 加载立即数到高位（lui）将 20 位常量加载到寄存器的高 20 位。
    public static final String MvInst = "set";
    public static final String RetInst = "set @counter ra";
    public static final String SltInst = "slt";// todo part of op 
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


    public static final String AddInst = "add";
    public static final String SubInst = "sub";
    public static final String MulInst = "mul";
    public static final String AndInst = "and";
    public static final String OrInst = "or";
    public static final String XorInst = "xor";
    public static final String ShiftLeftInst = "sll";//移位
    public static final String ShiftRightInst = "sra";//too
    public static final String DivInst = "div";
    public static final String ModInst = "mod";
}
/*
## Native functions:
* read `result`, `cell`, `position`
    * Read data from `cell` at `position` to `result`
* write `data`, `cell`, `position`
    * Write `data` to `cell` at `position`
* draw `operation`, `arg0` ... `arg5`
    * Add a draw `operation` to the draw buffer
    * Operations:
        * clear `red`, `green`, `blue`
        * color `red`, `green`, `blue`, `alpha`
        * stroke `width`
        * line `x1`, `y1`, `x2`, `y2`
        * rect `x`, `y`, `width`, `height`
        * lineRect `x`, `y`, `width`, `height`
        * poly `x`, `y`, `sides`, `radius`, `rotation`
        * linePoly  `x`, `y`, `sides`, `radius`, `rotation`
        * triangle `x1`, `y1`, `x2`, `y2`, `x3`, `y3`
        * image `x`, `y`, `image`, `size`, `rotation`
* drawflush `display`
    * Flush the draw buffer to `display`
* print `message`
    * Add `message` to the draw buffer
* printflush `message`
    * Flush the draw buffer to `message`
* getlink `result`, `n`
    * Put the `n`th link to `result`
* control `command`, `block`, `arg0` ... `arg2`
    * Control `block`
    * Commands:
        * enabled `block`, `enabled`
        * shoot `block`, `x`, `y`, `shoot`
        * shootp `block`, `unit`, `shoot`
        * config `block`, `configuration`
        * color `block`, `red`, `green`, `blue`
* radar `filter0` ... `filter2`, `sort`, `block`, `order`, `result`
    * Find an unit near `block` and store it in `result`
    * Filters:
        * any
        * enemy
        * ally
        * player
        * attacker
        * flying
        * boss
        * ground
    * Sort:
        * distance
        * health
        * shield
        * armor
        * maxHealth
* sensor `result`, `block`, `parameter`
    * Get `parameter` of `block` and store it in `result`
* op `operation`, `result`, `op0`, `op1`
    * Perform a mathematical operation
    * Operations:
        * Basic: add, sub, mul, div, idiv (integer division), mod, pow, lessThan, lessThanEq, greaterThan, greaterThanEq, max, min, abs, log, log10, floor, ceil, sqrt, sin, cos, tan, asin, acos, atan, equal, notEqual
        * Bitwise: shl (shift left), shr (shift right), or, and, xor, not
        * Special:
            * strictEqual - doesn't coerce types
            * land - logic and
            * angle - angle of vector
            * len - length of vector
            * noise - simplex noise
            * rand - random number
* wait `time`
    * Wait `time` seconds
* lookup `type`, `result`, `id`
    * Look up `type` by `id`
    * Types:
        * block
        * unit
        * item
        * liquid
* end
    * End the program
* jump `position`, `condition`, `op0`, `op1`
    * Jump to `position` if `condition` is met
    * Conditions:
        * equal
        * notEqual
        * lessThan
        * lessThanEq
        * greaterThan
        * greaterThanEq
        * strictEqual
        * always
* ubind `type`
    * Bind next unit of type `type` and store it in `@unit`
* ucontrol `command`, `op0` ... `op4`
    * Control the bound unit
    * Commands:
        * idle
        * stop
        * move `x`, `y`
        * approach `x`, `y`, `radius`
        * boost `enable`
        * pathfind
        * target `x`, `y`, `shoot`
        * targetp `unit`, `shoot`
        * itemDrop `to`, `amount`
        * itemTake `from`, `item`, `amount`
        * payDrop
        * payTake `takeUnits`
        * mine `x`, `y`
        * flag `value`
        * build `x`, `y`, `block`, `rotation`, `configuration`
        * getBlock `x`, `y`, `type`, `building`
        * within `x`, `y`, `radius`, `result`
* uradar `filter0` ... `filter2`, `sort`, `___`, `order`, `result`
    * Same as radar, except `block` is replaced by `@unit`
* ulocate `type`, `arg0` ... `arg2`, `outx`, `outy`, `found`, `building`
    * Locate block of type `type`
    * Types:
        * ore `___`, `___`, `oreType`
        * building `group`, `enemy`, `___`
        * spawn `___`, `___`, `___`
        * damaged `___`, `___`, `___`
    * Building groups:
        * core
        * storage
        * generator
        * turret
        * factory
        * repair
        * rally
        * battery
        * reactor

* mathematical functions (replacement for `op`):
    * mod
    * pow
    * and, or, xor, not
    * max, min
    * abs
    * log, log10
    * ceil, floor
    * sqrt
    * sin, cos, tan
    * asin, acos, atan
 
*/
