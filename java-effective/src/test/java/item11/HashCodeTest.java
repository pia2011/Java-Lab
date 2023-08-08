package item11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class HashCodeTest {

    @Test
    void hashCode를_재정의하는_경우(){
        Set<Address> hs = new HashSet<>();
        Address address = Address.of("a", "b", "c", "d");
        hs.add(address);

        boolean result = hs.contains(Address.of("a", "b", "c", "d"));

        Assertions.assertTrue(result);
    }



}
