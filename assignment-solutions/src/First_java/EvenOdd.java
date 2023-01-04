package First_java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        even(n);

    }

    static void even (int n) {
        if (n < 2) {
            System.out.println("Enter a valid number");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
