package item34;

public enum Fruit {
    사과("빨강", 10000),
    바나나("노랑", 10000),
    포도("파랑", 30000);

    private static final int 비싸다기준 = 20000;
    private final Boolean 비싸다;
    private final String color;
    private final int price;

    Fruit(String color, int price){
        this.color = color;
        this.price = price;
        this.비싸다 = price > 비싸다기준 ? true : false;
    }

    public String color(){
        return color;
    }

    public int price(){
        return price;
    }

    public boolean 비싼가(){
        return 비싸다;
    }

}
