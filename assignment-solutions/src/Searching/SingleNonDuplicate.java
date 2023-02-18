package Searching;

// Ques : 540. Single Element in a Sorted Array
// link : https://leetcode.com/problems/single-element-in-a-sorted-array/
class SingleNonDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
        System.out.println(unique(arr));
    }

    // O(log n) solution using binary search

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

    /*

     O(n) solution using bit manipulation

     using bit manipulation is to XOR all the elements of the array.
      Since XOR of two same numbers gives 0, and XOR of any number
     with 0 gives the number itself, XORing all the numbers in the
     array will give the single number that appears only once.

     */
    public static int unique(int[] arr) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }
}