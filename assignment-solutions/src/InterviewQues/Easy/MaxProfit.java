package InterviewQues.Easy;

// link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            int currentPrice = arr[i];
            int potentialProfit = currentPrice - minPrice;

            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }

            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            }
        }

        return maxProfit;
    }
}
