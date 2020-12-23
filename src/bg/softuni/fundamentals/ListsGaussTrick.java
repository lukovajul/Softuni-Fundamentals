package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsGaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);
        int size = numbers.size();
        for (int i = 0; i<size/2; i++){
            numbers.set(i, numbers.get(i) + numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);
        }

        for (int number : numbers){
            System.out.print(number + " ");
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
