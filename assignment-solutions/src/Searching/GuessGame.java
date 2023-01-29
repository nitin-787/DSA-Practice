package Searching;

// Ques : 374. Guess Number Higher or Lower
//link : https://leetcode.com/problems/guess-number-higher-or-lower/
public class GuessGame {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
    public static int guessNumber(int n) {
        int start = 1, end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // un-comment the below line to submit on leetCode
//            int pick = guess(mid);
            if (pick > 0 ) {
                start = mid + 1;
            } else if (pick < 0) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return end;
    }
}