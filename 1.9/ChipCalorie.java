import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Chip's fast food emporium!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are the three burger choices:\n" +
                "1 – Cheeseburger (461 Calories)\n" +
                "2 – Fish Burger (431 Calories)\n" +
                "3 – Veggie Burger (420 Calories)\n" +
                "4 – no burger");
        System.out.println("Please enter a burger choice");
        int burger = scanner.nextInt();
        int burgerCalorie = 0;
        if (burger == 1) {
            burgerCalorie = 461;
        } else if (burger == 2) {
            burgerCalorie = 431;

        } else if (burger == 3) {
            burgerCalorie = 420;
        } else {
            System.out.println("No burger selected!");
        }
        System.out.println("Here are the three side order choices:\n" +
                "1 – Fries (100 Calories)\n" +
                "2 – Baked Potato (57 Calories)\n" +
                "3 – Chef Salad (70 Calories)\n" +
                "4 – no side order");
        int side = scanner.nextInt();
        int sideCalorie = 0;
        if (side == 1) {
            sideCalorie = 100;
        } else if (side == 2) {
            sideCalorie = 57;

        } else if (side == 3) {
            sideCalorie = 70;
        } else {
            System.out.println("No side selected!");
        }
        System.out.println("Here are the three drink choices:\n" +
                "1 – Soft Drink ( 130 Calories)\n" +
                "2 – Orange Juice (160 Calories)\n" +
                "3 – Milk (118 Calories)\n" +
                "4 – no drink");
        int drink = scanner.nextInt();
        int drinkCalorie = 0;
        if (drink == 1) {
            drinkCalorie = 130;
        } else if (drink == 2) {
            drinkCalorie = 160;

        } else if (drink == 3) {
            drinkCalorie = 118;
        } else {
            System.out.println("No drink selected!");
        }
        System.out.println("Here are the three dessert choices:\n" +
                "1 – Apple Pie (167 Calories)\n" +
                "2 – Sundae (266 Calories)\n" +
                "3 – Fruit Cup (75 Calories)\n" +
                "4 – no dessert");
        int dessert = scanner.nextInt();
        int dessertCalorie = 0;
        if (dessert == 1) {
            dessertCalorie = 167;
        } else if (dessert == 2) {
            dessertCalorie = 266;

        } else if (dessert == 3) {
            dessertCalorie = 75;
        } else {
            System.out.println("No dessert selected!");
        }
        int totalCalories = burgerCalorie + sideCalorie + drinkCalorie + dessertCalorie;
        System.out.println("The total calories for your meal is " + totalCalories);
    }
}
