package bg.softuni.fundamentals;

import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++){
            char current = scanner.nextLine().charAt(0);

            System.out.printf("%c", current+key);
        }
    }
}
