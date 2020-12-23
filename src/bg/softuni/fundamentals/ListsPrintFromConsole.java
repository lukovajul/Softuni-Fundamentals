package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsPrintFromConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i<n; i++){ //чете числата до n и ги налива в списъка
            int number = scanner.nextInt();
            numbers.add(number);
        }

        for (int number : numbers){
            System.out.print(number + " ");
        }
    }
}
