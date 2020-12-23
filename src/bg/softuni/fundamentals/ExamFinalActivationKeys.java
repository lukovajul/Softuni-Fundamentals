package bg.softuni.fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExamFinalActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder rawActivationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"Generate".equals(input)){
            String[] operations = input.split(">>>");
            switch (operations[0]){
                case "Contains":
                    String substring = operations[1];
                    if (rawActivationKey.toString().contains(substring)){
                        System.out.println(String.format("%s contains %s", rawActivationKey, substring));
                    }else{
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperLower = operations[1];
                    int startIndex = Integer.parseInt(operations[2]);
                    int endIndex = Integer.parseInt(operations[3]);
                    String toChange = rawActivationKey.toString().substring(startIndex,endIndex);
                    if (upperLower.equals("Upper")) {
                        toChange = toChange.toUpperCase();
                        rawActivationKey.replace(startIndex, endIndex, (toChange));
                    }else{
                        toChange = toChange.toLowerCase();
                        rawActivationKey.replace(startIndex, endIndex, (toChange));
                    }
                    System.out.println(rawActivationKey);
                    break;
                case "Slice":
                    int startIndex1 = Integer.parseInt(operations[1]);
                    int endIndex1 = Integer.parseInt(operations[2]);
                    StringBuilder temp = new StringBuilder(rawActivationKey.toString().substring(0, startIndex1) + rawActivationKey.toString().substring(endIndex1, rawActivationKey.length()));
                    System.out.println(temp);
                    rawActivationKey=temp;
                    break;
                default:
                    throw new IllegalStateException("wrong input!!!");
            }
            input=scanner.nextLine();
        }

        System.out.println(String.format("Your activation key is: %s",rawActivationKey));

    }
}
