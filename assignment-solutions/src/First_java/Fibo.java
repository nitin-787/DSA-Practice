package First_java;

public class Fibo {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, c = 0;
        while (n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
            n--;
        }
    }
}
