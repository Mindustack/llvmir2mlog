package masterball.compiler.frontend.info.registry;

import masterball.compiler.frontend.info.scope.ClassScope;
import masterball.compiler.frontend.parser.MxStarParser;

import java.util.ArrayList;

public class ClassRegistry extends BaseRegistry {

    public ClassScope scope;
    public ArrayList<VarRegistry> memberVars;
    public ArrayList<FuncRegistry> memberFuncs;

    public ClassRegistry(MxStarParser.ClassDefContext ctx) {
        super(ctx.Identifier().toString(), ctx);
        this.scope = new ClassScope();
        memberVars = new ArrayList<>();
        memberFuncs = new ArrayList<>();
    }

    // IR GetElementPtr
    public int getMemberVarIndex(String memberVarName) {
        for (int i = 0; i < memberVars.size(); i++)
            if (memberVars.get(i).name.equals(memberVarName)) return i;
        return -1;
    }

    public String toString() {
        String ret = "[ClassRegistry] " + "\nname:" + name + " " +
                "\nscope:" + scope + " ";
        return ret;
    }
}
