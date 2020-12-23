package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsMiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);

    }

    private static void printMiddleCharacter(String input) {
        for (int i = 0; i<input.length(); i++){
            char middleChar = input.charAt(input.length()/2);
            if (input.length()%2!=0){
                System.out.println(middleChar);
                break;
            }else{
                char previousChar = input.charAt(input.length()/2-1);
                System.out.print(previousChar);
                System.out.print(middleChar);
                break;
            }

        }

    }
}
