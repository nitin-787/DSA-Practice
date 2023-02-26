package Sorting;

// Ques : 217. Contains Duplicate
// link : https://leetcode.com/problems/contains-duplicate/
// just for understanding the time complexity  : https://leetcode.com/problems/contains-duplicate/solutions/3233433/just-for-understanding-the-time-complexity/
import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(duplicate(arr));
    }

    static boolean duplicate(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return true;
            }
        }
        return false;
    }
}
