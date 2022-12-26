package chapterSeven.arrays.example2;

import chapterSix.example2.Account;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = {1000, 4,3,18, 200, 1, 2, 65, 34};

        for (int femi:numbers) {
            if (femi%2==0) System.out.println(femi);
        }


    }
}
