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
    static public List<Integer> addToArrayForm(int[]  arr, int k) {
        List<Integer> res = new ArrayList<>();
        for (int i =  arr.length - 1; i > 0; i++) {
            k += arr[i];
        }
        return res;
    }
}
