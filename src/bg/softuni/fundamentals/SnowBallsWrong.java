package bg.softuni.fundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class SnowBallsWrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());
        int snowMax = 0;
        int timeMax = 0;
        int qualityMax = 0;

        BigInteger maxNumber = BigInteger.valueOf(Integer.MIN_VALUE);

        for (int i = 0; i < balls; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            BigInteger currentSnowBallValue = BigDecimal.valueOf(Math.pow((snowballSnow / snowballTime), snowballQuality)).toBigInteger();
            if (currentSnowBallValue.compareTo(maxNumber)>0) {
                maxNumber = currentSnowBallValue;
                snowMax = snowballSnow;
                timeMax = snowballTime;
                qualityMax = snowballQuality;
                System.out.printf("%d : %d = %d (%d)", snowMax, timeMax, currentSnowBallValue, qualityMax);
            }


        }


    }
}
