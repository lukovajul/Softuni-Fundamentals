package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsFactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = factorial(num1)/factorial(num2);

        System.out.printf("%.2f", result);

    }

    private static double factorial(int n) {
        if (n == 0) {
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
}
