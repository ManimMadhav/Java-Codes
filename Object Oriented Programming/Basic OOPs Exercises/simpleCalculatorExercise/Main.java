package com.company;

public class Main {

    public static void main(String[] args) {
	    simpleCalculator myObject = new simpleCalculator();
        myObject.setFirstNumber(25);
        myObject.setSecondNumber(10);

        System.out.println("Sum is "+ myObject.getSum());
        System.out.println("Difference is "+ myObject.getDifference());
        System.out.println("Multiplication answer is "+ myObject.getMultiplied());
        System.out.println("Division is "+ myObject.getDivided());

    }
}
