package bg.softuni.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;

public class ObjectsClassesSumBigNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n1 = new BigInteger(scanner.nextLine());
        BigInteger n2 = new BigInteger(scanner.nextLine());

        BigInteger sum = n1.add(n2);

        System.out.println(sum);
    }
}
