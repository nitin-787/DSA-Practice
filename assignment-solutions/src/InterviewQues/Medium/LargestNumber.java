package InterviewQues.Medium;
import java.util.Arrays;

// link : https://leetcode.com/problems/largest-number/
public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {10,2};
        System.out.println(largestNumber(arr));
    }

    static String largestNumber(int[] arr) {
        String s[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            s[i]=String.valueOf(arr[i]);
        }
        StringBuilder sb=new StringBuilder("");
        Arrays.sort(s,(a,b)->(b+a).compareTo(a+b));
        for(String str:s)
        {
            sb.append(str);
        }
        String result=sb.toString();
        return result.startsWith("0")?"0":result;
    }
}
