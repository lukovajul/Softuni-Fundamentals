package bg.softuni.fundamentals;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //int counter = 1;

        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++ ){
                System.out.print(i + " ");
            }
            //counter++;
            System.out.println();
        }
    }
}
