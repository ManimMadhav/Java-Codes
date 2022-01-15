package com.company;

public class Main {

    public static void main(String[] args) {
        person myObject = new person();
        myObject.setFirstName("Manim");
        myObject.setSecondName("Madhav");
        myObject.setAge(19);

        System.out.println("Name is "+myObject.getFullName("Manim","Madhav"));
        System.out.println("Is the person a teen? "+ myObject.isTeen(21));

    }
}
