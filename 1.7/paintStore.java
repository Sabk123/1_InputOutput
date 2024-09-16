import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the paint store!");
        System.out.println("What is the width of the wall in m?");
        Scanner scanner = new Scanner(System.in);
        double widthWall = scanner.nextDouble();
        System.out.println("What is the height of the wall in m?");
        double heightWall = scanner.nextDouble();
        double surfaceArea = widthWall * heightWall;
        System.out.println("The surface area you want painted is " + surfaceArea);
        double cansPaint = surfaceArea / 4;
        System.out.println("Cans of paint you need is " + cansPaint);
        double price = cansPaint * 17.50;
        System.out.println("Sub-total is " + price);
        double tax = price * 0.13;
        System.out.println("The tax amount is " + tax);
        double total = tax + price;
        System.out.println("The total is " + total);

    }
}
