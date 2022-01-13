//class person
package com.company;

public class person {
    private String firstName;
    private String secondName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setAge(int age){
        if (age<100 && age>0) {
            this.age = age;
        }
        else{
            this.age = -1;
        }
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(int age){
        if (age>12 && age<20){
            return true;
        }
        else{
            return false;
        }
    }

    public String getFullName(String firstName, String secondName){
        if (firstName.isEmpty()){
            return secondName;
        }
        else if (secondName.isEmpty()){
            return firstName;
        }

        else if (firstName.isEmpty() && secondName.isEmpty()){
            return null;
        }
        else{
            return (firstName + secondName);
        }
    }
}

