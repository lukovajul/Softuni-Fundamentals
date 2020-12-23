package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //int x = getMax(17,42);
        //int y = getMax(69,12);

        //System.out.println(x+y);

        //int sum = getSum(69, 42);
        //System.out.println(sum);

        int [] firstArray = readArray();

        for (int number : firstArray) {
            System.out.print(number + " ");
        }


    }

    private static int[] readArray() {
        return new int [0];
    }


    private static int getMax(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;

    }

    static int getSum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    static void printSum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    //static String readFullName(String scanner){
    //String firstName = scanner.nextLine();
    // String lastName = scanner.nextLine();
    // return firstName + " " + lastName;
}



