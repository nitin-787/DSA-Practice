package Practice;

import java.util.*;

// link: https://www.hackerrank.com/challenges/mini-max-sum/problem?isFullScreen=true
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1,2,3,4,5);
        miniMaxSum(arr);
    }

    static void miniMaxSum(List<Integer> arr) {
        long sum  = 0;
        for (Integer integer: arr) {
            sum = sum + integer;
        }
        Collections.sort(arr);
        System.out.println((sum - arr.get(4)) + " " + (sum - arr.get(0)));
    }
}
