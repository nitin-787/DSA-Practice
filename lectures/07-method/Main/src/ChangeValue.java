import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {23, 34, 45, 0, 12};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeValue(int[] num) {
        num[0] = 99;
    }
}
