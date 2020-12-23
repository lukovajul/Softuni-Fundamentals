package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsSumAdjacentEqualNumbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = parseLineOfNumbers(scanner);

        int i = 0;
        while (i<numbers.size()-1) {
                double current = numbers.get(i);
                double next = numbers.get(i + 1);
                if (current == next) {
                    numbers.remove(i);
                    numbers.set(i, current + next);
                    i=0;
            }else {
                    i++;
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


