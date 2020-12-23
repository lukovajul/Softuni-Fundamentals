package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsPasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean passwordIsValid = true;

        if (!checkPasswordLength(password)){
            passwordIsValid=false;
        }
        if (!checkForSymbols(password)){
            passwordIsValid=false;
        }
        if (!checkNumberDigits(password)){
            passwordIsValid=false;
        }

       if (passwordIsValid){
           System.out.println("Password is valid");
       }
    }

    private static boolean checkNumberDigits(String password) {
        int countDigits = 0;
        for (int i = 0; i<password.length(); i++){
            char charA = password.charAt(i);
            if (charA>='0' && charA<='9'){
            countDigits++;
            }
        }
        if (countDigits<2){
            System.out.println("Password must have at least 2 digits");
            return false;
        }else{
            return true;
        }
    }

    private static boolean checkForSymbols(String password) {
        boolean check = false;
        for (int i = 0; i<password.length(); i++){
            int letter = (int) password.charAt(i);

            if (letter>=48&& letter<=57){
                check=true;
            }else if (letter>=65&&letter<=90){
                check=true;
            }else if (letter>=97&&letter<=122){
                check=true;
            }else {
                check=false;
                break;
            }
        }
        if (!check){
            System.out.println("Password must consist only of letters and digits");
            return false;
        }else {
            return true;
        }
    }

        private static boolean checkPasswordLength (String password){
        int counter = 0;
        for (int i = 0; i<password.length(); i++){
            counter++;
        }
            if (counter >=6 && counter <= 10) {
                return true;
            }else{
                System.out.println("Password must be between 6 and 10 characters");
                return false;
            }

        }


}

