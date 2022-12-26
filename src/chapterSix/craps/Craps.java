package chapterSix.craps;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static  final Scanner scanner = new Scanner(System.in);
    private static final int SNAKE_EYES = 2;

    private static double bankBalance=1000.00;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static void main(String[] args) {
        double wager;
        do {
            System.out.println("Enter amount to kalo-kalo: ");
            wager = scanner.nextDouble();
        }while (wager>bankBalance||wager<1);
        System.out.println(chatter(wager));
        int myPoint = 0;
        Status gameStatus;
        int sumOfDice = rollDice();
        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> {
                bankBalance+=wager;
                gameStatus = Status.WON;
            }
            case SNAKE_EYES, TREY, BOX_CARS -> {
                bankBalance-=wager;
                gameStatus = Status.LOST;
            }
            default -> {
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        gameStatus = setGameStatus(myPoint, gameStatus, wager);
        if (gameStatus == Status.WON) {
            System.out.println("Bank Balance: "+bankBalance);
            System.out.println("Player wins");
        }

        else {
            System.out.println("Bank Balance: "+bankBalance);
            System.out.println("Player loses");
        }

    }

    private static Status setGameStatus(int myPoint, Status gameStatus, double wager) {
        int sumOfDice;
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();
            if (sumOfDice == myPoint) {
                gameStatus = Status.WON;
                bankBalance+=wager;
            }
            else {
                if (sumOfDice == SEVEN) {
                    gameStatus = Status.LOST;
                    bankBalance-=wager;
                }
            }
        }
        return gameStatus;
    }


    public static int rollDice() {
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    private static String chatter(double wager){
        if (wager==1000) return "You are going for broke";
        else if (wager<=300) return "Aw c'mon, take a chance!";
        else if (bankBalance>1500) return "You're up big. Now's the time to cash in your chips!";
        return "Sorry. You busted!";
    }
}
