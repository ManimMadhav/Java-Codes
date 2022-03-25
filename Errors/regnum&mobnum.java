package Files;

import java.util.*;

class RegNumError extends Exception{
    public RegNumError(){
        System.out.println("The registration number cannt be greater than 9 digits.");
    }
}

class MobNumError extends Exception{
    public MobNumError(){
        System.out.println("The mobile number cannt be greater than 10 digits.");
    }
}

public class test {
    public static void main(String[] args) {
        int regNum = 111222333;

        //append an "L" to end to make it a long data type!
        //or else Java thinks it's an int.
        long mobNum = 9538972812L;

        try{
            String regNumStr = String.valueOf(regNum);
            String mobNumStr = String.valueOf(mobNum);   

            if (regNumStr.length()>9){
                throw new RegNumError();
            }
            if (mobNumStr.length()>9){
                throw new MobNumError();
            }

        }
        catch (RegNumError e){
            System.out.println("ded");
        }

        catch(MobNumError e){
            System.out.println("ded x2");
        }
    }
}
