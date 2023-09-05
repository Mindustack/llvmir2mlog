package org.mindustack.llvmir2mlog.compiler.share.misc;

// this implements a simple UnionSet in java

import java.util.HashMap;
import java.util.Map;

public class UnionSet<ObjType> {

    private final Map<ObjType, ObjType> aliasMap = new HashMap<>();

    public void clear() {
        aliasMap.clear();
    }

    public boolean contains(ObjType obj) {
        return aliasMap.containsKey(obj);
    }

    public ObjType getAlias(ObjType obj) {
        if (!aliasMap.containsKey(obj)) return obj;
        ObjType alias = getAlias(aliasMap.get(obj));
        aliasMap.put(obj, alias);
        return alias;
    }

    public void remove(ObjType obj) {
        aliasMap.remove(obj);
    }

    // obj -> alias
    public void setAlias(ObjType obj, ObjType alias) {
        aliasMap.put(obj, alias);
    }
}
