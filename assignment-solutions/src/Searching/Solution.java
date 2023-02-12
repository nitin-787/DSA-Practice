package Searching;

// Ques : 888. Fair Candy Swap
// link : https://leetcode.com/problems/fair-candy-swap/

import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        int[] result = new int[2];
        int sumA = 0, sumB = 0;
        for (int a : A) {
            sumA += a;
        }
        for (int b : B) {
            sumB += b;
        }
        int diff = (sumA - sumB) / 2;
        HashSet<Integer> setB = new HashSet<>();
        for (int b : B) {
            setB.add(b);
        }
        for (int a : A) {
            if (setB.contains(a - diff)) {
                result[0] = a;
                result[1] = a - diff;
                break;
            }
        }
        return result;
    }
}
