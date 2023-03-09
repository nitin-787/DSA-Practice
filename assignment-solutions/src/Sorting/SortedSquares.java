package Sorting;

// Ques : 977. Squares of a Sorted Array
// link : https://leetcode.com/problems/squares-of-a-sorted-array/

import java.util.Arrays;

class SortedSquares {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int i = 0;

        // O (n) -> iterating through the every element in this array so the time complexity would be big oh of n.
        while (i <= nums.length-1) {
            nums[i] = nums[i] * nums[i];
            i++;
        }

        // O(n log n) -> java uses the "dual Pivot quicksort" which has big oh of n log n time complexity
        Arrays.sort(nums);
        return nums;

        // the overall complexity of this algo is O(n log n), bcuz the O(n log n) is dominating term
    }
}