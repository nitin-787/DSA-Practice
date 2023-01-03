public class Loops {
    public static void main(String[] args) {
        System.out.println();
        /*
        syntax of for loops:
        for (initialization; conditions; increment/decrement) {
            // body
        }

         */

        // Print numbers from 1 to 5
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
        }

        // while loops:
        /* syntax :
        while (condition) {
            // body
        }
        */

        // int num = 1;
        // while (num < 10) {
        //    System.out.println(num);
        //    num++;
        // }

        // do while
        /*
        int n = 1
        do {
            // body
            n++;
        } while (condition);
         */

//        int i = 1;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i <= 10);

        // ternary operator syntax
//        (a) ? true : false;
//        boolean a = true;
        int b = 10, a = 11;
        System.out.println((b == a) ? "true" : "false");

    }
}
