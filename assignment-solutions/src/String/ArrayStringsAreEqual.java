package String;

// ques: 1662. Check If Two String Arrays are Equivalent
// link: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class ArrayStringsAreEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a","b", "c"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for (String s : word1) {
            sb.append(s);
        }
        for (String s : word2) {
            sb1.append(s);
        }
        System.out.println(sb);
        System.out.println(sb1);
        return sb.toString().equals(sb1.toString());
    }
}