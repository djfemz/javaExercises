package chapterSeven.others;

import java.util.Arrays;

public class Example {
    public static void main(String... args) {
        System.out.println("content of args--> "+Arrays.toString(args));
        String firstItemInArgs=args[0];
        System.out.println("firstItemInArgs--> "+firstItemInArgs);
        int firstElementFromArgs=Integer.parseInt(firstItemInArgs);
        int[] numbers =
                new int[firstElementFromArgs];

        numbers[0]=Integer.parseInt(args[1]);
        numbers[1]=Integer.parseInt(args[2]);
        numbers[2]=Integer.parseInt(args[3]);
        numbers[3]=Integer.parseInt(args[4]);
        numbers[4]=Integer.parseInt(args[5]);

        System.out.println(Arrays.toString(numbers));
    }
}
