package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysTopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

            for (int i = 0; i < arr.length; i++) {
                boolean isBigger = true;  // инициализацията на булевата променлива се прави при всяко излизане от вътрешния цикъл за сравнение
                for (int j = i+1; j<arr.length; j++){
                if (arr[i] <= arr[j]) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.print(arr[i] + " ");
            }

        }


    }
}

