package String;

// Ques: 1108. Defanging an IP Address
// link:  https://leetcode.com/problems/defanging-an-ip-address/
public class DefangIPaddr {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int start = 0, end = 0;
        while (end < address.length()) {
            if (address.charAt(end) == '.') {
                sb.append(address, start, end);
                sb.append("[.]");
                start = end + 1;
            }
            end++;
        }
        sb.append(address, start, end);
        return sb.toString();

        // using in-built function
        // return address.replaceAll("\\.", "[.]");
    }
}