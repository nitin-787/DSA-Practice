package String;

// Ques: 1704. Determine if String Halves Are Alike
// link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "nitinNITIN";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        // separating String "s" into two halves "a" and "b"
        for (int i = 0, j = s.length()-1; i < s.length() / 2; i++, j--) {
            a.append(s.charAt(i));
            b.append(s.charAt(j));
        }

        int countA = countVowels(a.toString());
        int countB = countVowels(b.toString());
        return countA == countB;
    }

    // check how many vowels are there in a string
    private static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}