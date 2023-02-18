package Searching;

// Ques : Ceiling in a sorted array
// link : https://www.geeksforgeeks.org/ceiling-in-a-sorted-array/ - must solve in O(log n)
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,9,16,18};
        int target = 7;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {
        int start = 0, end = arr.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                end = mid;
            } else if (arr[mid] < target) {
                start = mid+1;
            }
        }
        return end;
    }
}
