package item17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Item17Test {

    @Test
    void 불변_클래스가_아닐때(){
        // given
        CanModify canModify = new CanModify("name");
        Address address = Address.of("street", "city", "state", "code", canModify);
        System.out.println(address);

        canModify.setName("modifiedName 1");

        System.out.println(address);
        address.getCanModify().setName("modifiedName 2");

        System.out.println(address);
    }

    @Test
    void BigInteger(){
        BigInteger bigInteger1 = new BigInteger("3");
        BigInteger bigInteger2 = new BigInteger("5");
        System.out.println(bigInteger1.add(bigInteger2));

        BigInteger myBigInteger1 = new MyBigInteger("3");
        BigInteger myBigInteger2 = new MyBigInteger("5");
        BigInteger result = myBigInteger1.add(myBigInteger2);
        System.out.println(result);
    }
}
