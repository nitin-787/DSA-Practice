package Practice;

import java.util.Scanner;

// link : https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findDigits(n));
    }

    static int findDigits(int n) {
        int ans = 0, x = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0) {
                if (x % digit == 0) {
                    ans++;
                }
            }
            n = n / 10;
        }
        return ans;
    }
}
