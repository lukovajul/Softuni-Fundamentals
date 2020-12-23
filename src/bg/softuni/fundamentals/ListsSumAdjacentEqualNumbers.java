package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsSumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = parseLineOfNumbers(scanner);

        boolean searchAgain = true;
        while (searchAgain) {
            searchAgain=false; // предположи, че трябва да търсиш само веднъж
            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double next = numbers.get(i + 1);
                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    searchAgain=true;
                    break;
                }
            }
        }

        for (double number : numbers) {
            if (number%1==0) {
                System.out.print((int) number + " ");
            }else{
                System.out.print(number + " ");
            }
        }

    }

    private static List<Double> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numberAsStrings = line.split(" ");
        List<Double> numbers = new ArrayList<>();
        for (String s : numberAsStrings) {
            double number = Double.parseDouble(s);
            numbers.add(number);
        }
        return numbers;
    }
}


