package bg.softuni.fundamentals;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phones);
        List<String> matchedPhone = new LinkedList<>();

        while (phoneMatcher.find()) {
            matchedPhone.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedPhone));
    }
}
