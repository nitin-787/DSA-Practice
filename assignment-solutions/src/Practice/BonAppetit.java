package Practice;
import java.util.Arrays;
import java.util.List;

// link: https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true

public class BonAppetit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,10,2,9);
        int k = 4, b = 1;
        bonAppetit(list,k,b);
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalBill = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                totalBill += bill.get(i);
            }
        }

        int annaPortion = totalBill / 2;
        if (b == annaPortion) {
            System.out.println("Bon Appetit");
        } else {
            int refundAmount = b - annaPortion;
            System.out.println(refundAmount);
        }
    }
}
