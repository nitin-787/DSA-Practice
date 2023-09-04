package InterviewQues.Easy;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCM"));
    }

     static int romanToInt(String s) {
        int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if (num < ans)  {
                ans = ans -  num;
            }
            else ans = ans + num;
        }
        return ans;
    }
}
