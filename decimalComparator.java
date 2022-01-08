package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //decimalComparator
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the first decimal number: ");
        double num1 = object.nextDouble();

        System.out.println("Enter the second decimal number: ");
        double num2 = object.nextDouble();

        boolean result = decimalComparator(num1,num2);
        System.out.println(result);
    }

    public static boolean decimalComparator(double num1,double num2) {
        double a = (double)Math.round(num1*1000d)/1000d;
        double b = (double)Math.round(num2*1000d)/1000d;

        if(a==b){
            return true;
        }
        else{
            return false;
        }
    }
}
