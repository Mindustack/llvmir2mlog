package masterball.compiler.backend.rvasm;

import masterball.compiler.backend.rvasm.hierarchy.AsmBlock;
import masterball.compiler.backend.rvasm.hierarchy.AsmFunction;
import masterball.compiler.backend.rvasm.inst.AsmLiInst;
import masterball.compiler.backend.rvasm.operand.*;
import masterball.compiler.middleend.llvmir.Value;
import masterball.compiler.middleend.llvmir.constant.BoolConst;
import masterball.compiler.middleend.llvmir.constant.NullptrConst;
import masterball.compiler.middleend.llvmir.constant.NumConst;
import masterball.compiler.share.error.codegen.UnimplementedError;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class AsmCurrent {

    public AsmBlock block;
    public AsmFunction func;

    public Map<Integer, Register> recordLi = new HashMap<>();

    public Register toReg(@NotNull Value value) {
        if (value.asmOperand != null) {
            return (Register) value.asmOperand;
        }
        Integer intValue = null;
        if (value instanceof NumConst) intValue = ((NumConst) value).constData;
        else if (value instanceof BoolConst) intValue = ((BoolConst) value).constData ? 1 : 0;
        else if (value instanceof NullptrConst) intValue = 0;

        if (intValue != null && intValue == 0) {
            value.asmOperand = PhysicalReg.reg("zero");
            return PhysicalReg.reg("zero");
        }

        Register ret;

        if (recordLi.containsKey(intValue)) {
            ret = recordLi.get(intValue);
        } else {
            ret = new VirtualReg(value.type.size());
            if (intValue != null) {
                new AsmLiInst(ret, new Immediate(intValue), this.block);
                recordLi.put(intValue, ret);
            }
        }

        // const info is memorized by Li
        if (!(value instanceof NumConst || value instanceof BoolConst)) value.asmOperand = ret;
        return ret;
    }

    public Immediate toImm(int value) {
      //  if (value < -1 * RV32I.ImmBound || value > RV32I.ImmBound)
        //    throw new InternalError("invalid immediate detected");
        return new Immediate(value);
    }

    public Immediate toImm(Value value) {
        if (value.asmOperand instanceof RawStackOffset) return (Immediate) value.asmOperand;
        if (value instanceof NumConst) return new Immediate(((NumConst) value).constData);
        if (value instanceof BoolConst) return new Immediate(((BoolConst) value).constData ? 1 : 0);
        throw new UnimplementedError(this);
    }
}
