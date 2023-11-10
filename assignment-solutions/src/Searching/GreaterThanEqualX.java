package Searching;

// link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

import java.util.Arrays;

public class GreaterThanEqualX {
    public static void main(String[] args) {
        int[] arr = {3,5};
        System.out.println(greaterThanEqualX(arr));
        System.out.println(greaterThanEqualX1(arr));
    }

    static int greaterThanEqualX(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int num: arr) {
                if (num >= i) {
                    count++;
                }
            }
            if (count == i) {
                return i;
            }
        }
        return -1;
    }

    // Sorting + Binary Search: time complexity = O(n log n)
    static int greaterThanEqualX1(int[] arr) {
        Arrays.sort(arr);
        int i = arr.length;

        while(i>0){
            int start=0, end = arr.length-1, count=0;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid] >= i){
                    count += end-mid+1;
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
            if(count==i){
                return i;
            }
            i--;
        }
        return -1;
    }
}