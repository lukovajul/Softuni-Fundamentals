package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsHouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+", 2); //сплитва листа на 2 елемента, в случая първи елемент ще остане само името на госта
            String name = tokens[0];
            if ("is going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    list.add(name);
                }
            } else if ("is not going!".equals(tokens[1])) {
                if (list.contains(name)) {
                    list.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }

            }
        }
        for (String s : list) {
            System.out.println(s);
        }


    }

    private static List<String> readStringList(Scanner scanner) {
        List<String> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(s);
        }

        return output;
    }

    private static void printList(List<String> list) {
        for (String element : list) {
            System.out.println(element);
        }

    }
}
