package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextCaesarCipher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<input.length(); i++){
            char symbol = input.charAt(i);
            sb.append((char)(symbol+3)); //кастваме към char, защото иначе взема аски стойността и към нея долепя 3
            //(symbol+3) също се огражда в скоби, защото трябва да се кастне целия израз, а не само символа
        }

        System.out.println(sb.toString());
    }
}
