package bg.softuni.fundamentals;

import java.util.Scanner;

public class ConcatNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        String symbol = scanner.nextLine();

        System.out.println(name1 + symbol + name2);
    }
}
