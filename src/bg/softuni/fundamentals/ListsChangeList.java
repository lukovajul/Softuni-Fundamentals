package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readIntList(scanner);
        String input = scanner.nextLine();

        while (!"end".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            Integer element = Integer.valueOf(tokens[1]); //Integer отпред се слага вместо int, когато искаме да премахнем елемента по стойност, не по индекс
            if ("Delete".equals(command)){
                while (numbers.contains(element)){
                    numbers.remove(element);
                }

            }else if ("Insert".equals(command)){
                int position = Integer.parseInt(tokens[2]);
                if (position>=0 && position<numbers.size()){ // валидираме входа, не може да работи на несъществуващ индекс в листа
                    numbers.add(position,element);
                }
            }
            input=scanner.nextLine();
        }

        printList(numbers);
    }
    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }

        return output;
    }

    private static void printList(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }

    }
}
