package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // четене на n брой неща от конзолата и запазването им в паметта на програмата/
        int [] numbers = new int [n]; //масивът заема n int променливи; съдържа n * 4 байта информация /1 инт е 4 байта/

        //по-кратък вариант с for цикъл:

        for (int i = 0; i<numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]);
        }


        numbers[0] = scanner.nextInt(); //на numbers на позиция нулева запиши първото нещо, което прочетеш от конзолата
        numbers[1] = scanner.nextInt();// на позиция 1 прочети следващото нещо от конзолата
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();

        //така декларираме само 1 променлива и така на отделен ред изпечатваме нейните позиции

        System.out.println(numbers[4]);
        System.out.println(numbers[3]);
        System.out.println(numbers[2]);
        System.out.println(numbers[1]);
        System.out.println(numbers[0]);


        String name = "George";
        char [] nameArray = name.toCharArray(); // съдържа стойностите на стринга

    }
}
