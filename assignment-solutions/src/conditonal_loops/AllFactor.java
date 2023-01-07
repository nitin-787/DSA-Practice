package conditonal_loops;

public class AllFactor {
    public static void main(String[] args) {
        factor(10);
    }

    static void factor(int n) {
        int i = 1;
        while (i <= n)
        if (n % i == 0) {
            System.out.print(i + " ");
            i++;
        } else {
            i++;
        }
    }
}
