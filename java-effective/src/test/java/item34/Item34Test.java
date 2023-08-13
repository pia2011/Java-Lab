package item34;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Item34Test {

    @Test
    void 열거타입_테스트(){
        KeyBoard 기계식_키보드 = KeyBoard.기계식;
        KeyBoard 무접점_키보드 = KeyBoard.무접점;

        Assertions.assertNotSame(기계식_키보드, 무접점_키보드);
    }

    @Test
    void 테스트(){
        KeyBoard 무접점 = KeyBoard.무접점;
    }

    @Test
    void Enum은_싱글톤으로_관리된다(){
        KeyBoard 기계식1 = KeyBoard.기계식;
        KeyBoard 기계식2 = KeyBoard.기계식;
        KeyBoard 무접점 = KeyBoard.무접점;

        Assertions.assertSame(기계식1, 기계식2);
        Assertions.assertNotSame(기계식1, 무접점);
    }

    @Test
    void 열거형_타입은_필드와_메서드를_가질_수_있다(){
        KeyBoard 무접점 = KeyBoard.무접점;
    }

    @Test
    void 열거형_타입_메서드_필드(){
        Fruit 바나나 = Fruit.바나나;
        Fruit 사과 = Fruit.사과;
        Fruit 포도 = Fruit.포도;
        Fruit 포도2 = Fruit.포도;

        System.out.println(바나나.color());
        System.out.println(바나나.비싼가() ? "비싸다" : "싸다");
        System.out.println(사과.비싼가() ? "비싸다" : "싸다");
        System.out.println(포도.비싼가() ? "비싸다" : "싸다");

        Assertions.assertSame(포도, 포도2);

        System.out.println(사과);
    }

    @Test
    void 연산용_열거타입(){
        Operation plus = Operation.PLUS;
        Operation minus = Operation.MINUS;

        double resultOfPlus = plus.apply(3, 4);
        double resultOfMinus = minus.apply(3, 4);

        Assertions.assertEquals(7.0, resultOfPlus);
        Assertions.assertEquals(-1.0, resultOfMinus);

        System.out.println(resultOfMinus);
        System.out.println(resultOfPlus);

        double x = 1.0;
        double y = 2.0;
        for(Operation op : Operation.values()){
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

    }

    @Test
    void PayrollDayTest(){
        int 평일_수당 = PayrollDay.MONDAY.pay(500, 30);
        int 주말_수당 = PayrollDay.SUNDAY.pay(500, 30);

        System.out.println(평일_수당);
        System.out.println(주말_수당);
    }
}
