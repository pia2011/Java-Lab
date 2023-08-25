package item76;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

class Item76Test {

    @Test
    void 불변_객체로_설계하면_실패_원자적이다(){
        // given
        Member 루카스 = Member.of("루카스", 50);
        String name = 루카스.getName();

        // when
        name = new String("루카스 아님");

        // then
        Assertions.assertEquals("루카스", 루카스.getName());
    }

    @Test
    void TreeMapTest(){
        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();
    }
}
