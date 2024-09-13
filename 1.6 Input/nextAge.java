import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kidAge = new Scanner(System.in);
        System.out.println("Enter age of first kid");
        int kid1 = kidAge.nextInt();
        Scanner kidDifference = new Scanner(System.in);
        System.out.println("Enter age differences between the kids");
        int ageDifference = kidDifference.nextInt();
        System.out.println("Child one is " + kid1);
        int kid2 = kid1 + ageDifference;
        System.out.println("Child two is " + kid2);
        int kid3 = kid2 + ageDifference;
        System.out.println("Child three is " + kid3);

    }
}
