import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
       
       Scanner sc = new Scanner(System.in);
       int dimension = sc.nextInt();
       int[][] matrix = new int[dimension][dimension];

       for (int i=0; i<dimension; i++){
        for (int j=0; j<dimension; j++){

            matrix[i][j] = sc.nextInt();
        }
       }
       //System.out.println(Arrays.deepToString(matrix));
       int diagSumOne = 0;
       int diagSumTwo = 0;

       for (int k=0; k<dimension; k++){
        diagSumOne += matrix[k][k];
       }

       for (int p=0; p<dimension; p++){
        int r = dimension-p-1;
        int ele = matrix[p][r];
        diagSumTwo += ele;
       }

       int res = diagSumOne-diagSumTwo;
       System.out.println(Math.abs(res));

    }
}
