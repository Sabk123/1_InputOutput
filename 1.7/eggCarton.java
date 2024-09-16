import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("How much eggs?");
        Scanner eggsAmount = new Scanner(System.in);
        int eggs = eggsAmount.nextInt();
        int Crate = 180;
        int Carton = 12;
        int CrateAmount = eggs / Crate;
        int CrateRemainder = eggs % Crate; // Remainder is needed for the next calculations
        System.out.println("The amount of Crates is " + CrateAmount);
        int CartonAmount = CrateRemainder / Carton;
        int CartonRemainder = CrateRemainder % Carton;
        System.out.println("Amount of Cartons is " + CartonAmount);
        int LeftoverEggs = CartonRemainder;
        System.out.println("Amount of eggs leftover98 is " + LeftoverEggs);

    }}
