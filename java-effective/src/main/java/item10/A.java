package item10;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class A {

    private String name;

    private A(String name) {
        this.name = name;
        ArrayList a = new ArrayList<>();
    }

    public static A from(String name) {
        return new A(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }

}
