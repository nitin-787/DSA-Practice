package Arrays;

// Ques : 1470. Shuffle the array
// link :  https://leetcode.com/problems/shuffle-the-array/
// Detailed solution : https://leetcode.com/problems/shuffle-the-array/solutions/3034916/100-fast-java-solution/

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(arr, n)));
    }

    static int[] shuffle(int[] arr, int n) {
       int[] Newarr = new int[arr.length];
       int start = 0, end = arr.length - 1, a = 0, i = 0;
       while (start < end) {
           Newarr[i] = arr[a];
           Newarr[i + 1] = arr[n];
           a++;
           i += 2;
           n++;
           start++;
            end--;
       }
       return Newarr;
    }
}
