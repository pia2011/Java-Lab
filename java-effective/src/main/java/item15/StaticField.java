package item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticField {

    private static final Integer[] VALUES = new Integer[]{1,2,3};

    // (1) 불변 리스트 활용
    public static final List<Integer> VALUES_LIST =
            Collections.unmodifiableList(Arrays.asList(VALUES));

    // (2) 방어적 복사 활용
    public static final Integer[] values(){
        return VALUES.clone();
    }
}
