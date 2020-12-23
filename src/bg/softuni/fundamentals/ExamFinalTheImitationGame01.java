package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamFinalTheImitationGame01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder encryptedMessage = new StringBuilder(message);

        String command = scanner.nextLine();
        while (!"Decode".equals(command)){
            String [] instructions = command.split("\\|");
            switch (instructions[0]){
                case "Move":
                    int lettersToMove = Integer.parseInt(instructions[1]);
                        String substring = encryptedMessage.substring(0,lettersToMove);
                        encryptedMessage.replace(0, lettersToMove, "");
                        encryptedMessage.append(substring);

                    break;
                case "Insert":
                    int index = Integer.parseInt(instructions[1]);
                    String value = instructions[2];
                        encryptedMessage.insert(index, value);
                    break;
                case "ChangeAll":
                    String subst = instructions[1];
                    String replacement = instructions[2];
                        String replace = encryptedMessage.toString().replaceAll(subst, replacement);
                        encryptedMessage = new StringBuilder(replace);
                    break;

            }
            message = encryptedMessage.toString();
            command = scanner.nextLine();

        }
        System.out.println(String.format("The decrypted message is: %s", message));

    }
}
