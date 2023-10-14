package Arrays;

import java.util.Arrays;

//Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,5,7,7,8,8,10};
        int target = 5;
        System.out.println(Arrays.toString(firstAndLast(arr, target)));
        System.out.println(Arrays.toString(firstAndLast1(arr, target)));
    }

    // Modified binary search, time complexity O(log n)
    static int[] firstAndLast1(int[] arr, int target) {
    int firstOccurrence = binarySearch(arr, target, true);
    int lastOccurrence = binarySearch(arr, target, false);

        if (firstOccurrence == -1) {
        return new int[]{-1, -1};
    }

        return new int[]{firstOccurrence, lastOccurrence};
}

    static int binarySearch(int[] arr, int target, boolean findFirst) {
        int index = -1, start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return index;
    }

    static int[] firstAndLast(int[] arr, int target) {
        int[] ans = {-1,-1};
        int start = 0, end = arr.length-1;
        while (start <= end) {
            if (arr[start] == target) {
                ans[0] = start;
                break;
            }
            start++;
        }
        start = 0;
        while (end >= start) {
            if (arr[end] == target) {
                ans[1] = end;
                break;
            }
            end--;
        }
        return ans;
    }
}
