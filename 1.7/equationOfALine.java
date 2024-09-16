import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first x coordinate");
        double firstX = scanner.nextDouble();
        System.out.println("Enter first y coordinate");
        double firstY = scanner.nextDouble();
        System.out.println("Enter second x coordinate");
        double secondX = scanner.nextDouble();
        System.out.println("Enter second y coordinate");
        double secondY = scanner.nextDouble();
     
        double slopeY = secondY - firstY;
        double slopeX = secondX - firstX;
        double slope = slopeY / slopeX;
        System.out.println("The slope is " + slope);
        double yIntercept = firstY - slope * firstX; // y = mx + b rearranged
        System.out.println("The y intercept is " + yIntercept);
        double distance = Math.sqrt(Math.pow(secondX - firstX, 2) + Math.pow(secondY - firstY, 2));
        System.out.println("The distance between the two points is + " + distance);


    }
}
