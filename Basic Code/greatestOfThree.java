import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        //greatest of 3
        Scanner Object = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = Object.nextInt();

        System.out.println("Enter second number: ");
        int b = Object.nextInt();

        System.out.println("Enter third number: ");
        int c = Object.nextInt();

        if (a>=b && a>=c){
            System.out.println(a+" is the greatest.");
        }

        if (b>=a && b>=c){
            System.out.println(b+" is the greatest.");
        }

        if (c>=b && c>=a){
            System.out.println(c+" is the greatest.");
        }
    }
}
