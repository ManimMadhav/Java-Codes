import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(sumOfFirstAndLastDigit(number));
        
    }

    public static int sumOfFirstAndLastDigit(int num){
        int lastDigit = num%10;

        while (num>10){
            num = num/10;
        }

        int firstDigit = num;
        int sum = firstDigit + lastDigit;
        return sum;
        
    }
}
