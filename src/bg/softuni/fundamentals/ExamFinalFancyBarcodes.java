package bg.softuni.fundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamFinalFancyBarcodes {
    public static <Char> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(@#+)(?=[A-Z])([A-Za-z0-9]{6,})(?<=[A-Z])(@#+)";

        Pattern pattern = Pattern.compile(regex);


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (!matcher.find()) {
                System.out.println("Invalid barcode");
            } else {
                String found = matcher.group(2);
                String productGroup = "";
                for (int j = 0; j < found.length(); j++) {
                    char current = found.charAt(j);
                    if (Character.isDigit(current)) {
                        productGroup = productGroup + current;
                    }

                }
                if (productGroup.isEmpty()) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println(String.format("Product group: %s", productGroup));
                }
            }

        }
    }
}

