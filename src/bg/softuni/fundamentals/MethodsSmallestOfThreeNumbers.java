package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsSmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printSmallest(num1, num2, num3);
    }

    public static void printSmallest(int a, int b, int c) {
        int smallest = a;
        if (b<a){
            smallest = b;
        }
        if (c<b){
            smallest=c;
        }
        if (a<c){
            smallest=a;
        }
        System.out.println(smallest);
    }
}
