//solution to: https://www.hackerrank.com/challenges/java-loops

package Files;

import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int run=0; run<test; run++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            int n = sc.nextInt();
            
            double[] arr = new double[n+1];
            double init = a + b;
            double sum=0;
            arr[0] = init;
            for (int i=0; i<n; i++){
                sum = sum + arr[i] + Math.pow(2, i+1)*b;
                arr[i] = sum;
            }
            System.out.print((int)init);
            System.out.print(" ");
            for (int t=0; t<n-1; t++){
                int x =  (int)arr[t];
                System.out.print(x);
                System.out.print(" ");
            }
            
        }

    }
}
