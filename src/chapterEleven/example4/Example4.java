package chapterEleven.example4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        int[] numbers={10,3,7,1,4,5,7,100,40,20,80,1000,6000,3003,1001,10001,6,20004,89875,67453};
        long start = System.nanoTime();
        System.out.println(start);
        System.out.println(brute(numbers, 6));
        long end = System.nanoTime();
        System.out.println(end);
        System.out.println("Linear search time:: "+(end - start));



//        start = System.nanoTime();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        start = System.nanoTime();
        System.out.println(Arrays.binarySearch(numbers, 6));
        end = System.nanoTime();
        System.out.println("Binary search time:: "+(end - start));


    }

    private static int brute(int[] numbers, int target){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==target) return i;
        }
        System.out.println("key: "+target+" not present in array");
        return -1;
    }
}
