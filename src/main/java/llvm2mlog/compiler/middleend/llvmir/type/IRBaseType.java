package llvm2mlog.compiler.middleend.llvmir.type;

public abstract class IRBaseType {

    abstract public boolean match(IRBaseType other);

    abstract public int size(); // byte

    @Override
    abstract public String toString();

    public void setName(String name) {

    }
}