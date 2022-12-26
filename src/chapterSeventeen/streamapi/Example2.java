package chapterSeventeen.streamapi;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,12,14,5};
        int[] numbers = {18,1,5,7,9,19,13,15};
        System.out.println(a(nums));
    }

    private static int a(int[] nums){
        var odd = Arrays.stream(nums).dropWhile(n->n%2==0);
        var even = Arrays.stream(nums).dropWhile(n->n%2!=0);
        var evenNum = even.findFirst().getAsInt();
        if (evenNum%2==0)return evenNum;
        else return odd.findFirst().getAsInt();
    }
}
