package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(", ");

        for (String name : names) {
            if (isValid(name)){
                System.out.println(name);
            }

        }

        }

    private static boolean isValid(String name) {
        if (name.length()<3 || name.length()>16){ //обратните стойности на исканите в задачата
            return false;
        }
        for (int i = 0; i<name.length(); i++){
            char symbol = name.charAt(i);
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){ //пак обратните стойности на исканите в задачата
                return false;
            }
        }
        return true; //горните проверки са false, за да мине през всички символи и ако отговаря на условията, целия метод връща true

    }
}

