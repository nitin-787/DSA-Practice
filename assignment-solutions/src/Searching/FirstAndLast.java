package Searching;

// Ques : 34. Find First and Last Position of Element in Sorted Array
// link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,6,6,7,7,9,9};
        int target = 7;
        System.out.println(Arrays.toString(firstandlast(arr, target)));
    }

    static int[] firstandlast(int[] nums, int target) {
        // time complexity -> O(n)
         int[] arr = {-1, -1};
         int end = nums.length - 1, i = 0;

         // edge case
         if (end < 0 ) {
             return new int[] {-1, -1};
         }
         // edge case
         if (nums[i] == target && nums[end] == target) {
             arr[0] = i;
             arr[1] = end;
             return arr;
         }
         // searching from the left to the target
        for (i = 0; i <= end; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }

        // searching from the right to the target
        for (i = end; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}
