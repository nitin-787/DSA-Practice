package InterviewQues.Easy;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1};
        System.out.println(duplicate(arr));
    }

    // time complexity: brute force approach time complexity in big-oh of n^2
    //  space complexity: O(1) --> constant
//    static boolean duplicate(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    return true;
//                }
//        }
//        return false;
//    }

//    static boolean duplicate(int[] arr) {
//        // sorting takes big-oh on (n log n)
//        Arrays.sort(arr);
//
//        // iterating through the entire array once taking big-oh of n, overall time complexity will O(n log n) because is the dominating term
//        // which is slightly better than O(n^2), //  space complexity: O(1) --> constant
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] == arr[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    static boolean duplicate(int[] arr) {
        // best approach, time complexity big-oh of n
        // space complexity big-oh of n
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) return true;
        }
        return false;
    }
}
