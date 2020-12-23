package bg.softuni.fundamentals;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(^|(?<=\\s))(([A-Za-z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+)(@)([A_Za-z]+([\\.\\-_]*[A-Za-z]+)+))(\\b|(?=\\s))";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
