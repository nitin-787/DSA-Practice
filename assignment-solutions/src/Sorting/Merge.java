package Sorting;

// Ques : 88. Merge Sorted Array
// link : https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;
public class Merge {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3, n = 3;
        System.out.println(Arrays.toString(merge(arr1, arr2, m, n)));
    }

    static int[] merge(int[] arr1, int[] arr2, int m, int n) {
        int last = m + n - 1;
        while (m > 0 && n > 0) {
            if (arr1[m - 1] > arr2[n-1]) {
                arr1[last] = arr1[m-1];
                m--;
            } else {
                arr1[last] = arr2[n-1];
                n--;
            }
            last--;
        }

        while (n > 0) {
            arr1[last] = arr2[n-1];
            n--;
            last--;
        }
        return arr1;
    }
}
