package InterviewQues.Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9,9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }

    static int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i] = arr[i] + 1;
                return arr;
            } else {
                arr[i] = 0;
            }
        }
        int[] ans = new int[arr.length + 1];
        ans[0] = 1;
        return ans;
    }
}
