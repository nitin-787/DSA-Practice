package Searching;

// link: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

public class GreaterThanEqualX {
    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(greaterThanEqualX(arr));
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
}
