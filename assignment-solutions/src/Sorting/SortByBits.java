// Ques : 1356. Sort Integers by The Number of 1 Bits
// link : https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

package Sorting;

import java.util.Arrays;

class SortByBits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        Integer[] integers = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integers[i] = arr[i];
        }

        Arrays.sort(integers, (a, b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);

            if (countA == countB) {
                return a - b;
            } else {
                return countA - countB;
            }
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = integers[i];
        }

        return arr;
    }
}