package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextRepeatString03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int count = word.length();
            for (int i = 0; i<word.length(); i++){
                result.append(word);
        }

    }
        System.out.println(result);

    }
}
