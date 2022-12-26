package chapterFour;

import java.util.Scanner;

public class AccountDriver {

    public static void main(String[] args) {
        Account zainabsDormAccount=
                new Account("Zainab", 5000, "Dorm");
//        System.out.println(zainabsDormAccount.transferFunds(5000));
//        String result =
//                String.format("%s%s balance is %.2f",zainabsDormAccount.getName(),"'s", zainabsDormAccount.getBalance());
//        System.out.println(result);

        System.out.println("Enter amount to deposit: ");

        RegnosScanner scanner = new RegnosScanner(System.in);
        double amountToDeposit = scanner.nextDouble();

        System.out.println(zainabsDormAccount.deposit(amountToDeposit));
        System.out.println("current balance = "+zainabsDormAccount.getBalance());

    }
}
