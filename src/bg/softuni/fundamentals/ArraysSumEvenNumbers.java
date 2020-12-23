package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysSumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayAsString = scanner.nextLine();

        String [] numberAsString = arrayAsString.split(" ");
        int [] numbers = new int[numberAsString.length];

        int sum = 0;

        for (int i = 0; i<numbers.length; i++){
            numbers [i] = Integer.parseInt(numberAsString[i]);
            if (numbers[i] % 2 == 0){
                sum+=numbers[i];
            }
        }
        System.out.println(sum);




    }
}
