package chapterEleven.example2;

public class RecursionSample {

    private static final int PATTERN_SPACING_DEFAULT_VALUE = 4;

    public static void main(String[] args) {
//        printRightFacingRightAngledTriangle(5);
        printLeftFacingRightAngledTriangle(5);
    }

    private static void printRightFacingRightAngledTriangle(int number){
        if(number<1) {
            return;
        }
        number=number-1;
        printRightFacingRightAngledTriangle(number);
        for (int index = 0; index < number; index++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printLeftFacingRightAngledTriangle(int number){
        if(number<1) {
            return;
        }
        number=number-1;
        printLeftFacingRightAngledTriangle(number);
        for (int index = number; index<PATTERN_SPACING_DEFAULT_VALUE; index++) {
            System.out.print(" ");
        }
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
