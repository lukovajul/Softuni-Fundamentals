package bg.softuni.fundamentals;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(first)){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }

    }
}
