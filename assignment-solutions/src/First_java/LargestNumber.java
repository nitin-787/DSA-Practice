package First_java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number one : ");
        int a = in.nextInt();
        System.out.print("Enter number two : ");
        int b = in.nextInt();

        System.out.println(largest(a, b));
    }

    static int largest(int a, int b) {
        return a > b ? a : b;
    }
}
