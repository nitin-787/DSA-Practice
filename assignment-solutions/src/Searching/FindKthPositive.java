package Searching;

// Ques : 1539. Kth Missing Positive Number
// link : https://leetcode.com/problems/kth-missing-positive-number/

class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int missing = 2;
        System.out.println(findKthPositive(arr, missing));
    }
    public static int findKthPositive(int[] arr, int k) {
        // two pointer method time complexity O(n)
        int i = 0, j = 1;
        while (k > 0) {
            if (i < arr.length && arr[i] == j) {
                i++;
            } else {
                k--;
            }
            j++;
        }
        return j - 1;

        // brute for time complexity O(n^2)
//        int i = 0, j = 1, n = arr.length;
//        while (i < n) {
//            if (arr[i] == j) {
//                i++;
//            } else {
//                k--;
//                if (k == 0) {
//                    return j;
//                }
//            }
//            j++;
//        }
//        return arr[n - 1] + k;
    }
}