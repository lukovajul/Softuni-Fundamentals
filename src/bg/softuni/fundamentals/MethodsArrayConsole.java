package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsArrayConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArray = readArray(scanner); //scanner идва като параметър отвън за да могат да се четат други стойности от конзолата, които са въведени в последствие
        int [] secondArray = readArray(scanner);

       printArray(firstArray);
       printArray(secondArray);
    }

    static void printArray (int [] array){
        for (int number: array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static int[] readArray(Scanner scanner) {
        String line = scanner.nextLine();
        String [] numbersAsString = line.split(" ");
        int [] array = new int [numbersAsString.length];
        for (int i = 0; i<array.length; i++){
            array[i] = Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
}
