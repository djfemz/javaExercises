package chapterSix.example2;

public class Account {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setBalance(String balance) {
        this.balance=Double.parseDouble(balance);
    }

    @Override
    public String toString(){
        return "{"+"balance: "+balance+"}";
    }

}
