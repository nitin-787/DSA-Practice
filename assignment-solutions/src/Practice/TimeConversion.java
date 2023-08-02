package Practice;

public class TimeConversion {
    public static void main(String[] args) {
        String timeAM = "12:15:23AM";
        String timePM = "09:45:37PM";

        String militaryTimeAM = convertToMilitaryTime(timeAM);
        String militaryTimePM = convertToMilitaryTime(timePM);

        System.out.println("AM Time in military format: " + militaryTimeAM);
        System.out.println("PM Time in military format: " + militaryTimePM);
    }
    public static String convertToMilitaryTime(String time) {
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2].substring(0, 2));
        String period = timeParts[2].substring(2);

        if (period.equalsIgnoreCase("PM") && hours != 12) {
            hours += 12;
        } else if (period.equalsIgnoreCase("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

