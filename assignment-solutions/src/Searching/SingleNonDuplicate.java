package Searching;

// Ques : 540. Single Element in a Sorted Array
// link : https://leetcode.com/problems/single-element-in-a-sorted-array/
class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
    public static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
            while (start < end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 1 && nums[mid-1] == nums[mid]) {
                start = mid + 1;
            }
            else if (mid % 2 == 0 && nums[mid+1] == nums[mid]) {
                start = mid + 1;
            }

            else {
                end = mid;
            }
        }
        return nums[start];
    }
}