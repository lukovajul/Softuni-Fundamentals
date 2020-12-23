package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysMagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }


        int currentSum = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                int nextElement = numbers[j];
                currentSum = currentElement + nextElement;

                if (currentSum == n) {
                    System.out.println(currentElement + " "+ nextElement);
                }

            }

        }
    }
}

