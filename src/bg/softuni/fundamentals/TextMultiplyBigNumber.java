package bg.softuni.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class TextMultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String reallyBigNumber = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        if(number==0){
            System.out.println(0); //za da otpechata samo 1 nula kato rezultat,ako umnojavame po nula
            return;
        }
        while (reallyBigNumber.charAt(0)=='0'){
            reallyBigNumber = reallyBigNumber.substring(1); //substringut premahva nulata predi chisloto, ako ni vuvedat 02, 002 i t.n.
        }

        StringBuilder sb = new StringBuilder();
        int remainder = 0;

        for (int i = reallyBigNumber.length()-1; i>=0; i--){
            int digit = Integer.parseInt(String.valueOf(reallyBigNumber.charAt(i))); //Integer priema samo string, a ne char, zatova convertirame simvola kum string
            // vtori variant: Integer.parseInt("" + reallyBigNumber.charAt(i));
            int result =digit*number + remainder;
            remainder=0; //upotrebili sme go i go zanuliavame da ne se natrupva v rezultata
            if (result>9){
                remainder = result/10; // namirame ostatuka
                result=result%10;
            }
            sb.append(result);
        }
        if (remainder!=0){
            sb.append(remainder);
        }


        System.out.println(sb.reverse().toString());


    }
}
