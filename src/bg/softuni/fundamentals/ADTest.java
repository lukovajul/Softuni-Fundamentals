package bg.softuni.fundamentals;

import java.util.Scanner;

public class ADTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int m = (n%10)%2;
        System.out.println(m);

        int counter = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 1) {
                counter++;
            }
            n /= 10;

        }
    }
}
