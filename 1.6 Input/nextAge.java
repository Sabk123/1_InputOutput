import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kidAge = new Scanner(System.in);
        System.out.println("Enter age of the youngest kid");
        int kid1 = kidAge.nextInt();
        Scanner kidDifference = new Scanner(System.in);
        System.out.println("Enter age for middle child");
        int kid2 = kidDifference.nextInt();
        System.out.println("Child #1 age: " + kid1);
        System.out.println("Child #2 age: " + kid2);
        int ageDiff = kid2 - kid1;
        int kid3 = ageDiff + kid2;
        System.out.println("The oldest child is " + kid3);

    }
}
