package Arrays;

// Ques : 1431. Kids With the Greatest Number of Candies
// Link : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Detailed Solution : https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/solutions/3035040/easy-to-understand-java-solution/

import java.util.*;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[]candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

//        int largest = 0, i = 0;
//
//        while (i < candies.length) {
//            largest = Math.max(largest, candies[i]);
//            candies[i] = candies[i] + extraCandies >= largest;
//            i++;
//        }
//        return Arrays.asList(candies);
//    }

        // finding the largest element first
        int start = 0, end = candies.length, largest = 0;
        while (start < end) {
            largest = Math.max(largest, candies[start]);
            start++;
        }
        System.out.println(largest);

        List<Boolean> list = new ArrayList<Boolean>();
        // reset the value of start
        start = 0;
        while (start < end) {
            if (candies[start] + extraCandies >= largest) {
                list.add(true);
            } else {
                list.add(false);
            }
            start++;
        }
        return list;
    }
}
