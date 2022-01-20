package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Complex myObject = new Complex();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter real part of number 1: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter imaginary part of number 1: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter real part of number 2: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter imaginary part of number 1: ");
        double y2 = sc.nextDouble();

        myObject.getComplexNumber1(x1,y1);
        myObject.getComplexNumber2(x2,y2);

        System.out.println(myObject.addComplexNumbers());
        System.out.println(myObject.subtractComplexNumbers());

    }
}
