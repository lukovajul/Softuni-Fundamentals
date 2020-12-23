package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysMaxSequenceOfEqualElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }



        int bestLength = 0;
        int digit = 0; // самата цифра, която се повтаря

        int currentLength = 1; //  започва от едно, защото като имаме един елемент, това е дължина 1, после като са два става 2 и т.н.
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];
            if (currentElement==nextElement){
                currentLength++;
                if (currentLength>bestLength){
                    bestLength=currentLength; //презаписваме новата дължина
                    digit=currentElement;
                }

            }else{
                currentLength=1; //започваме от начало да броим елементите, за да видим дали има нова по-дълга поредица
            }
        }
        for (int i = 0; i<bestLength; i++){
            System.out.print(digit+ " "); //принтираме цифрата, която се повтаря bestLength пъти, т.е. колкото пъти се повтаря
        }
    }
}
