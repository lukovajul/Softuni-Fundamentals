package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListsListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = parseLineOfNumbers(scanner);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Add":
                    int index = Integer.parseInt(tokens[1]);
                    numbers.add(index);
                    break;
                case "Remove":
                    int index1 = Integer.parseInt(tokens[1]);
                    numbers.remove(Integer.valueOf(index1));
                    break;
                case "RemoveAt":
                    int index2 = Integer.parseInt(tokens[1]);
                    numbers.remove(index2);
                    break;
                case "Insert":
                    int num = Integer.parseInt(tokens[1]);
                    int index3 = Integer.parseInt(tokens[2]);
                    numbers.add(index3, num);
                    break;

            }
            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number+ " ");
        }

    }
    private static List<Integer> parseLineOfNumbers(Scanner scanner) {
        String line = scanner.nextLine();
        String [] numberAsStrings = line.split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String s : numberAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}
