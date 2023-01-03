public class PassingExample {
    public static void main(String[] args) {

        String name = "Nitin";
        changeName(name);
        System.out.println(name);
    }


    static void changeName(String name) {
        name = "Ram";
    }
}
