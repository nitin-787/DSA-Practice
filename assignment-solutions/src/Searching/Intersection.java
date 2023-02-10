package Searching;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Ques : 349. Intersection of Two Arrays
// link : https://leetcode.com/problems/intersection-of-two-arrays/
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num : intersect) {
            result[i++] = num;
        }
        return result;
    }
}