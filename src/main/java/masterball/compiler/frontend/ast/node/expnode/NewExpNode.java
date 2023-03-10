package masterball.compiler.frontend.ast.node.expnode;

import masterball.compiler.share.pass.ASTVisitor;
import masterball.compiler.frontend.ast.node.ExpBaseNode;
import masterball.compiler.frontend.info.CodePos;
import masterball.compiler.frontend.info.type.VarType;

import java.util.ArrayList;

public class NewExpNode extends ExpBaseNode {

    public ArrayList<ExpBaseNode> eachDimLengthExpNodes;

    public NewExpNode(CodePos codePos, VarType type) {
        super(codePos);
        this.type = type;
        this.eachDimLengthExpNodes = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean isLeftValue() {
        return false;
    }
}
