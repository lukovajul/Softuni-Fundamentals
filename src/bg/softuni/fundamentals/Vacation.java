package bg.softuni.fundamentals;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        switch (dayOfWeek){
            case "Friday":
                if (type.equals("Students")){
                    price = 8.45;
                }else if (type.equals("Business")){
                    price = 10.90;
                }else if (type.equals("Regular")){
                    price=15;
                }
                break;
            case "Saturday":
                if (type.equals("Students")){
                    price = 9.80;
                }else if (type.equals("Business")){
                    price = 15.60;
                }else if (type.equals("Regular")){
                    price=20;
                }
                break;
            case "Sunday":
                if (type.equals("Students")){
                    price =10.46;
                }else if (type.equals("Business")){
                    price = 16;
                }else if (type.equals("Regular")){
                    price=22.50;
                }
                break;
        }

        double totalPrice = numberOfPeople*price;
        if (type.equals("Students") && numberOfPeople>=30){
            totalPrice-=0.15*totalPrice;
        }
        if (type.equals("Business") && numberOfPeople>=100){
            totalPrice = totalPrice-10*price;
        }
        if (type.equals("Regular")&& numberOfPeople>=10 && numberOfPeople<=20){
            totalPrice-=0.05*totalPrice;
        }

        System.out.printf("Total price: %.2f", totalPrice);

    }
}
