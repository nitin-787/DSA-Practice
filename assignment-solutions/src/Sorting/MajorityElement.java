package Sorting;

import java.util.Arrays;

// Ques : 169. Majority Element
// link : https://leetcode.com/problems/majority-element/
class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}