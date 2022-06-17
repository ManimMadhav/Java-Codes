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
        int[] a = new int[3];
        int[] b = new int[3];
        
        int scoreA = 0;
        int scoreB = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (int j=0; j<3; j++){
            int ele = sc.nextInt();
            a[j] = ele;
        }
        
        for (int k=0; k<3; k++){
            int ele = sc.nextInt();
            b[k] = ele;
        }
        
        for (int i=0; i<3; i++){
            if (a[i] > b[i]){
                scoreA += 1;
            }
            if (a[i] < b[i]){
                scoreB += 1;
            }
        }
        
        System.out.print(scoreA + " " + scoreB);
    }
}
