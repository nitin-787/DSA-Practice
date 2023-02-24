package Searching;

// Ques : 4. Median of Two Sorted Arrays
// link : https://leetcode.com/problems/median-of-two-sorted-arrays/

class FindMedianSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int[] arr1 = {2,4};
        System.out.println(findMedianSortedArrays(arr, arr1));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        // Make sure that nums1 is the smaller array
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int start = 0;
        int end = m;

        while (start <= end) {
            int partition1 = (start + end) / 2;
            int partition2 = (m + n + 1) / 2 - partition1;

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == m) ? Integer.MAX_VALUE : nums1[partition1];
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n) ? Integer.MAX_VALUE : nums2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 0) {
                    return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2;
                } else {
                    return (double) Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                end = partition1 - 1;
            } else {
                start = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Invalid input");
    }
}