package Arrays;

import java.util.Arrays;

// Ques : 1920. Build Array from Permutation
// Ques Link : https://leetcode.com/problems/build-array-from-permutation/
// Solution : https://leetcode.com/problems/build-array-from-permutation/solutions/3014208/easy-solution-for-any-language/
public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    // brute force solution : Time complexity = O(n)
    // explanation : First, I declare an array ans of the same length as nums and initialize two variables i and a to 0 and nums.length - 1,
    // respectively.
    // then enter a loop that continues until a becomes less than 0.
    // Inside the loop, I set ans[i] to the element of nums at the index specified by the element of nums at index i.
    // then decrement a by 1 and increment i by 1.
    // After the loop ends, I returned the ans array.
    // Overall, my code correctly builds the ans array by iterating through each index i in nums and setting ans[i]
    // to the element of nums at the index specified by the element of nums at index i.
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; int i = 0, a = nums.length - 1;
        while (a >= 0) {
            ans[i] = nums[nums[i]];
            a--;
            i++;
        }
        return ans;
    }
}
