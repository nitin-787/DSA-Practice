package InterviewQues.Easy;

// link : https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class StrStr {
    public static void main(String[] args) {
        String needle = "sad";
        String haystack = "butsad";
        System.out.println(strStr(needle, haystack));
    }

    static int strStr(String needle, String haystack) {
        int needleLength = needle.length();
        int heyLength = haystack.length();

        // edge case
        if (heyLength < needleLength) {
            return -1;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j=0;
            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}
