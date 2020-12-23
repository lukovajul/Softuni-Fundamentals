package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scanner);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Contains":
                    int index = Integer.parseInt(tokens[1]);
                    numbers.contains(index);
                    if (numbers.contains(index)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String command2 = tokens[1];
                    if (command2.equals("even")) {
                        for (Integer num : numbers) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }
                        System.out.println();
                        break;
                    } else if (command2.equals("odd")) {
                        for (Integer num : numbers) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    String command3 = tokens[1];
                    int sum = 0;
                    if (command3.equals("sum")) {
                        for (Integer num : numbers) {
                            sum += num;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    String filter = tokens[1];
                    int num = Integer.parseInt(tokens[2]);
                    if (filter.equals("<")) {
                        for (Integer num1 : numbers) {
                            if (num1 < num) {
                                System.out.print(num1 + " ");
                            }
                        }
                        System.out.println();
                        break;
                    } else if (filter.equals(">")) {
                        for (Integer num1 : numbers) {
                            if (num1 > num) {
                                System.out.print(num1 + " ");
                            }
                        }
                        System.out.println();
                        break;
                    } else if (filter.equals(">=")) {
                        for (Integer num1 : numbers) {
                            if (num1 >= num) {
                                System.out.print(num1 + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }else if (filter.equals("<=")){
                        for (Integer num1 : numbers) {
                            if (num1 <= num) {
                                System.out.print(num1 + " ");
                            }
                        }
                        System.out.println();
                        break;
                    }
            }
            input = scanner.nextLine();
        }


        //for (Integer number : numbers) {
           // System.out.print(number+ " ");
       // }

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

