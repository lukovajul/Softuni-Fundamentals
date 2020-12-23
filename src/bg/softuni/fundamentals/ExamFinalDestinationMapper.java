package bg.softuni.fundamentals;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamFinalDestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(=|\\/)(?<location>[A-Z][A-Za-z]{2,})\\1";
        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
           String destination =  matcher.group(2);
           destinations.add(destination);
           int currentLength = destination.length();
           travelPoints+=currentLength;
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println(String.format("Travel Points: %d", travelPoints));

       // System.out.println("Travel Points: " + destinations.stream().mapToInt(d -> d.length()).sum());

    }
}
