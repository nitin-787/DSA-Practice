package Searching;

// Ques: 33. Search in Rotated Sorted Array
// link : https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedSorted {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }

        // if pivot is found, you have found two asc array
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);
        } else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
