package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysReverseAnArrayOfIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// задача за разместване на числата вътре в масива

        int n = scanner.nextInt();
        int [] numbers = new int [n];

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = scanner.nextInt();
        }

        int [] numbersReversed = new int [numbers.length];
        for (int i = 0; i<numbersReversed.length; i++){
            numbersReversed[i] = numbers[numbers.length-1-i];
        }

        for (int i = 0; i<numbersReversed.length; i++){
            System.out.print(numbersReversed[i]+ " ");
        }


    }
}
