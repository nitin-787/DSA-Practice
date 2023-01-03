public class Switch {
    public static void main(String[] args) {

        // switch statement syntax
       /*
        switch (expression) {
            case value1:
                // code
                break;
            case value2:
                // code
                break;
            default:
                // default statements
        }
        */
        int number = 44;
        String size;

        // switch statement to check size
        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            // match the value of week
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
        }
    }
}
