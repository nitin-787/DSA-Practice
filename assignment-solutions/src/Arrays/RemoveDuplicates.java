package Arrays;

// Ques : 26. Remove Duplicates from Sorted Array (must use in place sorting)
// link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] nums) {
        int i = 0, j = 1;

        while (i < nums.length - 1) {
            if (nums[i] != nums[i+1]) {
                nums[j] = nums[i+1];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return j;
    }
}