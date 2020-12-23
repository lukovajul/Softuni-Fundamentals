package bg.softuni.fundamentals;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePower = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());

        int countTargets = 0;
        int currentPokePower = pokePower;

        while (currentPokePower>=distance){
            currentPokePower-=distance;
            countTargets++;

            if (currentPokePower==1.0*pokePower*0.5 && exhaustionFactor!=0){
                currentPokePower = currentPokePower/exhaustionFactor;
            }

        }
        System.out.println(currentPokePower);
        System.out.println(countTargets);
    }
}
