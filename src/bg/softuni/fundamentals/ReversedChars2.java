package bg.softuni.fundamentals;

import java.util.Scanner;

public class ReversedChars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0); //от някакъв стринг на първия ред прочети първата буква/символ
        char second = scanner.nextLine().charAt(0); //от някакъв стринг на втория ред прочети първата буква/символ
        char third = scanner.nextLine().charAt(0); //от някакъв стринг на третия ред прочети първата буква/символ

        System.out.print(third + " " + second + " " + first);
    }
}
