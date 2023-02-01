package Searching;
import java.util.*;

// Ques : 367. Valid Perfect Square
//link : https://leetcode.com/problems/valid-perfect-square/

class PerfectSquare {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        if (num == 0 || num == 1) {
            return true;
        }

        long x = num / 2;
        Set<Long> seen = new HashSet<>();
        seen.add(x);

        while (x * x != num) {
            x = (x + (num / x)) / 2;
            if (seen.contains(x)) {
                return false;
            }
            seen.add(x);
        }
        return true;
    }
}