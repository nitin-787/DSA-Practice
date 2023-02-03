package Searching;

// Ques : 441. Arranging Coins
// link : https://leetcode.com/problems/arranging-coins/
class ArrangingCoins {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        long start = 1, end = n;

        while(start <= end){
            long mid = start + (end - start)/2;
            long sum  = mid * (mid + 1) / 2;

            if(sum == n){
                return (int)mid;
            } else if(sum < n){
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return (int)end;
    }
}