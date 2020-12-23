package bg.softuni.fundamentals;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = new StringBuffer(username).reverse().toString();
        String input = scanner.nextLine();
        int count = 0;

        while (!input.equals(password)){
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
            count++;
            //if (input.equals(password)){
              //  System.out.printf("User %s logged in.", username);
              //  break;
          //  }
            if (count>=3 && !input.equals(password)){
                System.out.printf("User %s blocked!", username);
                break;
            }
        }
        if (input.equals(password)) {
            System.out.printf("User %s logged in.", username);
        }


    }
}
