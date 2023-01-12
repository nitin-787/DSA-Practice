package Arrays;

public class GoodPair {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(goodPair(arr));
    }

    static int goodPair(int[] arr) {
        int end = arr.length, ans = 0;

        for (int i = 0; i < end; i++) {
            for (int j = i+1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    ans = ans + 1;
                }
            }
        }
        return ans;
    }
}
