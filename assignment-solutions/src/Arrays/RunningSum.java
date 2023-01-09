package Arrays;

// Today's question :  1480. Running Sum of 1d Array
// link : https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    static int[] runningSum(int[] arr) {
        int i = 0, length = arr.length, sum = 0;
        int[] ans = new int[length];

        while (length > i) {
            sum = sum + arr[i];
            ans[i] = sum;
            i++;
        }
        return ans;
    }
}
