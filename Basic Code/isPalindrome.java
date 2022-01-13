import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int revNo = isPalindrome(number);

        if(number==revNo){
            System.out.println("It is a palindrome.");

        }
        else{
            System.out.println("It is NOT a palindrome.");
        }
        
    }

    public static int isPalindrome(int num){
        int reverseNumber = 0;
        while (num>0){
            int lastDigit = num%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            num = num/10;
        }

        return reverseNumber;
    }
}
