import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: " );
        String name = in.next();
        String result = message(name);
        System.out.println(result);
    }

    static String message(String name) {
        String message = "Hello " + name;
        return message;
    }
    static void greet() {
        System.out.println("Hello world");
    }

    static String myGreet() {
        String name = "Nitin";
        return name;
    }
}
