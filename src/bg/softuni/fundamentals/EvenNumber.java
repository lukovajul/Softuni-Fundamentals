package bg.softuni.fundamentals;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        while (true){
            if (input % 2 != 0) {
                System.out.println("Please write an even number.");
                input = Integer.parseInt(scanner.nextLine());
            }
            if (input % 2 == 0) {
                System.out.printf("The number is: %d", Math.abs(input));
                break;
            }
        }
    }
}
