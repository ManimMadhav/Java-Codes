package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class ThreadOne extends Thread{
    public void run(){
        System.out.println("Inside thread two.");
    }
    int sumOne;
    ThreadOne(ArrayList<Integer> a1, ArrayList<Integer> a2){
        int size = a1.size();
        int fh;
        if (size%2 == 0){
            fh = a1.size()/2;
        }
        else{
            fh = (a1.size()+1)/2;
        }
        sumOne = 0;
        for (int i=0; i<fh; i++){
            sumOne += a1.get(i) * a2.get(i);
        }
    }
    public int getSumOne(){
        return sumOne;
    }
}

class ThreadTwo extends Thread{

    int sumTwo = 0;
    public void run(){
        System.out.println("Inside thread two.");
    }
    ThreadTwo(ArrayList<Integer> a1, ArrayList<Integer> a2){
        int size = a1.size();
        int fh;
        if (size%2 == 0){
            fh = a1.size()/2;
        }
        else{
            fh = (a1.size()+1)/2;
        }

        for (int i=fh; i<size; i++){
            sumTwo += a1.get(i) * a2.get(i);
        }
    }
    public int getSumTwo(){
        return sumTwo;
    }
}

class ThreadThree extends Thread{
    public void run(){
        System.out.println("Inside thread three.");
    }
    double avg1 = 0;
    ThreadThree(ArrayList<Integer> a){
        int size = a.size();
        int fh;
        if (size%2 == 0){
            fh = a.size()/2;
        }
        else{
            fh = (a.size()+1)/2;
        }

        for (int i=0; i<fh; i++){
            avg1 += i;
        }

        avg1 = avg1/size;
    }

    public double getAvg1(){
        return avg1;
    }
}

class ThreadFour extends Thread{
    public void run(){
        System.out.println("Inside thread four.");
    }
    double avg2 = 0;
    ThreadFour(ArrayList<Integer> a){
        int size = a.size();
        int fh;
        if (size%2 == 0){
            fh = a.size()/2;
        }
        else{
            fh = (a.size()+1)/2;
        }

        for (int i=fh; i<size; i++){
            avg2 += i;
        }

        avg2 = avg2/size;
    }

    public double getAvg2(){
        return avg2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();

        System.out.println("Enter total number of students: ");
        int len = sc.nextInt();

        for (int i=0; i<len; i++){
            int ele = sc.nextInt();
            marks.add(ele);
        }

        for (int j=1; j<len+1 ; j++){
            count.add(j);
        }

        System.out.println(marks);
        System.out.println(count);

        double mean = 0;
        ThreadOne to = new ThreadOne(count,marks);
        ThreadTwo tw = new ThreadTwo(count,marks);
        ThreadThree tt = new ThreadThree(marks);
        ThreadFour tf = new ThreadFour(marks);

        Thread t1 = new Thread(to);
        Thread t2 = new Thread(tw);
        Thread t3 = new Thread(tt);
        Thread t4 = new Thread(tf);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        int sumOne = to.getSumOne();
        int sumTwo = tw.getSumTwo();

        double meanOne = tt.getAvg1();
        double meanTwo = tf.getAvg2();

        double sum = meanOne + meanTwo;

        mean = (sumOne+sumTwo)/ (sum);

        System.out.println(mean);
    }
}
