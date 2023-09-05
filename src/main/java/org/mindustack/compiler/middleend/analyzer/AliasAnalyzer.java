package org.mindustack.compiler.middleend.analyzer;

import org.mindustack.compiler.middleend.llvmir.Value;
import org.mindustack.compiler.middleend.llvmir.constant.NumConst;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRBlock;
import org.mindustack.compiler.middleend.llvmir.hierarchy.IRFunction;
import org.mindustack.compiler.middleend.llvmir.inst.IRBaseInst;
import org.mindustack.compiler.middleend.llvmir.inst.IRBitCastInst;
import org.mindustack.compiler.middleend.llvmir.inst.IRCallInst;
import org.mindustack.compiler.middleend.llvmir.inst.IRGetElementPtrInst;
import org.mindustack.compiler.middleend.llvmir.type.PointerType;
import org.mindustack.compiler.share.misc.UnionSet;
import org.mindustack.compiler.share.pass.IRFuncPass;
import org.mindustack.debug.Log;

import java.util.HashSet;
import java.util.Objects;

/**
 * simple alias analyzer implemented
 * <p>
 * when will two pointers alias?
 * - store
 * - getelementptr
 * - move (no appearance now)
 * <p>
 * so start to think:
 * edge: p* store in p**
 * <p>
 * start from call malloc / global, a new pointer, mark p* -> p**
 * if there is a store: q* -> p**, mark p** uncertain.
 * <p>
 * alias between two pointers:
 * if one is getelementptr, use headPointer to compare
 * if headPointer is matched,
 * check index (if index is constant)
 * if index unsure, return mayAlias
 * <p>
 * if anyone is uncertain: return if type match (basic judge)
 * if all certain, return equals
 * <p>
 * alloc: no appearance
 */

public class AliasAnalyzer implements IRFuncPass {

    private final HashSet<Value> certain = new HashSet<>();
    private final UnionSet<Value> bitcastUnion = new UnionSet<>();

    @Override
    public void runOnFunc(IRFunction function) {
        Log.info("alias analyzer", function.identifier());

        certain.clear();
        bitcastUnion.clear();
        certain.addAll(function.parentModule.globalVarSeg);
        //certain.addAll(function.parentModule.stringConstSeg);

        for (IRBlock block : function.blocks)
            for (IRBaseInst inst : block.instructions) {
                if (inst instanceof IRCallInst && Objects.equals(((IRCallInst) inst).callFunc(), function.parentModule.getBuiltinFunction("malloc")))//todo maybe it is called this
                    certain.add(inst);
                if (inst instanceof IRBitCastInst && ((IRBitCastInst) inst).fromValue().type instanceof PointerType) {
                    // Log.info("bslink", inst.format());
                    bitcastUnion.setAlias(inst, ((IRBitCastInst) inst).fromValue());
                    // Log.info("tryget", bitcastUnion.getAlias(inst).identifier());
                }
            }
    }

    public boolean mayAlias(Value addr1, Value addr2) {
        // Log.info("alias", addr1.identifier(), addr2.identifier());

        addr1 = bitcastUnion.getAlias(addr1);
        addr2 = bitcastUnion.getAlias(addr2);

        // Log.info("bitcast", addr1.identifier(), addr2.identifier());

        if (certain.contains(addr1) || certain.contains(addr2)) {
            return addr1.equals(addr2);
        }

        if (addr1 instanceof IRGetElementPtrInst) {
            if (addr2 instanceof IRGetElementPtrInst) {
                boolean ret = mayAlias(((IRGetElementPtrInst) addr1).headPointer(), ((IRGetElementPtrInst) addr2).headPointer());
                if (((IRGetElementPtrInst) addr1).indicesNum() == 1 && ((IRGetElementPtrInst) addr2).indicesNum() == 1) {
                    Value index1 = ((IRGetElementPtrInst) addr1).ptrMoveIndex();
                    Value index2 = ((IRGetElementPtrInst) addr2).ptrMoveIndex();

                    if (index1 instanceof NumConst && index2 instanceof NumConst && ((NumConst) index1).getConstData() != ((NumConst) index2).getConstData()) {
                        return false;
                    }
                }
                return ret;
            } else return mayAlias(((IRGetElementPtrInst) addr1).headPointer(), addr2);
        }

        if (addr2 instanceof IRGetElementPtrInst)
            return mayAlias(addr2, addr1);

        return addr1.type.match(addr2.type);
    }
}
