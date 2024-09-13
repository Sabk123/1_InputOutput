import java.util.Scanner;

public class madLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter a building type: ");
        String building = scanner.nextLine();

        System.out.print("Enter a type of food: ");
        String food = scanner.nextLine();

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter an occupation: ");
        String occupation = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("There are a lot of " + adjective + " ways to get to school. Here's a list of the top " + number + ":");
        System.out.println("1. The " + building + " bus: Watch out for " + food + " stuck under the seats and hold onto your hardcover " + noun + "s in case the driver has to " + verb + " the brakes.");
        System.out.println("2. Bicycle: Check the weather, because it's " + adjective + " to hold an umbrella while " + verb + "ing.");
        System.out.println("3. Walk: Don't stop to " + verb + " every " + animal + " along the way or you'll be " + adjective + " for school!");
        System.out.println("4. Skate-" + noun + ": Cool, but if the " + occupation + " catches you doing jumps off at the school's front " + noun + "s, you're getting detention!");

        scanner.close();
    }
}
