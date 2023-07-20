package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//link : https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true

public class CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(5,6,7);
        List<Integer> list2 = Arrays.asList(3,2,10);
        System.out.println(compareTriplets(list1, list2));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> list = new ArrayList<>(2);
        int alic = 0, bob = 0;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alic++;
            } else if (a.get(i) < b.get(i)){
                bob++;
            }
        }
        list.add(alic);
        list.add(bob);

        return list;
    }
}
