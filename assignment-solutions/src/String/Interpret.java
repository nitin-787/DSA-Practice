package String;

// ques : 1678. Goal Parser Interpretation
// link: https://leetcode.com/problems/goal-parser-interpretation/
public class Interpret {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                sb.append('o');
                i += 2;
            } else if (command.charAt(i) == '(' && command.startsWith("(al)", i)) {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }

}
