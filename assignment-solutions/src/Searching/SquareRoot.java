package Searching;

// Ques : 69. Sqrt(x)
// link : https://leetcode.com/problems/sqrtx/
public class SquareRoot {
      public static void main(String[] args) {
      System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        double res = x;
        double eps = 0.000000001;
        int ans = 0;
        while (Math.abs(res - x / res) > eps * res) {
            res = (res + x / res) / 2;
        }
        System.out.println(res);
        ans = (int) Math.floor(res);
        return ans;
    }
}
