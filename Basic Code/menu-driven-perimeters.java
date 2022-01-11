package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //menu-driven program to calculate perimeter of different shapes
        //using functions for each shape
        //and taking input from the user by using the Scanner class

        Scanner sc = new Scanner(System.in);
        System.out.println("These are the following shapes available:\n1. Rectangle\n2.Square\n3.Circle");
        System.out.println("Enter choice: ");
        int myChoice = sc.nextInt();

        if(myChoice==1){
            System.out.println("Enter length: ");
            double len = sc.nextDouble();
            System.out.println("Enter breadth: ");
            double brdth = sc.nextDouble();

            System.out.println("The perimeter is "+RectanglePerimeter(len,brdth)+" units.");
        }
        if(myChoice==2){
            System.out.println("Enter side length: ");
            double side = sc.nextDouble();
            System.out.println("The perimeter os the square is: "+SquarePerimeter(side)+" units.");
        }
        if(myChoice==3){
            System.out.println("Enter radius of circle: ");
            double radius = sc.nextDouble();
            double result = Circumference(radius);
            System.out.printf("The circumference of the circle is %.2f units",result

            );
        }
    }

    public static double RectanglePerimeter(double len, double brdth){
        double Peri = 2*(len+brdth);
        return Peri;
    }

    public static double SquarePerimeter(double side){
        double Peri = 4*side;
        return Peri;
    }

    public static double Circumference(double radius){
        double Peri = 3.1428*2*radius;
        return Peri;
    }
}
