package conditonal_loops;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {
        System.out.println(average());
    }

    static float average() {
        Scanner in = new Scanner(System.in);
        float n = in.nextInt(), sum = 0, i = 0;

        while (n > 0) {
            sum = sum + n;
            n = in.nextInt();
            i++;
        }
        return sum / i;
    }
}
