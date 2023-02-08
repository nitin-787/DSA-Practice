package Searching;

// Ques : 852. Peak Index in a Mountain Array
// link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
class PeakIndexInMountainArray {
    public static void main(String[] args) {
     int[] arr = {0,5,7,10,4,3};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
