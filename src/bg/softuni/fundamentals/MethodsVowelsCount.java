package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsVowelsCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(countVowels(input));
    }

    private static int countVowels(String input) {
        String[] text = input.split("");
        int counter = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("a") || text[i].equals("A")) {
                counter++;
            } else if (text[i].equals("e") || text[i].equals("E")) {
                counter++;
            } else if (text[i].equals("o") || text[i].equals("O")) {
                counter++;
            } else if (text[i].equals("u") || text[i].equals("U")) {
                counter++;
            } else if (text[i].equals("i") || text[i].equals("I")) {
                counter++;
            } else if (text[i].equals("y") || text[i].equals("Y")) {
                counter++;
            }
        }
        return counter;
    }
}
