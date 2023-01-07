package conditonal_loops;

// Ques : 1281. Subtract the Product and Sum of Digits of an Integer - LeetCode
// Ques link : https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

public class SubtractProductAndSum {
    public static void main(String[] args) {
        System.out.println(sumProduct(4421));
    }

    static int sumProduct(int n) {
        int product = 1, sum = 0, ans;
        while (n > 0) {
            int a = n % 10;
            product = product * a;
            sum = sum + a;
            n = n / 10;
        }
        ans = product - sum;
        return ans;
    }
}
