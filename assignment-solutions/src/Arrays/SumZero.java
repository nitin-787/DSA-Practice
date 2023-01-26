package Arrays;

// Ques : 1304. Find N Unique Integers Sum up to Zero
// link : https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

import java.util.*;

class SumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    static public int[] sumZero(int n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n / 2; i++) {
                list.add(i);
                list.add(-i);
            }
            if (n % 2 != 0) {
                list.add(0);
            }
            return list.stream().mapToInt(i -> i).toArray();
    }
}