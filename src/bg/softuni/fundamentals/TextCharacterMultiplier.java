package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextCharacterMultiplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.next();
        String second = scanner.next();


        int min = Math.min(first.length(), second.length());  //метод, който намира дължината на по-малкия от двата стринга
        int max = Math.max(first.length(), second.length());

        int result = 0; //променлива, която събира резултата

        for (int i = 0; i<max; i++){
            if (i<min){
                result+= first.charAt(i) * second.charAt(i);
            }else if (first.length()==max){ //предполагаме, че първият стринг е по-дълъг
                result+=first.charAt(i);
            }else {
                result+= second.charAt(i);
            }
        }

        System.out.println(result);


    }
}
