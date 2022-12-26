package chapterSeven.arrays.example2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Example2Test {


    @Test
    public void testGetEvenFromListWithEvenAtIndex_0_And_1(){
        //given that there is an array of integers
        int[] values= new int[5];
        values[0]=12;
        values[1]=90;
        values[2]=11;
        values[3]=21;
        values[4]=1;

        //when
        int[] evenNumbersFromList = Example2.getListOfEvenNumbers(values);

        //check
        assertEquals(2, evenNumbersFromList.length);

    }

    @Test
    public void testGetEvenFromListWithEvenAtIndex_3_And_4(){
        //given that there is an array of integers
        int[] values= new int[5];
        values[0]=1;
        values[1]=21;
        values[2]=11;
        values[3]=12;
        values[4]=14;

        //when
        int[] evenNumbersFromList = Example2.getListOfEvenNumbers(values);

        //check
        assertEquals(2, evenNumbersFromList.length);

    }


}