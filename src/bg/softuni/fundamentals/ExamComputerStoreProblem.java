package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamComputerStoreProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double sumWithoutTaxes = 0;
        double taxes = 0;
        double finalPriceWithTaxes = 0;

        while (!input.equals("special")&& !input.equals("regular")){
            double pricesWithoutTax = Double.parseDouble(input);
            if (pricesWithoutTax<0){
                System.out.println("Invalid price!");
            }
            if (pricesWithoutTax>0) {
                sumWithoutTaxes += pricesWithoutTax;
            }
            taxes = sumWithoutTaxes*0.2;
            finalPriceWithTaxes = sumWithoutTaxes+sumWithoutTaxes*0.2;

            input=scanner.nextLine();

        }
        if (input.equals("special")){
            finalPriceWithTaxes-=finalPriceWithTaxes*0.1;
        }
        if (finalPriceWithTaxes==0){
            System.out.println("Invalid order!");
        }else{
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n",sumWithoutTaxes);
            System.out.printf("Taxes: %.2f$%n",taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n",finalPriceWithTaxes);
        }
    }
}
