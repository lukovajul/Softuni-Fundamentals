package bg.softuni.fundamentals;

import java.util.Scanner;

public class ATest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int a = Integer.parseInt(scanner.nextLine());
        // int b = Integer.parseInt(scanner.nextLine());


        //if (a%b!=0){
        //System.out.println(a * 1.0 / b);
        //}else{
        // System.out.println(a / b);
        // }

        int number = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int current = 0;
        while (number != 0) {
            current = number % 10;
            if (current % 2 == 0) {
                evenSum += current;
            }
            number=Integer.parseInt(scanner.nextLine());
        }

        System.out.println(evenSum);
    }
}
