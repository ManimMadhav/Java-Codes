//class file
package com.company;

public class Accounting {
    private int accountNumber;
    private int balance;
    private String name;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
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
