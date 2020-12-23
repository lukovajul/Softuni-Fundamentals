package bg.softuni.fundamentals;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());
        int countBelt = 0;
        double freeBelt = 0;

        for (int i =1; i<=countStudents; i++) {
            if (i % 6 == 0) {
                countBelt++;
                //freeBelt = priceBelt*countBelt;

            }
        }

        double neededEquipment = priceLightSaber*(countStudents+Math.ceil(countStudents*0.1))
                + priceRobe*countStudents + priceBelt*(countStudents-countBelt);

        if (neededEquipment<=money){
            System.out.printf("The money is enough - it would cost %.2flv.", neededEquipment);
        }else{
            double neededMoney = Math.abs(neededEquipment-money);
            System.out.printf("Ivan Cho will need %.2flv more.", neededMoney);
        }
    }

}
