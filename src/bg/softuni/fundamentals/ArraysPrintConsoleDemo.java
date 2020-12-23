package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysPrintConsoleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] arr = {"one", "two"};

        for (int i = 0; i<arr.length; i++){
           System.out.printf("arr[%d] = %s%n", i, arr[i]);
            // System.out.println(arr[i]);
        }
    }
}
