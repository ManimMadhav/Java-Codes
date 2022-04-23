//An array A of length N
//is said to be pseudo-sorted if it can be made non-decreasing after performing the following operation at most once.
//Choose an i such that 1≤i≤N−1 and swap Ai and Ai+1

such that 1≤i≤N−1 and swap Ai and Ai+1

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i<T; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j=0; j<n; j++){
                int ele = sc.nextInt();
                arr[j] = ele;
            }

            for (int x=0; x<arr.length-2; x++){
                int nextIndex = x+1;
                if (arr[nextIndex] < arr[x]){
                    int ele1 = arr[x];
                    int ele2 = arr[nextIndex];

                    arr[x] = ele2;
                    arr[nextIndex] = ele1;

                    boolean flag = checkNonDecreasing(arr);

                    if (flag == true){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
        }
    }

    public static boolean checkNonDecreasing(int[] arr){
        int flag = 1;
        for (int i=0; i<arr.length-2; i++){
            if (arr[i] > arr[i+1]){
                    flag = 0;
                    break;
            }
        }
        if (flag == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
