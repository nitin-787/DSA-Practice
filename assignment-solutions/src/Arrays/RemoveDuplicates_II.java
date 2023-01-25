package Arrays;

// Ques : 80. Remove Duplicates from Sorted Array II
// link : https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

import java.util.Arrays;

class RemoveDuplicates_II {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }


    static int removeDuplicates(int[] arr) {
        int i = 2, j = 2;
        if (arr.length <= 2) {
         return arr.length;
        }

        while (i < arr.length) {
            if (arr[i] != arr[j - 2]) {
                arr[j++] = arr[i];

                /*      arr[j++] = arr[j]
                            OR both are same thing
                         arr[j] = arr[i]
                         j++
                 */
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
        return j;
    }
}