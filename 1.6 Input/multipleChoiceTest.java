import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Where did Ms. Gorski go in the summer? ");
        System.out.println("(a) Scotland ");
        System.out.println("(b) Mexico ");
        System.out.println("(c) Japan ");
        System.out.println("(d) Glen Haffy ");
        System.out.print("a/b/c/d? ");
        String wherego = input.nextLine();
        System.out.println("You answered: " + wherego);
        System.out.println("The correct answer was (d) Glen Haffy. Pretty trees.");
        System.out.println("");
    }
}
