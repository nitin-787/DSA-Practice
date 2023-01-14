package Arrays;

// Ques : 1389. Create Target Array in the Given Order
// link : https://leetcode.com/problems/create-target-array-in-the-given-order/
// solution : https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/3050913/easy-o-n-solution/
import java.util.*;
public class createTargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4}, index = {0,1,2,2,1};
        System.out.println(Arrays.toString(targetArray(nums, index)));
    }

    static int[] targetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            target.add(index[i], nums[i]);
            i++;
        }
        return target.stream().mapToInt(j -> j).toArray();
    }
}
