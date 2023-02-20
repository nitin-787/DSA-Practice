package Searching;

// Ques : 153. Find Minimum in Rotated Sorted Array
// link : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMinimumInRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(search(arr));
    }


//    time complexity is the O(log n) - cuz we are using binary search,
//    to find the smallest element, which next to our pivot element
    static int search(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
