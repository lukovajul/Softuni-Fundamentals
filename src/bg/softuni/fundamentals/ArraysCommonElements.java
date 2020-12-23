package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysCommonElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String  [] firstArray = scanner.nextLine().split(" ");
        String [] secondArray = scanner.nextLine().split(" ");

        // тъй като не променяме стойности в масивите, а само ги четем, ползваме foreach цикъл вместо for

        for (String elementOne : secondArray){
            for (String elementTwo : firstArray){
                if (elementTwo.equals(elementOne)) {
                    System.out.print(elementTwo+" ");
                }
            }
        }

    }
}
