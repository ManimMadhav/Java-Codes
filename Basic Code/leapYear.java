package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //isLeap
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = myObj.nextInt();

        int check = isLeap(year);
        if (check==1){
            System.out.println(year+" is a leap year.");
        }
        if (check == -1){
            System.out.println(year+" is not a leap year.");
        }
    }

    public static int isLeap(int year){
        if (year<=0 && year>9999){
            return -1;
        }
        else{
            //run algo to check
            if (year%4==0){
                if (year%100==0 && year%400==0){
                    return 1;
                }
            }
            else{
                return -1;
            }
        }
        return -1;
    }

}
