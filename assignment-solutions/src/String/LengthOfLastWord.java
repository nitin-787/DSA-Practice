package String;

// Ques: 58. Length of Last Word
// link: https://leetcode.com/problems/length-of-last-word/
class LengthOfLastWord {
    public static void main(String[] args) {
        String name = "  Nitin Sharma  ";
        System.out.println(lengthOfLastWord(name));
        System.out.println(lengthOfLastWord1(name));
    }

    public static int lengthOfLastWord1(String s) {
        s = s.trim();                 // Remove any leading or trailing spaces
        int lastSpace = s.lastIndexOf(' ');  // Find the index of the last space character
        if (lastSpace == -1) {        // If there are no spaces, return the length of the whole string
            return s.length();
        } else {
            return s.length() - lastSpace - 1;  // Return the length of the characters after the last space
        }
    }

    public static int lengthOfLastWord(String s) {
        // Step 1: Trim the input string
        s = s.trim();

        // Step 2: Traverse the string from right to left
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                // Step 3: Count the characters
                count++;
            } else {
                // We have encountered a space, so the last word has ended
                break;
            }
        }

        // Step 4: Return the count
        return count;
    }
}