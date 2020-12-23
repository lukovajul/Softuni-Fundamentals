package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class ListsPrintReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        int number = scanner.nextInt();
        while (number!=0){
            numbers.add(number);
            number=scanner.nextInt();
        }

        for (int i = numbers.size()-1; i>=0; i--){ //за да принтираме числата от списъка в обратен ред
            System.out.print(numbers.get(i)+" ");
        }
    }
}
