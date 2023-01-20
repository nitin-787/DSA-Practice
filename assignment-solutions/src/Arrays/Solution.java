package Arrays;

import java.util.*;

// link : https://leetcode.com/problems/add-to-array-form-of-integer/
// Ques :  989. Add to Array-Form of Integer
class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,1,0};
        int k = 25;
        System.out.println(addToArrayForm(arr, k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = num.length;
        int carry = k;
        for (int i = n - 1; i >= 0; i--) {
            carry += num[i];
            res.add(0, carry % 10);
            carry /= 10;
        }
        while (carry > 0) {
            res.add(0, carry % 10);
            carry /= 10;
        }
        return res;
    }
}
