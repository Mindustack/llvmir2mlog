package masterball.compiler.middleend.llvmir.type;

import masterball.compiler.middleend.llvmir.StructProto;

import java.util.ArrayList;

public class StructType extends IRBaseType {
    // public final String structName;
    public final StructProto structProto;
    public ArrayList<IRBaseType> memberVarTypes = new ArrayList<>();

    public StructType() {

        structProto = new StructProto(this);
    }


    @Override
    public boolean match(IRBaseType other) {
        if (!(other instanceof StructType)) return false;
        if (this.memberVarTypes.size() != ((StructType) other).memberVarTypes.size()) return false;

        for (int i = 0; i < this.memberVarTypes.size(); i++) {


            if (this.memberVarTypes.get(i).getClass() == ((StructType) other).memberVarTypes.get(i).getClass())
                return false;
        }


        return true;


    }

    @Override
    public int size() {
        int ret = 0;
        for (IRBaseType memberVarType : memberVarTypes) ret += memberVarType.size();
        return ret;
    }

    // e.g. struct {i32 a, i8 b, i32 c}
    // index 0 1 2
    // offset 0 4 5
    public int memberOffset(int index) {
        int ret = 0;
        for (int i = 0; i < index; ++i) ret += memberVarTypes.get(i).size();
        return ret;
    }

    @Override
    public String toString() {
        return structProto.identifier();
    }


}
