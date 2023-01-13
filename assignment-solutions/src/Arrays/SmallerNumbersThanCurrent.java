package Arrays;
import java.util.Arrays;

// Ques : 1365. How Many Numbers Are Smaller Than the Current Number
// Link : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smaller(arr)));
    }

    static int[] smaller(int[] arr) {
        int count = 0, k = 0;
        int[] ans = new int[arr.length];


        for (int i = 0; i < arr.length; i++, k++, count = 0) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
            ans[k] = count;
        }
        return ans;
    }
}
