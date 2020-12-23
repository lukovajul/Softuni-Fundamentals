package bg.softuni.fundamentals;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int digit = 0;
        boolean isSpecialNum = false;
        for (int num = 1; num <= n; num++) {
            digit = num;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum){
                System.out.printf("%d -> True%n", digit);
            }else{
                System.out.printf("%d -> False%n", digit);
            }

          sum = 0;
          num = digit;
        }

    }
}
