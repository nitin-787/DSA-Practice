package Practice;

import java.util.Arrays;
import java.util.List;

//link : https://www.hackerrank.com/challenges/a-very-big-sum/problem?isFullScreen=true


public class AVeryBigSum {
    public static void main(String[] args) {
        List<Long> list = Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        System.out.println(aVeryBigSum(list));
    }

    public static long aVeryBigSum(List<Long> ar) {
     long sum = 0;
        for (Long aLong : ar) {
            sum = sum + aLong;
        }
     return sum;
    }
}