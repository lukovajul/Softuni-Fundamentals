package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextProcessingDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String s = new String(new char[]{'H', 'i'}); равно е на долния израз
        //String  a = scanner.nextLine();
        //String b = scanner.nextLine();
        //System.out.println(a.equals(b));

        List<Character> lettersList = new ArrayList<>();
        String line = scanner.nextLine();
        while (!line.equals("end")){
            lettersList.add(line.charAt(0));

            line = scanner.nextLine();
        }

        char[] lettersArray = getCharArray(lettersList);
        String output = new String(lettersArray);
        System.out.println(output.toUpperCase());


    }

    private static char[] getCharArray(List<Character> lettersList) {
        char [] lettersArray = new char[lettersList.size()]; // pravim masiv ot char ot lista sus stringove
        for (int i = 0; i<lettersArray.length; i++){
            lettersArray[i] =lettersList.get(i);
        }
        return lettersArray;
    }
}
