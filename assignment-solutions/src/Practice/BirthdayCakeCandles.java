package Practice;
import java.util.List;
import java.util.Arrays;

// link : https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true


public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = Arrays.asList(3,1,2,3);
        System.out.println(birthdayCakeCandles(candles));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int num = 0, count = 0;
        for (Integer candle : candles) {
            if (num < candle) {
                num = candle;
                count = 1;
            } else if (candle == num) {
                count++;
            }
        }
        return count;
    }
}
