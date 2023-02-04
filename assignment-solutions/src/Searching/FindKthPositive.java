package Searching;

// Ques : 1539. Kth Missing Positive Number
// link : https://leetcode.com/problems/kth-missing-positive-number/

class FindKthPositive {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int missing = 5;
        System.out.println(findKthPositive(arr, missing));
    }
    public static int findKthPositive(int[] arr, int k) {
        int i = 0, j = 1, n = arr.length;
        while (i < n) {
            if (arr[i] == j) {
                i++;
            } else {
                k--;
                if (k == 0) {
                    return j;
                }
            }
            j++;
        }
        return arr[n - 1] + k;
    }
}