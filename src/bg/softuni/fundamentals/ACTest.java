package bg.softuni.fundamentals;

import java.util.Scanner;

public class ACTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        boolean check = false;
        for (int i =0; i<password.length(); i++){
            int letter = (int) password.charAt(i);
            if (letter>=48 && letter<=57) {
                check = true;
            } else if (letter>=97 && letter<=122){
                check=true;
            } else{
                check=false;
            }
            if (!check) {
                System.out.println("Password must consist only of letters and digits");
            }
        }


        int countDigits = 0;
        for (int i = 0; i<password.length(); i++){
            if (password.contains("1")|| password.contains("2")|| password.contains("3")||password.contains("4")|| password.contains("5")|| password.contains("6")|| password.contains("7")|| password.contains("8")|| password.contains("9")||password.contains("0")) {
                countDigits++;
            }
        }
        if (countDigits<2){
            System.out.println("Password must have at least 2 digits");
        }
    }
}
