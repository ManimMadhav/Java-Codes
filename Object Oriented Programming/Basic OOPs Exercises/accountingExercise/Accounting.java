//class file
package com.company;

public class Accounting {
    private int accountNumber;
    private int balance;
    private String name;
    private int phoneNumber;
    
    //constructor
    public Accounting(int accountNumber, int balance, String name, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public String name(){
        return name;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int depositFunds(int amount){
        balance = balance + amount;
        return balance;
    }
    public int withdrawFunds(int amount){
        if (amount<=balance){
            balance = balance - amount;
            return balance;
        }
        else{
            return -1;
        }
    }
}
