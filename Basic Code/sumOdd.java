import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int start = sc.nextInt();
       int end = sc.nextInt();
       
       System.out.println(sumOdd(start, end));
    }

    public static boolean isOdd(int num){
        if (num%2 != 0){
            return true;
        }
        else{
            return false;
        } 
    }

    public static int sumOdd (int start, int end){
        int sum = 0;
        for (int i=start; i<=end; i++){
            if (isOdd(i)==true){
                sum += i;
            }
        }
        return sum;
    }
}
