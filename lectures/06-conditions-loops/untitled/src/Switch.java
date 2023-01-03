import java.util.*;
public class Switch {
    public static void main(String[] args) {

       /*
        switch (expression) {
            case 1:
                break;
            case 2:
        }
        */

//        int n = 3;
//
//        switch (n) {
//            case 1:
//                System.out.println("This is case 1");
//                break;
//            case 2:
//                System.out.println("This is case 2");
//                break;
//            case 3:
//            System.out.println("This is case 3");
//                break;
//            default:
//                System.out.println("this is default case");
//        }

        String fruit = "Apple";

        switch (fruit) {
            case "Orange":
                System.out.println("A round fruit");
                break;
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Banana":
                System.out.println("This is banana");
                break;
            default:
                System.out.println("this is default case");
        }

        switch (fruit) {
            case "Orange" -> System.out.println("A round fruit");
            case "Apple" -> System.out.println("A red fruit");
            case "Banana" -> System.out.println("This is banana");
            default -> System.out.println("this is default case");
        }

        int day = 3;
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
