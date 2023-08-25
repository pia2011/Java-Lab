package item7;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.WeakHashMap;

class Item7Test {

    @Test
    void 메모리_누수가_발생하는_상황_테스트(){
        Stack stack = new Stack();

        for(int i = 0; i<1000; i++){
            Object obj = new Object();
            stack.push(obj);
        }

        for(int i = 0; i<1000; i++){
            stack.pop();
        }

        Object[] elements = stack.getElements();
        for(Object obj : elements){
            if(obj != null)
                System.out.println(obj);
        }
    }

    @Test
    void 메모리_누수가_발생하지_않으려면(){
        Stack stack = new Stack();

        for(int i = 0; i<1000; i++){
            Object obj = new Object();
            stack.push(obj);
        }

        for(int i = 0; i<1000; i++){
            stack.realPop();
        }
    }

    @Test
    void WeakHashMapTest(){

        Map<String, Integer> map = new WeakHashMap<>();
        String key1 = new String("핫바");
        String key2 = new String("콜라");
        map.put(key1, 3000);
        map.put(key2, 1000);
        key1 = null;

        System.gc();

        for (String key : map.keySet()) {
            System.out.println(key);
        }

    }

}
