package chapterEleven.example1;

import chapterFour.RegnosScanner;

import java.util.concurrent.TimeUnit;

public class Example1 {
    private static RegnosScanner scanner = new RegnosScanner(System.in);
    private static int[] numbers = {23, 15, 18, 90, 100};
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();
        try {
            verifyNumber(userInput);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.print("Shutting Down.");
            for (int i = 0; i < 10; i++){
                TimeUnit.SECONDS.sleep(1);
                System.out.print(".");
            }
        }
    }

    private static void verifyNumber(int userInput) throws NumberNotFoundException {
        for (int number: numbers) {
            if (number== userInput) {
                System.out.println("Found");
                return;
            }
        }
        throw new NumberNotFoundException("oops!");
    }
}
