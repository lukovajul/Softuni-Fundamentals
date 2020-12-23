package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextSubstring02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //това решение е по-бавно от TextSubstring
        String key= scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(key)){
            text = text.replace(key, ""); // заменяме ключовата дума, която трябва да се премахне от текста с празен стринг
        }
        System.out.println(text);
    }
}
