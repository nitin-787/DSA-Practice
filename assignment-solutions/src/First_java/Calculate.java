package First_java;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number one : ");
        int a = in.nextInt();
        System.out.print("Enter number two : ");
        int b = in.nextInt();
        System.out.print("Enter operator : ");
        char op = in.next().charAt(0);
        calculator(a, b, op);
    }

    static void calculator(int a, int b, char op) {
        switch (op) {
            case '+' -> System.out.println(a + b);
            case '-' -> System.out.println(a - b);
            case '*' -> System.out.println(a * b);
            case '/' -> System.out.println(a / b);
            case '%' -> System.out.println(a % b);
            default -> System.out.println("Enter a valid operator");
        }
    }
}
