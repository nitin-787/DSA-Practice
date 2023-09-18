package InterviewQues.Easy;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,2,3,1,5};
        System.out.println(singleNumber(arr));
    }

    static int singleNumber(int[] arr) {
        // approach 1: we can sort the array and compare it with adjacent element
        int num = 0, n = arr.length - 1;
        Arrays.sort(arr);
        // edge case
        if (arr.length == 1) {
            return arr[0];
        } else  if (arr[n] != arr[n-1]) {
            return arr[n];
        }
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            if (arr[i] != arr[i+1]) {
                return arr[i];
            }
        }
        return num;
    }
}
