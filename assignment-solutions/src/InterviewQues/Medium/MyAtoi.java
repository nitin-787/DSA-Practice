package InterviewQues.Easy;

class MyAtoi {
    public static void main(String[] args) {
        String s = "-4193 with words";
        System.out.println(myAtoi(s));
    }
    static int myAtoi(String s) {
        // Remove leading whitespace
        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        int sign = 1;
        int index = 0;
        // Check for sign
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }

        long result = 0; // Use a long to handle potential overflow

        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index) - '0');
            // Check for overflow
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
             if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            index++;
        }
        return (int) (result * sign);
    }
}