package bg.softuni.fundamentals;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = new StringBuffer(input).reverse().toString();

        System.out.println(output);

    }
}
