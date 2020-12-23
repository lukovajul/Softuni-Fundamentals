package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamFinalPasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!"Done".equals(input)){
            String [] commands = input.split("\\s+");
            switch (commands[0]){
                case "TakeOdd":
                    StringBuilder newPassword = new StringBuilder();
                    for (int i = 1; i<password.length(); i+=2){
                        newPassword.append(password.charAt(i));
                    }
                    password = newPassword;
                   System.out.println(password);
                    break;
                case "Cut":
                    int start = Integer.parseInt(commands[1]);
                    int end = start + Integer.parseInt(commands[2]);
                    password.delete(start, end);
                    System.out.println(password);
                    break;
                case "Substitute":
                    String substring = commands[1];
                    String substitute = commands[2];
                    if (password.toString().contains(substring)){
                        password= new StringBuilder(password.toString().replace(substring,substitute));
                        System.out.println(password);
                    }else{
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            input= scanner.nextLine();
        }


        System.out.println(String.format("Your password is: %s", password));
    }
}
