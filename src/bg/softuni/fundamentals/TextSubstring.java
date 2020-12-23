package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String text = scanner.nextLine();
        String result = text;

        int nextWordIndex = result.indexOf(word, 0); //в думата, тръгвайки от нулев индекс нататък
        while (nextWordIndex!=-1) {
            int currentIndex = 0;

            List<String> substring = new ArrayList<>();

            while (nextWordIndex != -1) {
                substring.add(result.substring(currentIndex, nextWordIndex));
                currentIndex = nextWordIndex + word.length(); //местим currentIndex на позиция първата буква след премахване на търсената дума за махане word.length()
                nextWordIndex = result.indexOf(word, currentIndex); //текста намери индекса на думата от текущия нататък, за да придвижим цикъла
            }
            substring.add(result.substring(currentIndex));
            result = String.join("", substring);
            nextWordIndex = result.indexOf(word, 0);

        }
        System.out.println(result);
        }
}
