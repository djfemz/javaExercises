package chapterSix.example1;

public class Example1 {

    public static void main(String... regnos) {
        char ch = ' ';
        printNumberAsInteger(ch);
        printNumberAsInteger(7.2);
        printNumberAsInteger("50");

    }

    private static void printNumberAsInteger(int number){
        System.out.println(number);
    }

    private static void printNumberAsInteger(double number){
//        String[] s = String.valueOf(number).split("\\.");
        System.out.println((int)number);
    }

    private static void printNumberAsInteger(String number){
        System.out.println(Integer.parseInt(number));
    }
}
