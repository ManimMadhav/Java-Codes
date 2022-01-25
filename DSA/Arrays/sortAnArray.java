package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        //sort arrays
        //using insertion sort
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");

        int len = sc.nextInt();
        double[] inputArray = new double[len];

        for (int i=0; i<inputArray.length; i++){
            System.out.println("Enter element number "+i+":");
            double element = sc.nextDouble();
            inputArray[i] = element;
        }

        Arrays.sort(inputArray);
        System.out.println("Sorted array is: "+ Arrays.toString(inputArray));

    }

}
