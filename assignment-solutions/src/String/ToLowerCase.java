package String;

// Ques: 709. To Lower Case (without using inbuilt function)
// link: https://leetcode.com/problems/to-lower-case/
class ToLowerCase {
    public static void main(String[] args) {
        String s = "HELLO";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                str.append((char)(c + ('a' - 'A')));
            } else {
                str.append(c);
            }
        }
        return str.toString();

        // using in-built function
        // return s.toLowerCase();
    }
}