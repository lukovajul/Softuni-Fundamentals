package bg.softuni.fundamentals;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double Threshold = 0.000001;

        double numA = Double.parseDouble(scanner.next());
        double numB = Double.parseDouble(scanner.next());

        if (Math.abs(numA-numB)<Threshold){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
