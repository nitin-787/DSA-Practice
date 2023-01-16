package Arrays;

// Ques : 1773. Count Items Matching a Rule
// link : https://leetcode.com/problems/count-items-matching-a-rule/
// solution link : https://leetcode.com/problems/count-items-matching-a-rule/solutions/3059857/easy-java-solution/

import java.util.*;
class countMatches {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("phone","blue","pixel"));
        list.add(Arrays.asList("computer","silver","lenovo"));
        list.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color", ruleValue = "silver";

        System.out.println(countMatches(list, ruleKey, ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            if (ruleKey.equals("type") && ruleValue.equals(item.get(0))) {
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(item.get(1))) {
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(item.get(2))) {
                count++;
            }
        }

        return count;
    }
}