package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsCharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first<second){
            printSymbolsInRange(first, second);
        }else{
            printSymbolsInRange(second,first);
        }


    }

    private static void printSymbolsInRange(char first, char second) {
        for (char i = ++first; i < second; i++) { //++first e ravno na first+1, prosto inache ne raboti
            System.out.printf("%c ", i);
        }
    }
}
