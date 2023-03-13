package Sorting;

import java.util.*;

// Ques  : 1122. Relative Sort Array
// link : https://leetcode.com/problems/relative-sort-array/

class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr1) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> res = new ArrayList<>();
        for (int num : arr2) {
            if (freq.containsKey(num)) {
                int count = freq.get(num);
                for (int i = 0; i < count; i++) {
                    res.add(num);
                }
                freq.remove(num);
            }
        }
        
        List<Integer> remaining = new ArrayList<>();
        for (int num : freq.keySet()) {
            int count = freq.get(num);
            for (int i = 0; i < count; i++) {
                remaining.add(num);
            }
        }
        Collections.sort(remaining);
        res.addAll(remaining);
        
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
