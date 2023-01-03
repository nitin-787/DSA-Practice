import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a = 40, b = 20;
        int ans = sum2(a, b);
        System.out.println(ans);
    }

    public static int sum2(int num1, int num2) {

        int sum = num1 + num2;
        return sum;
    }

    public static int sum1() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number one: ");
        num1 = in.nextInt();
        System.out.print("Enter number two: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        return sum;
    }


    public static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter number one: ");
        num1 = in.nextInt();
        System.out.print("Enter number two: ");
        num2 = in.nextInt();
        sum = num1 + num2;
        System.out.println(sum);
    }

    // method syntax

    /*
    access_modifier return_type name (arguments) {
        // body

        return type
    }
     */
}
