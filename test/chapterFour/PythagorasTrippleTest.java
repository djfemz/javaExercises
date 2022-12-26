package chapterFour;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PythagorasTrippleTest {
    private int[][] numbers = {
            {16, 30, 34},
            {17, 144, 145},
            {18, 24, 30},

            {34, 288, 290},
            {35, 84, 91},
            {36, 48, 60},
            {38, 360, 362},
            {39, 52, 65},

            {300, 315, 435},
            {319, 360, 481},
            {320, 336, 464}
    };

    @Test
    void isValidPythagoreanTrippleTest() {
//        for (int row=0;row<numbers.length;row++) {
//            System.out.println(Arrays.toString(numbers[row]));
//            assertTrue(PythagorasTripple.isValidPythagoreanTripple(numbers[row][0], numbers[row][1], numbers[row][2]));
//        }
    }
}