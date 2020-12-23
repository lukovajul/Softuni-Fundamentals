package bg.softuni.fundamentals;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ExamFinalSecretChat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!"Reveal".equals(command)){
            String [] tokens = command.split(":\\|:");
            String operation = tokens[0];

            switch (operation){
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    input.replace(index, index, " ");
                    System.out.println(input);
                    break;
                case "Reverse":
                    String substringReverse = tokens[1];
                   if (input.toString().contains(substringReverse)){
                        String temp = input.toString().replaceFirst(Pattern.quote(substringReverse), "").concat(new StringBuilder(substringReverse).reverse().toString());
                        input = new StringBuilder(temp);
                       System.out.println(input);
                   }else{
                       System.out.println("error");
                   }
                    break;
                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    String replace = input.toString().replace(substring, replacement);
                    input = new StringBuilder(replace);
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine();

        }
        System.out.println(String.format("You have a new text message: %s", input));
    }
}
