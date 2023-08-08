package item10;

import item10.A;
import item10.B;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class EqualsTest {

    @Test
    void Test(){

        A a = A.from("철수");
        B b = B.from("철수");


        assertNotSame(a, b);
        Assertions.assertEquals(a, b);
    }

    @Test
    void Boolean_클래스는_싱글톤_방식으로_인스턴스를_관리한다(){
        Boolean a = Boolean.valueOf(true);
        Boolean b = Boolean.valueOf(true);

        assertSame(a, b);
    }

    @Test
    void List_구현클래스들_사이의_equals_검증(){

        List a = new Stack();
        a.add(1);

        List b = new ArrayList();
        b.add(1);

        Assertions.assertEquals(a, b);
    }

    @Test
    void List_검증2(){
        List a = new Stack();
        a.add(1);

        List b = new ArrayList();
        b.add(1);
        b.add(1);

        Assertions.assertNotEquals(a, b);
    }

    @Test
    void Float_오토박싱_검증(){

        int intVal = 1;
        int intVal2 = 1;
        float floatVal = 3.14f;

        // 오토박싱
        Float floatObj = floatVal;
        Float floatObj2 = floatVal;

        assertSame(intVal, intVal2);
        assertNotSame(floatObj, floatObj2);
    }
}
