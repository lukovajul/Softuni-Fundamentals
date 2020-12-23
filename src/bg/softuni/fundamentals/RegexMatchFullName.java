package bg.softuni.fundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatchFullName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile(expression); //parretr e state mashinata
        Matcher matcher = pattern.matcher(text);//matcher e state mashinata, pusnata po konkreten tekst

        while (matcher.find()){
            System.out.print(matcher.group()+ " "); //.group vzema cialoto suvpadenie

        }

    }
}
