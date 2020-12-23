package bg.softuni.fundamentals;

import java.util.Scanner;

public class EpochConverter {
    public static void main(String[] args) {

        //тук игнорираме високосните години

        int year = new Scanner(System.in).nextInt();
        final int unixEpochTimeStartYear = 1970; //final се пише отпред когато стойността няма да се променя в програмата

        int yearsPassed = year - unixEpochTimeStartYear;

        System.out.println(yearsPassed);

        final long secondsInAYear  = 365*24*60*60;

        long epochTime = yearsPassed * secondsInAYear;
        System.out.println(epochTime);

    }
}
