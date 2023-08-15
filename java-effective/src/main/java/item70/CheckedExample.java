package item70;

public class CheckedExample {


    public void processInput(String input)  throws CheckedException{
        if(input == null || input.isEmpty()){
            throw new CheckedException("");
        }
    }


    public void processInput2(String input) {
        try{
            if(input == null || input.isEmpty()){
                throw new CheckedException("");
            }
        }catch (CheckedException e){
            e.printStackTrace();
        }
    }

}
