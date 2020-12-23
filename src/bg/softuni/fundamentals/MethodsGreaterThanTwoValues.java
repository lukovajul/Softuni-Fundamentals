package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsGreaterThanTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
               int resultInt=getMax(firstNum,secondNum);
                System.out.println(resultInt);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char resultChar = getMax(firstChar,secondChar);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString = getMax(firstString, secondString);
                System.out.println(resultString);
                break;
        }


    }

    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString)>=0){
            return firstString;
        }
        return secondString;
    }

    private static int getMax(int num1, int num2) {
        if (num1>num2){
            return num1;
        }
        return num2;
    }

    private static char getMax(char first, char second) {
        if (first>second){
            return first;
        }
        return second;
    }
}
