package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int [] array = new int [n];

        for (int i = 0; i<array.length; i++){
            array [i] = Integer.parseInt(scanner.nextLine());
            System.out.println(array[i]);
        }
    }
}
