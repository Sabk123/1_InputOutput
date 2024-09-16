import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        System.out.println("\nQuestion 1: Gym Class\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numPlayers = scanner.nextInt();
        int teams = numPlayers / 7;
        int teamsRemainer = numPlayers % 7;
        System.out.println("There will be " + teams + " Teams, and " + teamsRemainer + " players left over");
        System.out.println("\nQuestion 2: Time\n");
        System.out.println("Enter time in minutes");
        int time = scanner.nextInt();
        int timeHours = time / 60;
        int timeRemainder = time % 60;
        System.out.println("This is " + timeHours + ":" + timeRemainder);
        System.out.println("\nQuestion 3: Flower Boxes\n");
        System.out.println("How much flower pots to ship: ");
        int boxes = scanner.nextInt();
        int vbigbox = boxes / 9;
        System.out.println("We will use " + vbigbox + " very big boxes");
        int vbigboxR = boxes % 9;
        int bigBox = vbigboxR / 4;
        System.out.println("We will use " + bigBox + " big boxes");
        int bigBoxR = vbigboxR % 4;
        int smallBox = bigBoxR / 1;
        System.out.println("We will use " + smallBox + " small boxes");

    }
}
