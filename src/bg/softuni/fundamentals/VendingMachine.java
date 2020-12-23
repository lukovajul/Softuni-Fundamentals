package bg.softuni.fundamentals;

import java.io.OutputStream;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumCoins = 0;
        double priceProduct = 0;


        while (!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins==0.1 || coins==0.2 || coins == 0.5 || coins == 1 || coins == 2){
                sumCoins+=coins;
            }else{
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input=scanner.nextLine();

            if (input.equals("Start")){
                break;
            }
        }
        input=scanner.nextLine();
        while (!input.equals("End")){
            //input=scanner.nextLine();
            if (input.equals("Nuts")){
                priceProduct=2.0;
                if (sumCoins>=priceProduct) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins-=priceProduct;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (input.equals("Water")){
                priceProduct=0.7;
                if (sumCoins>=priceProduct) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins-=priceProduct;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (input.equals("Crisps")){
                priceProduct=1.5;
                if (sumCoins>=priceProduct) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins-=priceProduct;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (input.equals("Soda")){
                priceProduct=0.8;
                if (sumCoins>=priceProduct) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins-=priceProduct;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else if (input.equals("Coke")){
                priceProduct=1.0;
                if (sumCoins>=priceProduct) {
                    System.out.printf("Purchased %s%n", input);
                    sumCoins-=priceProduct;
                }else{
                    System.out.println("Sorry, not enough money");
                }
            }else{
                System.out.println("Invalid product");
            }
            input=scanner.nextLine();

            if (input.equals("End")){
                break;
            }

        }
        System.out.printf("Change: %.2f", sumCoins);


    }
}
