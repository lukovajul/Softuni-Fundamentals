package bg.softuni.fundamentals;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headSetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double headsetCost = (lostGamesCount / 2) * headSetPrice;
        double mouseCost = (lostGamesCount / 3) * mousePrice;
        double keyboardCost = (lostGamesCount / 6) * keyboardPrice;
        double displayCost = (lostGamesCount / 12) * displayPrice;

        double totalCost = headsetCost + mouseCost + keyboardCost + displayCost;

        System.out.println(String.format("Rage expenses: %.2f lv.\n", totalCost));



    }
}
