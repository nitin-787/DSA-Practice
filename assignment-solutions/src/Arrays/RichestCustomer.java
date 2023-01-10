package Arrays;

// Ques : 1672. Richest Customer Wealth
// Link : https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr = {
                {20,35,45},
                {21,9,15},
                {32,11,38},
        };

        System.out.println(richestCustomer(arr));
    }

    static int richestCustomer(int[][] arr) {
        int maximun = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            maximun = Math.max(maximun, sum);
        }
        return maximun;
    }
}
