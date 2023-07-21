package Practice;

// link : https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,1,0,-1,-1);
        plusMinus(list);
    }

    public static void plusMinus(List<Integer> arr) {
        double positive = 0, negative = 0, zero = 0, length = arr.size();
        int i = 0;
        while (i < length) {
            if (arr.get(i) > 0) {
                positive++;
                i++;
            } else if (arr.get(i) < 0){
                negative++;
                i++;
            } else {
                zero++;
                i++;
            }
        }
        System.out.printf("%.6f%n", positive/length);
        System.out.printf("%.6f%n", negative/length);
        System.out.printf("%.6f%n", zero/length);
    }
}
