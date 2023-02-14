package Searching;

// Ques : 1346. Check If N and Its Double Exist
// link : https://leetcode.com/problems/check-if-n-and-its-double-exist/
class CheckIfExist {
    public static void main(String[] args) {
        int[] ans = {7,1,14,11};
        System.out.println(checkIfExist(ans));
    }
    public static boolean checkIfExist(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j && arr[i] == 2 * arr[j]) {
                        return true;
                    }
                }
            }
            return false;
    }
}
