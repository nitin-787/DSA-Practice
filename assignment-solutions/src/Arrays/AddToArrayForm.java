package Arrays;

// Ques : 989. Add to Array-Form of Integer
// link : https://leetcode.com/problems/add-to-array-form-of-integer/

import java.util.*;

class AddToArrayForm {
    public static void main(String[] args) {
        int[] arr = {2,7,4};
        int k = 181;
        System.out.println(addToArrayForm(arr, k));
    }
    static public List<Integer> addToArrayForm(int[] num, int k) {
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
