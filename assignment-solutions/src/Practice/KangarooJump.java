package Practice;

// link: https://www.hackerrank.com/challenges/kangaroo/problem?isFullScreen=true

public class KangarooJump {
    public static void main(String[] args) {
        System.out.println(kangaroo(0,2,3,5));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
       if (v1 <= v2) {
           return "NO";
       }
       if ((x2 - x1) % (v1 - v2) == 0) {
           return "YES";
       } else {
           return "NO";
       }
    }
}
