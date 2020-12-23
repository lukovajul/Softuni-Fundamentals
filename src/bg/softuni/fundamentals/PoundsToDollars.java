package bg.softuni.fundamentals;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {

        //double pounds = new Scanner(System.in).nextDouble();
        int cents = new Scanner(System.in).nextInt();
        double convertedCents = cents*131;
        int wholeDollars = (int) (convertedCents/100);
        int wholeCents = (int) (convertedCents%100);

        System.out.printf("%03d.%03d",wholeDollars, wholeCents);

    }
}
