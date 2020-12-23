package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsVowelsCount2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letters = scanner.next();
        System.out.println(countVowels(letters));
    }

    private static boolean isVowel (char vowels) {
        vowels = Character.toUpperCase(vowels);
        return (vowels == 'A' || vowels == 'E' || vowels == 'I' || vowels == 'U' || vowels == 'O');
    }

    private static int countVowels (String letters) {
        int count = 0;
        for (int i = 0; i < letters.length(); i++) {

            if (isVowel(letters.charAt(i))) {
                count ++;
            }
        }
        return count;
    }
}
