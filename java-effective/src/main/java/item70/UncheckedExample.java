package item70;

import java.util.Optional;

public class UncheckedExample {

    public boolean actionPermit(int a, int b){
        return b != 0;
    }

    public void divideNumbers(int a, int b){
        int result = a / b;
        System.out.println(result);
    }

    public void divideNumbers2(int a, int b){
        if(b == 0){
            throw new UncheckedException("0으로 나누면 안돼!");
        }
        int result = a / b;
        System.out.println(result);
    }


}
