package chapterSeven.arrays.example2;

public class Example2 {


    public static int[] getListOfEvenNumbers(int[] numbers){
        int count=0;
        int[] evenNumbers;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index]%2==0)count++;
        }
        evenNumbers=new int[count];
        int counter=0;

        for (int index = 0; index < numbers.length; index++) {
            int numberAtIndex=numbers[index];
            if (numberAtIndex%2==0) {
                evenNumbers[counter] = numberAtIndex;
                counter++;
            }
        }
        return evenNumbers;

    }
}
