package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsPrintingTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLineLength = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxLineLength; i++) {
            printNumbersIncreasing(i);
        }

        for (int i = maxLineLength - 1; i >= 1; i--) {
            printNumbersIncreasing(i);
        }

    }

    static void printNumbersIncreasing(int maxNumber) {
        for (int i = 1; i<=maxNumber; i++){
            System.out.print(i);
            if (i<maxNumber){ //за да няма спейс зад последното принтирано число
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
