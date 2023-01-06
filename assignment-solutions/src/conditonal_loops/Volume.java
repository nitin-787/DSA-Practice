package conditonal_loops;

public class Volume {
    public static void main(String[] args) {
        System.out.println(volumeOfCone(10, 10));
    }

    static double volumeOfCone(int r, int h) {
        return 3.14 * r * r * h / 3;
    }
}
