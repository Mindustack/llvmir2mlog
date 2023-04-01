package Mindustack.compiler.share;

import Mindustack.compiler.middleend.llvmir.type.IRBaseType;

import java.util.ArrayList;

public class Tools {

    public static boolean match(ArrayList<IRBaseType> a, ArrayList<IRBaseType> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {


            if (a.get(i).getClass() == b.get(i).getClass()) return false;
        }


        return true;


    }
}
