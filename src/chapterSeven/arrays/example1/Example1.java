package chapterSeven.arrays.example1;

import chapterFour.Account;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("How many scores you wan add?");
        int numberOfScores = scanner.nextInt();
        int[] scores = new int[numberOfScores];
        int sum=0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score "+(index+1));
            int score=scanner.nextInt();
            scores[index] = score;
        }

        System.out.println("After storing scores--> "+Arrays.toString(scores));

        System.out.println("\n".repeat(4));

        for (int index = 0; index < scores.length; index++) {
            sum+=scores[index];
            System.out.println(sum);
        }

        System.out.println("sum of scores is "+sum);


    }
}
