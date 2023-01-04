package First_java;

import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter dollar : ");
        float a = in.nextFloat();
        System.out.println(dollar(a));
    }

    static float dollar(float a) {
        return a * 82.87f;
    }
}
