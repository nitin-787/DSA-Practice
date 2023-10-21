package com.nitin;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        System.out.println(arr[3]);

        // input using for loop
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int num: arr) { // for every element in the array print the element
            System.out.print(arr[num] + " "); // here num represents elements of the array
        }

        System.out.println(arr[5]); // index of bound error

        // array of objects
        String[] str = new String[4];
        int i;
        for (i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "nitin";
        System.out.println(Arrays.toString(str));
    }
}
