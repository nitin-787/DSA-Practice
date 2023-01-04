package First_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        greet(name);
    }

    static void greet(String name) {
        System.out.println("Good morning " + name);
    }
}
