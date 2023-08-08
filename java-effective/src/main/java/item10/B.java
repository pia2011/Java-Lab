package item10;

public class B {

    private String name;

    private B(String name) {
        this.name = name;
    }

    public static B from(String name) {
        return new B(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
}
