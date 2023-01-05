package conditonal_loops;

// this file contains all the assignment solution related "area",
// I cross checked all of the formulas from google...
public class Area {
    public static void main(String[] args) {
//        System.out.println(areaOfCircle(10));
//        System.out.println(areaOfTriangle(10, 5));
//        System.out.println(areaOfRectangle(10,3));
//        System.out.println(areaOfParallelogram(10,3));
//        System.out.println(areaOfRhombus(10,3));
        System.out.println(areaOfEquilateralTriangle(9));
    }

    static double areaOfCircle(int r) {
        return 3.14 * r * r;
    }

    static double areaOfTriangle(int h, int b) {
        return (b * h) / 2;
    }

    static double areaOfRectangle(int w, int l) {
        return (w * l);
    }

    static double areaOfParallelogram(int h, int b) {
        return b * h;
    }

    static double areaOfRhombus(int p, int q) {
        return (p * q) / 2;
    }

    static double areaOfEquilateralTriangle(int a) {
        return (Math.sqrt(3) / 4 ) * a * a;
    }
}
