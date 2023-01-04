package First_java;

public class ArmStrong {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (armStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean armStrong(int n) {
        int sum = 0, original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return sum == original;
    }
}
