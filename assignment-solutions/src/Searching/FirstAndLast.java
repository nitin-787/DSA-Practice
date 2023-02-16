package Searching;

// Ques : 34. Find First and Last Position of Element in Sorted Array
// link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(firstandlast(arr, target)));
        System.out.println(Arrays.toString(fisrstandlastBS(arr, target)));
    }

    static int[] firstandlast(int[] nums, int target) {
        // time complexity -> O(n)
         int[] arr = {-1, -1};
         int end = nums.length - 1, i = 0;

         // edge case
         if (end < 0 ) {
             return new int[] {-1, -1};
         }
         // edge case
         if (nums[i] == target && nums[end] == target) {
             arr[0] = i;
             arr[1] = end;
             return arr;
         }
         // searching from the left to the target
        for (i = 0; i <= end; i++) {
            if (nums[i] == target) {
                arr[0] = i;
                break;
            }
        }

        // searching from the right to the target
        for (i = end; i >= 0; i--) {
            if (nums[i] == target) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }

    // O(log n)  solution
    static int[] fisrstandlastBS(int[] arr, int target) {
        int start = 0, end = arr.length -1;
        int[] ans = {-1,-1};

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans[0] = mid;
                ans[1] = mid;

                int left = mid - 1;

                while (left >= 0 && arr[left] == target) {
                    ans[0] = left;
                    left--;
                }

                int right = mid + 1;

                while (right < arr.length && arr[right] == target) {
                    ans[1] = right;
                    right++;
                }
                return ans;
            }
        }
        return ans;
    }
}
