package bg.softuni.fundamentals;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class ExamFinalTheImitationGame02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();

        while (!"Decode".equals(command)) {
            String [] operations = command.split("\\|");
            switch (operations[0]){
                case "Move":
                    int n = Integer.parseInt(operations[1]);
                    for (int i = 0; i<n; i++){
                        input.append(input.charAt(0));
                        input.deleteCharAt(0);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(operations[1]);
                    String value = operations[2];
                    input.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = operations[1];
                    String replacement = operations[2];
                        String replace = input.toString().replace(substring, replacement);
                        input = new StringBuilder(replace);
                    break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s",input);
    }
}
