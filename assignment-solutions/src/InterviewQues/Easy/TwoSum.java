package InterviewQues.Easy;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4,2,6,7};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        // approach 1:
        // int i = 0, j = i + 1;

        // while (i < arr.length - 1) {
        //     if (arr[i] + arr[j] == target) {
        //         return new int[]{i, j};
        //     } else {
        //         j++;
        //     }
        //     if (j == arr.length) {
        //         i++;
        //         j = i+1;
        //     }
        // }
        // return new int[]{-1, -1};

        // approach 2:
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
