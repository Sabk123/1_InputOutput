import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the month");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();

        if (month.equalsIgnoreCase("September") || (month.equalsIgnoreCase("April") || (month.equalsIgnoreCase("June") || (month.equalsIgnoreCase("November"))))) {
            System.out.println("The month has 30 days");
            // I used equalsIgnoreCase to make it not case-sensitive, so "SEPTEMBER and september" will work in comparison to just using month.equals
        } else if (month.equalsIgnoreCase("January") || (month.equalsIgnoreCase("March") || (month.equalsIgnoreCase("May") || (month.equalsIgnoreCase("July") || (month.equalsIgnoreCase("August") || (month.equalsIgnoreCase("October") || (month.equalsIgnoreCase("December")))))))) {
            System.out.println("This month has 31 days");
        } else if (month.equalsIgnoreCase("February")) {
            System.out.println("This month has 28 days!");
        } else {
            System.out.println("Invalid input!");
        }

        System.out.println("Enter a number for the day of each month");
        int day = scanner.nextInt();
        if (day == 1) {
            System.out.println("The day is Monday");
        } else if (day == 2) {
            System.out.println("The day is Tuesday");
        } else if (day == 3) {
            System.out.println("The day is Wednesday");
        } else if (day == 4) {
            System.out.println("The day is Thursday");
        } else if (day == 5) {
            System.out.println("The day is Friday");
        } else if (day == 6) {
            System.out.println("The day is Saturday!");
        } else if (day == 7) {
            System.out.println("The day is Sunday!");
        } else {
            System.out.println("Invalid input!");
        }
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        boolean leapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                }
            } else {
                leapYear = true;
            }
        }
        String leapYearFinal = null;
        if (leapYear == true) {
            leapYearFinal = "This year is a leap year!";
        } else {
            leapYearFinal = "This year is not a leap year";
        }
        System.out.println(leapYearFinal);
    }

}
