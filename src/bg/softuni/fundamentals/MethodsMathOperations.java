package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsMathOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());


        double result = calculate(num1, input, num2);
        System.out.printf("%.0f", result);

    }

    private static double calculate(int num1, String input, int num2) {
        double result = 0.0;
       switch (input){
            case "/":
                result=num1/num2;
                break;
           case "*":
               result=num1*num2;
               break;
           case"+":
               result=num1+num2;
               break;
           case "-":
               result=num1-num2;
               break;
        }
        return result;

    }
}
