package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsMultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = getMultipleOfEvensAndOdds(input);
        System.out.println(result);

    }
    static int getMultipleOfEvensAndOdds (int number){
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);

        return evenSum*oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        int current = 0;
        while (number!=0){
            current=number%10;
            if (current%2==0){
                evenSum+=current;
            }
            number=number/10;
        }

        return evenSum;
    }


    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        int current = 0;
        while (number!=0){
            current=number%10;
            if (current%2!=0){
            oddSum+=current;
            }
            number=number/10;
        }
        return oddSum;
    }


}
