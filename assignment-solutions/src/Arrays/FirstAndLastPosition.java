package Arrays;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,5,7,7,8,8,10};
        int target = 5;
        System.out.println(Arrays.toString(firstAndLast(arr, target)));
    }

    static int[] firstAndLast(int[] arr, int target) {
        int[] ans = {-1,-1};
        int start = 0, end = arr.length-1;
        while (start <= end) {
            if (arr[start] == target) {
                ans[0] = start;
                break;
            }
            start++;
        }
        start = 0;
        while (end >= start) {
            if (arr[end] == target) {
                ans[1] = end;
                break;
            }
            end--;
        }
        return ans;
    }
}
