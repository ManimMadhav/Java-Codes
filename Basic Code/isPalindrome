//not working rn

import java.util.Scanner;
import java.lang.Math;


public class Test{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       System.out.println(isPalindrome(num));
       
    }
    
    public static boolean isPalindrome(int num) {
        double n = 0;
        int test = num;
        while (test >0){
            test /= 10;
            n += 1;
        }

        int lastDigit = num % 10;
        double a = 10;
        double length = n-1;
        int reverseNumber = (int) (lastDigit * (Math.pow(10, length)));

        while(num>0){
            int divided = num/10;
            int nextDigit = divided%10;
            
            reverseNumber = reverseNumber + nextDigit*10*(n-1);
        }

        if (reverseNumber == num){
            return true;
        }
        else{
            return false;
        }
    }

}    

    
