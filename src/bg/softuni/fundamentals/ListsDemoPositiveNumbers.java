package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsDemoPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = parseLineOfNumbers(scanner);

       int i = 0;
       while (i<numbers.size()){
           if (numbers.get(i)<0){
               numbers.remove(i);
           }else{
               i++;
           }
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
