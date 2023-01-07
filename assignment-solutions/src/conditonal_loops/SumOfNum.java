package conditonal_loops;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        while (n > 0) {
            sum = sum + n;
            n = in.nextInt();
        }
        return sum;
    }
}
