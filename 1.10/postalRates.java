import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Canada Post International Letters!\n" +
                "**From anywhere... to anyone**\n" +
                "How many letters would you like?");
        int letterAmount = scanner.nextInt();
        int letterPrice = 0;
        if (letterAmount <= 9) {
            letterPrice = letterAmount * 5;
            System.out.println("Cost per letter is $5, the total cost is $" + letterPrice);
        } else if (letterAmount >= 10 && letterAmount < 20) {
            letterPrice = letterAmount * 3;
            System.out.println("The cost per letter is $3, the total cost is $" + letterPrice);
        } else if (letterAmount >= 20 && letterAmount <= 39) {
            letterPrice = letterAmount * 2;
            System.out.println("The cost per letter is $2, the total cost is $" + letterPrice);
        } else if (letterAmount >= 40) {
            letterPrice = letterAmount * 1;
            System.out.println("The cost per letter is $1, the total cost is $" + letterPrice);
        } else {
            System.out.println("Invalid statement!");
        }
    }
}
