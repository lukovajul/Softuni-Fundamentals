package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextDigitLettersOthers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                System.out.print(text.charAt(i));
            }
        }
        System.out.println();
           for (int j = 0; j < text.length(); j++) {
               if (Character.isLetter(text.charAt(j))) {
                   System.out.print(text.charAt(j));
               }
           }
        System.out.println();
        for (int k = 0; k < text.length(); k++) {
            if (!Character.isLetterOrDigit(text.charAt(k))) {
                System.out.print(text.charAt(k));
            }
        }
    }
}
