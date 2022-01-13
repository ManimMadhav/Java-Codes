package com.company;

public class simpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //setter
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    //another setter
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    //getter
    public double getFirstNumber(){
        return firstNumber;
    }

    //another getter
    public double getSecondNumber(){
        return secondNumber;
    }

    //the "behaviour" methods
    public double getSum(){
        double sum = firstNumber+secondNumber;
        return sum;
    }

    public double getDifference(){
        double difference = firstNumber-secondNumber;
        return difference;
    }

    public double getMultiplied(){
        double multiplied = firstNumber * secondNumber;
        return multiplied;
    }

    public double getDivided(){
        if (secondNumber !=0){
            double divided = firstNumber/secondNumber;
            return divided;
        }
        else {
            return -1;
        }
    }
}
