package item15;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Item15Test {

    @Test
    void 불변_리스트_반환_테스트(){
        // given
        List<Integer> expectedValuesList = Arrays.asList(1, 2, 3);

        // when
        List<Integer> valuesList = StaticField.VALUES_LIST;

        // then
        assertIterableEquals(expectedValuesList, valuesList);
        assertThrows(UnsupportedOperationException.class, () -> valuesList.add(4));
    }

    @Test
    void 방어적_복사(){
        // given
        Integer[] expectedValues = new Integer[]{1, 2, 3};

        // when
        Integer[] values = StaticField.values();
        Integer[] values2 = StaticField.values();

        // then
        assertArrayEquals(expectedValues, values);
        values[0] = 5;
        assertNotEquals(expectedValues[0], values[0]);
        assertArrayEquals(expectedValues, values2);
    }

}
