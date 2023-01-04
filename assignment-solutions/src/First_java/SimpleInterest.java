package First_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int p = in.nextInt();
        System.out.print("Enter time: ");
        int t = in.nextInt();
        System.out.print("Enter rate: ");
        int r = in.nextInt();

        simple(p, t, r);
    }

    static void simple(int p, int t, int r) {
        int si = (p * t * r) / 100;
        System.out.println("Interest need to be returned : " + si);
        System.out.println("Total amount after adding interest : " + (si + p));
    }
}
