package Searching;

// Ques : 35. Search Insert Position
// link : https://leetcode.com/problems/search-insert-position/
class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(arr, target));
    }

    static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}