package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsTopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (divisibleBy8(i) && oddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean divisibleBy8(int n) {
        int sumDigits = 0;
        while (n>0){
            sumDigits+=n%10;
            n/=10;
        }
        if (sumDigits%8==0){
            return true;
        }else{
            return false;
        }
    }

    private static boolean oddDigit(int n){
        int counter = 0;
        while (n>0){
            if ((n%10)%2==1){
                counter++;
            }
            n/=10;
        }
        if (counter >= 1) {
            return true;
        } else {
            return false;
        }
    }
}
