package item76;

public class Member {

    private final String name;
    private final int age;

    private Member(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Member of(String name, int age){
        return new Member(name, age);
    }

    public String getName(){
        return name;
    }
}
