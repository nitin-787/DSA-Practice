package com.nitin;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][3];

        int[][] arr = {
                {1,2,3}, //0th index
                {4,5,6}, // 1st index
                {7,8,9}, // 2nd index -> arr[2] = {7,8,9}
        };

        System.out.println(arr[1][2]);
        System.out.println(Arrays.toString(arr[2]));

        // input
        int[][] arr1 = new int[3][3];
        for (int row = 0; row < arr1.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = in.nextInt();
            }
        }

        // output
        for (int row = 0; row < arr1.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }

        // output
        for (int row = 0; row < arr1.length; row++) {
            System.out.println(Arrays.toString(arr1[row]));
        }

        for (int[] a : arr1) {
            System.out.println(Arrays.toString(a));
        }
    }
}
