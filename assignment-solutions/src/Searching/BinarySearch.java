package Searching;

// Ques : 704. Binary Search
// link : https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(arr, target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length-1;

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
        return -1;
    }
}
