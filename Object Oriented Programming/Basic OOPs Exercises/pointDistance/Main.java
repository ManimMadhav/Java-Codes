package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x co-ordinate of point: ");
        int x2 = sc.nextInt();

        System.out.println("Enter y co-ordinate of point: ");
        int y2 = sc.nextInt();

        point myObject = new point();
        myObject.pointCons(0,0);
        double answer = myObject.distance(x2,y2);
        System.out.println("The distance is: "+answer);

    }
}
