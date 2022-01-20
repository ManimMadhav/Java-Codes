package com.company;

public class Complex{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    //constructor
    public void getComplexNumber1(double x1, double y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    //constructor
    public void getComplexNumber2(double x2, double y2){
        this.x2 = x2;
        this.y2 = y2;
    }

    public String addComplexNumbers(){
        double a = x1 + x2;
        double b = y1 + y2;

        return (a+" + i("+b+")");

    }

    public String subtractComplexNumbers(){
        double a = x1 - x2;
        double b = y1 - y2;

        return (a+" + i("+b+")");
    }
}
