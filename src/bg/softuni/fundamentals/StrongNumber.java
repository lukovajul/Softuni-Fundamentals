package bg.softuni.fundamentals;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNum = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < inputNum.length(); i++) {
            int digit = inputNum.charAt(i) - 48;
            //System.out.println(digit);

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *=j;
            }
            sum+=fact;
        }
        int input = Integer.parseInt(inputNum);
        if (sum==input){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
