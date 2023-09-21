package InterviewQues.Easy;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7,2,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr) {
        int profit = 0, smallest = arr[0], largest = 0, n = arr.length-1, j = 0, k = 0;
        // find the smallest number first in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                j = i;
            }
        }
        if (smallest == arr[n]) {
            return profit;
        } else {
            // find the largest number it must be after the smallest, if not the return 0
            for (int i = arr[smallest]; i < arr.length; i++) {
                if (arr[i] > largest) {
                    largest = arr[i];
                    k = i;
                }
                System.out.println(largest);
            }
        }
        if (j < k) {
            return 0;
        }
        // largest number - smallest
        return largest-smallest;
    }
}
