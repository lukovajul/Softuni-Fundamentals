package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsAddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int currentSum = sum(num1,num2);
        int totalSum = subtract(currentSum, num3);
        System.out.println(totalSum);
    }

    private static int subtract(int currentSum, int num3) {
        int result = currentSum-num3;
        return result;
    }


    private static int sum(int num1, int num2) {
        int result = num1+num2;
        return result;
    }

}
