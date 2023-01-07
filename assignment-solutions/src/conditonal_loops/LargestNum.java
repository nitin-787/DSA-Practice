package conditonal_loops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        System.out.println(largest());
    }

    static int largest() {
        Scanner in = new Scanner(System.in);
        int ans = 0, n = in.nextInt(), largest = 0;

        while (n > 0) {
            if (n > largest) {
                largest = n;
            }
            n = in.nextInt();
        }
        return largest;
    }
}