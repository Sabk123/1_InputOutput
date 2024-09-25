import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        int firstNum = scanner.nextInt();
        System.out.println("What is the second number?");
        int secondNum = scanner.nextInt();
        System.out.println("What is the third number?");
        int thirdNum = scanner.nextInt();

        if (firstNum <= secondNum && firstNum <= thirdNum) {
            if (secondNum <= thirdNum) {
                System.out.println("In sorted order, they are: " + firstNum + "," + secondNum + "," + thirdNum);
            } else {
                System.out.println("In sorted order, they are: " + firstNum + "," + thirdNum + "," + secondNum);
            }
        } else if (secondNum <= firstNum && secondNum <= thirdNum) {
            if (firstNum <= thirdNum) {
                System.out.println("In sorted order, they are: " + secondNum + "," + firstNum + "," + thirdNum);
            } else {
                System.out.println("In sorted order, they are: " + secondNum + "," + thirdNum + "," + firstNum);
            }
        } else if (thirdNum <= firstNum && thirdNum <= secondNum) {
            if (firstNum <= secondNum) {
                System.out.println("In sorted order, they are: " + thirdNum + "," + firstNum + "," + secondNum);
            } else {
                System.out.println("In sorted order, they are: " + thirdNum + "," + secondNum + "," + firstNum);
            }
        }
    }
}
