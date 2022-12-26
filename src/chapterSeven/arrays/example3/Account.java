package chapterSeven.arrays.example3;

public class Account {
    private String name;
    private double balance;


    public Account(String someName, double balance) {
        name = someName;
        this.balance = balance;
    }

    public Account(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "{name: "+name+"balance: "+balance+"}";
    }
}
