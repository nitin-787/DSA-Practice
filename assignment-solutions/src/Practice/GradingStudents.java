package Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(73,67,38,33);
        System.out.println(gradingStudents(marks));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i: grades) {
            int multiple_of_5 = (i / 5 + 1) * 5;
            if (multiple_of_5 - i < 3 && i >= 38) {
                list.add(multiple_of_5);
            } else {
                list.add(i);
            }
        }
        return list;
    }
}
