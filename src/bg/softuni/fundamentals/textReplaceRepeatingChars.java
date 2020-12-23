package bg.softuni.fundamentals;

import java.util.Scanner;

public class textReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char base = input.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(base);

        for (int i = 0; i<input.length(); i++){
            char currentChar = input.charAt(i);
            if (currentChar!=base){
                sb.append(currentChar);
                base = currentChar;
            }
        }
        System.out.println(sb);
    }
}
