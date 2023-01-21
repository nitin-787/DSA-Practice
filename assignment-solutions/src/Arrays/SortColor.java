package Arrays;

// Ques : 75. Sort Colors
// link : https://leetcode.com/problems/sort-colors/

import java.util.Arrays;

class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortColors(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;   // remove this line to submit in leetCode
            // for each step, max index will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped =true; // remove this line to submit in leetCode
                }
            }

            // if you did not swap for a particular value of i, it means array is sorted hence stop the program
            if (!swapped){ // !false = true    // remove this if part also to submit in leetCode
                break;   
            }
        }
    }
}