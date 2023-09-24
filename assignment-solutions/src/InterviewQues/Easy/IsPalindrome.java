package InterviewQues.Easy;

public class IsPalindrome {
    public static void main(String[] args) {
        String s = "N i t i n a";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        String ans = s.toLowerCase();
        ans = ans.replaceAll("[^a-z0-9]", "");
        int left = 0, right = ans.length() - 1;

        while (left <= right) {
            if (ans.charAt(left) != ans.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
