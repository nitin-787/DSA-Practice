package Searching;

// Ques : 1095. Find in Mountain Array
// link : https://leetcode.com/problems/find-in-mountain-array/

class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(target, arr));
    }
    public static int findInMountainArray(int target, int[] arr) {
        int start = 0, end = arr.length-1, peak = 0;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = peak = mid;
            } else {
                start = mid + 1;
            }
        }

        start = 0; end = peak;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }

        start = peak; end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}