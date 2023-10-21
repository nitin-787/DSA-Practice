package com.nitin;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        ArrayList<Integer> list = new ArrayList<>(2);

        list.add(10);
        list.add(76);
        list.add(64);

        System.out.println(list.contains(64));

        list.set(0, 89);
        list.remove(2);
        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list.get(3));
    }
}
