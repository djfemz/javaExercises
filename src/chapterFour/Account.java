package chapterFour;

import java.util.Scanner;

public class Account {

    private String name;
    private double balance;

    private String accountType;

    //no-args constructor
    public Account(){}

    //required-args constructor
    public Account(String name){
        this.name=name;
    }

    public Account(String name, double balance, String accountType){
        this.name=name;
        this.balance=balance;
        this.accountType=accountType;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    public String transferFunds(double amount){
        balance=balance-amount;
        return "transfer successful";
    }

    public String deposit(double amount){
        balance=balance+amount;
        return "deposit successful\nThank You for Banking with Regnos Bank";
    }

    public String toString(){
        return "{\n"+"name: "+name+"\nbalance: "+balance+"\n}";
    }
}
