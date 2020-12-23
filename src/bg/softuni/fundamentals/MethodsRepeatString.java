package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsRepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int repetitionsCount = Integer.parseInt(scanner.nextLine());

        String repeated = repeat (s, repetitionsCount);

        System.out.println(repeated);
    }

    private static String repeat(String s, int repetitionsCount) {
        String[] repetitions = new String [repetitionsCount];
        for (int i = 0; i<repetitionsCount; i++){
            repetitions[i] = s;
        }
        String repeated = String.join("", repetitions);
        return repeated;
        //return String.join("", repetitions); вместо да се създва променлива repeated
    }
}
