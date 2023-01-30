package Searching;

// Ques : 278. First Bad Version
// link : https://leetcode.com/problems/first-bad-version/
// https://leetcode.com/problems/first-bad-version/solutions/3119258/1ms-runtime-fast-solution/

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(10));
    }

    // to submit it on leetcode just use this function for detailed solution check the out the link above
    public static int firstBadVersion(int n) {
        int start = 1, end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isBadVersion(mid)) {
                n = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return n;
    }

    static boolean isBadVersion(int mid) {
        return mid >= 4;
    }
}