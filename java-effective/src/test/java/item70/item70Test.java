package item70;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class item70Test {

    @Test
    void 검사예외는_어디선가는_무조건_처리되어야한다(){
        CheckedExample checkedExample = new CheckedExample();
        try{
            checkedExample.processInput(null);
        }catch (CheckedException e){
            e.printStackTrace();
        }
    }

    @Test
    void 검사예외_회피방법_1_Optional_활용(){
        CheckedExample checkedExample = new CheckedExample();
        try{
            checkedExample.processInput(" ");
        }catch (CheckedException e){

        }
    }

    @Test
    void 검사예외_회피방법_2_비검사_예외_메서드분리(){
        UncheckedExample uncheckedExample = new UncheckedExample();
        if(uncheckedExample.actionPermit(3,0)){
            uncheckedExample.divideNumbers(3,0);
            System.out.println("실행");
        }else{
            System.out.println("실행안함");
        }
    }


    @Test
    void 비검사_예외2(){
        UncheckedExample uncheckedExample = new UncheckedExample();
        uncheckedExample.divideNumbers(3,0);
    }

    @Test
    void 비검사_예외3() {
        UncheckedExample uncheckedExample = new UncheckedExample();
        uncheckedExample.divideNumbers2(3, 0);
    }
}
