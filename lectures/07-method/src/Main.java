import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q take to number and print sum of it
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number one: ");
        num1 = in.nextInt();
        System.out.print("Enter number two: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }
}