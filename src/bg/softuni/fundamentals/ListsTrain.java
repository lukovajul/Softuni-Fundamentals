package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = readIntList(scanner);
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] tokens = input.split(" ");
            if ("Add".equals(tokens[0])) {
                int people = Integer.parseInt(tokens[1]);
                train.add(people);
            } else {
                int peopleToAdd = Integer.parseInt(tokens[0]);
                for (int wagon = 0; wagon < train.size(); wagon++) {
                    int sum = train.get(wagon) + peopleToAdd;
                    if (sum <= maxCapacity) {
                        train.set(wagon, sum);
                        break; // за да не ги слагаме във всички вагони, а само в първия възможен
                    }
                }
            }

            input = scanner.nextLine();
        }

        printTrain(train);

    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> train = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            train.add(Integer.parseInt(s));
        }

        return train;
    }

    private static void printTrain(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }

    }
}
