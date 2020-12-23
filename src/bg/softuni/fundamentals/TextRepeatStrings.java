package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextRepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        for (int i = 0; i<words.length; i++){
            String r = repeat(words[i], words[i].length());
            System.out.print(r);
        }

    }

    private static String repeat(String word, int count) {
        String[] repeatArr = new String[count]; // масивът, в който ще повтарям, е толкова голям, колкото бройката повторения
       for (int i = 0; i<count; i++){
           repeatArr[i] = word;
       }
        return String.join("", repeatArr);
    }
}
