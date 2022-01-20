package com.company;

public class point {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    //constructor
    public void pointCons(double x1,double y1){
        this.x1 = x1;
        this.y1 = y1;
    }

    public double distance(double x2, double y2){
        double distance = Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ;
        return Math.pow(distance,0.5);

    }

}
