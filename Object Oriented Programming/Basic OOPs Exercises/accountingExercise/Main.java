//main

package com.company;

public class Main {

    public static void main(String[] args){
        Accounting myObject = new Accounting();
        System.out.println(myObject.depositFunds(500));
        System.out.println(myObject.withdrawFunds(300));

    }
}
