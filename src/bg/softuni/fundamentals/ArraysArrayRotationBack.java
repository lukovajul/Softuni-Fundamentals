package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysArrayRotationBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n%input.length; i++){  //i<n%input.length
            String temp = input[input.length-1];
            for (int j = 0; j<input.length-1; j++){
                input[j] = input[j+1];
            }
            input [0] = temp;
        }
        System.out.println(String.join(" ", input));



    }
}
