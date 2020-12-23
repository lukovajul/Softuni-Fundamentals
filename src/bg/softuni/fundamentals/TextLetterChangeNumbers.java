package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextLetterChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        double finalSum = 0.0;

        for (String word : words) {
           double result = 0.0;
           char firstLetter = word.charAt(0);
           char lastLetter = word.charAt(word.length()-1);
           String numberAsString = word.substring(1,word.length()-1);
           long number = Integer.parseInt(numberAsString);

           if (Character.isUpperCase(firstLetter)){
               result = number*1.0/(firstLetter-64); //vadim 64, zashtoto a e purvata bukva ot azbukata; inache shte izleze ASCII stoinostta 65 za A;
           }else {
               result = number * (firstLetter-96);
           }

           if (Character.isUpperCase(lastLetter)){
                result-=lastLetter-64;
           }else{
                result+=lastLetter-96;
           }
           finalSum+=result;
        }
        System.out.println(String.format("%.2f", finalSum));

    }
}
