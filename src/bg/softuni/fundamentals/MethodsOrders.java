package bg.softuni.fundamentals;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (product){
            case "coffee":
                price = 1.50;
                getTotalPrice(quantity, price);
                break;
            case "water":
                price=1.00;
                getTotalPrice(quantity,price);
                break;
            case "coke":
                price=1.40;
                getTotalPrice(quantity,price);
                break;
            case "snacks":
                price=2.00;
                getTotalPrice(quantity,price);
                break;

        }

        System.out.printf("%.2f",getTotalPrice(quantity,price));
        //System.out.println(new DecimalFormat("#.##").format(getTotalPrice(quantity,price)));
    }

    private static double getTotalPrice(int quantity, double price) {
        double result = quantity*price;
        return result;
    }
}
