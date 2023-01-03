public class ProductSum {
    public static void main(String[] args) {
        int n = 234, product = 1, sum = 0, ans;

        while (n > 0) {
            int a = n % 10;
            product = a * product;
            sum = a + sum;
            n = n / 10;
        }
        ans = product - sum;
        System.out.println(ans);
    }
}