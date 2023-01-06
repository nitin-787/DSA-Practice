package conditonal_loops;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(10);
    }

    static void fibo(int n) {
        int a = 0, b = 1;
        int ans = 0;

        while (n > 0) {
            ans = a + b;
            a = b;
            b = ans;
            System.out.print(ans + " ");
            n--;
        }
    }
}
