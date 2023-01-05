package conditonal_loops;

// this file contains all the assignment solution related "area",
// I cross checked all of the formulas from google...
public class Perimeter {
    public static void main(String[] args) {
//        System.out.println(perimeterOfCircle(10));
//        System.out.println(perimeterOfRectangle(10, 20));
//        System.out.println(perimeterOfEquilateralTriangle(10));
//        System.out.println(perimeterOfParallelogram(10, 20));
//        System.out.println(perimeterOfSquare(20));
        System.out.println(perimeterOfRhombus(20));
    }

    static double perimeterOfCircle(int r) {
        return 2 * 3.14 * r;
    }

    static double perimeterOfRectangle(int l, int w) {
        return 2 * (l + w);
    }

    static double perimeterOfEquilateralTriangle(int a) {
        return 3 * a;
    }

    static double perimeterOfParallelogram(int a, int b) {
        return 2 * (a + b);
    }

    static double perimeterOfSquare(int a) {
        return 4 * a;
    }

    static double perimeterOfRhombus(int a) {
        return 4 * a;
    }
}
