import java.util.Scanner;

public class EnumExample3 {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String input = s.next().toUpperCase();

        Day day;
        try {
            day = Day.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered.");
            return;
        }

        switch (day) {
            case SUNDAY:
            case SATURDAY:
                System.out.println(day + " is best");
                break;
            case MONDAY:
                System.out.println(day + " is bad");
                break;
            default:
                System.out.println(day + " is not bad");
                break;
        }
    }
}
