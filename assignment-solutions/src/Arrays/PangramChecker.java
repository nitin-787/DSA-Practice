package Arrays;

// Ques : 1832. Check if the Sentence Is Pangram
// link : https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// detailed solution : https://leetcode.com/problems/check-if-the-sentence-is-pangram/solutions/3054542/java-a-one-pass-solution-to-check-if-a-sentence-is-a-pangram/
class PangramChecker {
    public static void main(String[] args) {
        System.out.println(isPangram("hhequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean isPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }
}