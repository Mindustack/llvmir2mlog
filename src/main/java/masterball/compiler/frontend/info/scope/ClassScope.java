package masterball.compiler.frontend.info.scope;

import masterball.compiler.frontend.info.registry.BaseRegistry;
import masterball.compiler.frontend.info.registry.ClassRegistry;
import masterball.compiler.frontend.info.registry.FuncRegistry;
import masterball.compiler.frontend.info.registry.VarRegistry;
import masterball.compiler.share.error.semantic.NameError;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassScope extends BaseScope {

    public HashMap<String, FuncRegistry> funcTable;
    public ArrayList<FuncRegistry> builtinFuncList;

    public ClassScope() {
        this.varTable = new HashMap<>();
        this.funcTable = new HashMap<>();
        this.builtinFuncList = new ArrayList<>();
    }

    @Override
    public ClassRegistry queryClass(String name) {
        return null;
    }

    @Override
    public FuncRegistry queryFunc(String name) {
        return funcTable.get(name);
    }

    @Override
    public VarRegistry queryVar(String name) {
        return varTable.get(name);
    }

    @Override
    public void register(BaseRegistry registry) {
        String name = registry.name;
        if (registry instanceof FuncRegistry) {
            if (funcTable.containsKey(name))
                throw new NameError(registry.codePos, NameError.redefined, name);
            funcTable.put(name, (FuncRegistry) registry);
            if (((FuncRegistry) registry).isBuiltin) {
                builtinFuncList.add((FuncRegistry) registry);
            }
        } else if (registry instanceof VarRegistry) {
            if (varTable.containsKey(name))
                throw new NameError(registry.codePos, NameError.redefined, name);
            varTable.put(name, (VarRegistry) registry);
        }
    }

    public String toString() {
        String ret = "[ClassScope]\n" + "VarTable: " + varTable.toString() + "\n" +
                "FuncTable: " + funcTable.toString() + "\n";
        return ret;
    }
}
