package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysEvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] array = new int [input.length];

        for (int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(input[i]);
        }

        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] %2 ==0){
                sumEven+=array[i];
            }else{
                sumOdd+=array[i];
            }
        }
        System.out.println(sumEven-sumOdd);
    }
}
