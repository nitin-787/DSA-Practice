package First_java;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("Nitin"));
    }

    static boolean palindrome(String str) {
        String rev = "";
        str = str.toLowerCase();
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev.equals(str);
    }
}
