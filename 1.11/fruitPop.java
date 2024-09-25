import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fruit Pop ICS3U0 version!\n" +
                "How many points do you have?");
        int points = scanner.nextInt();
        if (points > 10) {
            System.out.print("You have Apple, ");
        }
        System.out.print("Blueberry, ");
        if (points > 2000 && points < 3000) {
            System.out.print("Coins, ");
        }
        if (points > 2000) {
            System.out.print("Extra time, ");
        }
        if (points < 400 || points > 1000) {
            System.out.print("Heart, ");
        }
        if (points > 50 && points < 2000) {
            System.out.print("Lime, ");
        }
        if (points < 1500) {
            System.out.print("Lemon, ");
        }
        if (points > 100) {
            System.out.print("Orange, ");
        }
        System.out.print("Plum, ");
        if (points > 1500) {
            System.out.print("Robot, ");
        }
    }
}
