package com.nitin;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Nitin";
        char target = 'i';
        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }


    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}