package chapterSeven.arrays.example4;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,7},{4,5},{7},{10,11,12}};

        for (int[] row:numbers) {
            System.out.println(Arrays.toString(row));
        }
    }
}
