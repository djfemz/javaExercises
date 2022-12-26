package chapterFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();
        double sumOfInverseFactorials=0;
        for (int count = 1; count <= number; count++) {
            sumOfInverseFactorials+=(1/(double)count);
        }
        System.out.println(sumOfInverseFactorials);
    }
}
