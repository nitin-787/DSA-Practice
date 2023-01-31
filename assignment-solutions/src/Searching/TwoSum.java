package Searching;

// Ques : 167. Two Sum II - Input Array Is Sorted
// link : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    static public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;

        while (start < end) {
            int currSum = numbers[start] + numbers[end];

            if (currSum > target) {
                end--;
            } else if (currSum < target){
                start++;
            } else {
                return new int[] {start + 1, end + 1};
            }
        }
        return new int[0];
    }
}