package Arrays;

// link : https://leetcode.com/problems/concatenation-of-array/
// detailed solution link : https://leetcode.com/problems/concatenation-of-array/solutions/3019692/on-solution-with-explanation-on-pen-paper/ 
import java.util.Arrays;

class Concatenation {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int i = 0, length = nums.length;
        int[] ans = new int[length * 2];

        while (length > i) {
            ans[i] = nums[i];
            ans[length + i] = nums[i];
            i++;
        }
        return ans;
    }
}
