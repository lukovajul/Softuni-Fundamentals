package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        for (int i = 0; i<strings.length/2; i++){
            String oldElement = strings[i];
            strings[i] = strings[strings.length -1 - i];
            strings[strings.length - 1 - i] = oldElement;

        }
        System.out.println(String.join(" ", strings));


    }
}
