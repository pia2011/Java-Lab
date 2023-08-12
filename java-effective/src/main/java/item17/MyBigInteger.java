package item17;

import java.math.BigInteger;

public class MyBigInteger extends BigInteger {
    public MyBigInteger(String val) {
        super(val);
    }

    @Override
    public BigInteger add(BigInteger val) {
        BigInteger result = super.subtract(val);
        return result;
    }

}
