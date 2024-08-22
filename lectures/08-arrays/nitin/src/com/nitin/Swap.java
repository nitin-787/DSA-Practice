package com.nitin;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,23,9,10};
        swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int a, int b) {
         int temp = arr[a];
         arr[a] = arr[b];
         arr[b] = temp;
    }
}
