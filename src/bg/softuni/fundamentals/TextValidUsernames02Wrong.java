package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextValidUsernames02Wrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(", ");
        boolean check = false;

        for (int i = 0; i < line.length; i++) {
            if (line[i].length() > 3 && line[i].length() < 16) {
                String subString = line[i];
                for (int j = 0; j<subString.length(); j++){
                    char symbol = subString.charAt(j);
                    if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_'){
                        check =true;

                    }
                }
                    if (check){
                        System.out.println(subString);
                    }

            }

        }
    }
}

