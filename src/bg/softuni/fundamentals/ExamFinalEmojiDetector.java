package bg.softuni.fundamentals;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamFinalEmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexEmogi = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern pattern = Pattern.compile(regexEmogi);
        List<String> emogi = new ArrayList<>();

        Long coolThreshold = 1l;

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int current = Integer.parseInt(String.valueOf(input.charAt(i)));
                coolThreshold= coolThreshold*current;
            }

        }
        int emogiCount = 0;
        int sumValue = 0;
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            emogiCount++;
            String validEmogi = matcher.group("name");
            for (int i = 0; i<validEmogi.length(); i++){
                if (Character.isLetter(validEmogi.charAt(i))) {
                    int letterValue = (int) validEmogi.charAt(i);
                    sumValue += letterValue;
                }
            }
            if (sumValue>coolThreshold) {
                emogi.add(validEmogi);
                sumValue=0;
            }
        }


        System.out.println(String.format("Cool threshold: %d",coolThreshold));
        System.out.println(String.format("%d emojis found in the text. The cool ones are: ", emogiCount));
        for (String s : emogi) {
            System.out.println(s);
        }


    }
}