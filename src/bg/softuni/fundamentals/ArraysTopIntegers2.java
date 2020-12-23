package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysTopIntegers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) { //do length-1 e, zashtoto sravniavam predposledniq element s posledniq, a ne posledniq sys neshto sled nego, koeto go niama
            if (numbers[i] > numbers[i + 1]) {
                System.out.print(numbers[i]+" ");
            }
        }
        System.out.print(numbers[numbers.length - 1]); // последният елемент виняаги ще бъде top integer, понеже след него няма нищо
        //затова се принтира и той и се намира на позиция numbers.length - 1
    }
}
