import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Bowl #1 Weight:");
        int bowl1 = scanner.nextInt();
        System.out.println("Enter Bowl #2 Weight:");
        int bowl2 = scanner.nextInt();
        System.out.println("Enter Bowl #3 Weight:");
        int bowl3 = scanner.nextInt();
        if ((bowl1 > bowl2 && bowl1 < bowl3) || (bowl1 < bowl2 && bowl1 > bowl3)) { // bowl 1 is middle in this context
            System.out.println("The middle bowl weight is " + bowl1);
        } else if ((bowl2 > bowl1 && bowl2 < bowl3) || (bowl2 < bowl1 && bowl2 > bowl3)) { // bowl 2 is middle in this context
            System.out.println("The middle bowl weight is " + bowl2);
        } else { // since bowl 1 and 2 aren't middle, the next logical solution would be that bowl3 is middle
            System.out.println("The middle bowl weight is " + bowl3);

        }
    }
}
