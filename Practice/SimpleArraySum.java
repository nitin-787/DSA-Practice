package Practice;
import java.util.*;

public class SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 10, 11);
        System.out.println(simpleArraySum(list));
    }

    public static int simpleArraySum(List<Integer> list) {
        int sum = 0;

        for (Integer integer : list) {
            sum = sum + integer;
        }

        return sum;
    }
}
