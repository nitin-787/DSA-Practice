package com.nitin;

import java.util.Arrays;

public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {1,3,89,4,23,75,99};
//        int[] arr = {};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 3,4));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            Swap.swap(arr, start, end);
            start++;
            end--;
        }
    }
    static int maxRange(int[] arr, int start, int end) {
        if (arr.length < 1) {
            return -1;
        }
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    static int max(int[] arr) {
        if (arr.length < 1) {
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
