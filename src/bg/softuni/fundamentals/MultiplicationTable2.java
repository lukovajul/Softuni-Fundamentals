package bg.softuni.fundamentals;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int times = 10;

        for (int i = multiplier; i<=times; i++){
            int product = i*input;
            System.out.printf("%d X %d = %d%n", input, i, product );

        }
        if (multiplier>10){
            int output = input*multiplier;
            System.out.printf("%d X %d = %d%n",input, multiplier, output);
        }
    }
}
