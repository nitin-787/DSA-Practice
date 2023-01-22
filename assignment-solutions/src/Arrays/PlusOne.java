package Arrays;


// Ques : 66. Plus One
// link : https://leetcode.com/problems/plus-one/
// solution : https://leetcode.com/problems/plus-one/solutions/3086695/beats-100-solutions/
import java.util.Arrays;

class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}