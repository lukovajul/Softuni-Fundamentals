package bg.softuni.fundamentals;

import java.util.*;

public class ListsRemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);
        List<Integer> nonNegativeNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (number>=0){
                nonNegativeNumbers.add(number);
            }
        }
        if (nonNegativeNumbers.isEmpty()){ // or nonNegativeNumbers.size()==0
            System.out.println("empty");
        }else {
            Collections.reverse(nonNegativeNumbers);
            for (int n : nonNegativeNumbers) {
                System.out.print(n + " ");
            }
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
