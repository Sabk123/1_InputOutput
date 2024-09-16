import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Average of the class");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is student 1's mark?");
        double s1 = scanner.nextDouble();
        System.out.println("What is student 2's mark");
        double s2 = scanner.nextDouble();
        System.out.println("What is student 3's mark");
        double s3 = scanner.nextDouble();
        System.out.println("What is student 4's mark");
        double s4 = scanner.nextDouble();
        System.out.println("What is student 5's mark");
        double s5 = scanner.nextDouble();
        System.out.println("What is student 6's mark");
        double s6 = scanner.nextDouble();
        double totalMark = s1 + s2 + s3 + s4 + s5 + s6;
        double totalAverage = totalMark / 6;
        System.out.println("The average of the class is " + totalAverage);

    }
}
