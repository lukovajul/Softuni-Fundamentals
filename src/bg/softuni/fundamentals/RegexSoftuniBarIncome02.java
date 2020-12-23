package bg.softuni.fundamentals;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSoftuniBarIncome02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d+)\\$";
        String nameRegex = "%(?<name>[A-Z][a-z]+)%";
        String productRegex = "<(?<product>\\w+)>";
        String countRegex = "\\|(?<count>\\d+)\\|";
        String priceRegex = "(?<price>\\d+\\.?\\d+)\\$";

        Pattern pattern = Pattern.compile(nameRegex);
        Pattern pattern1 = Pattern.compile(productRegex);
        Pattern pattern2 = Pattern.compile(countRegex);
        Pattern pattern3 = Pattern.compile(priceRegex);


        String input = scanner.nextLine();
        double income = 0.0;

        while (!"end of shift".equals(input)){
            Matcher matcher = pattern.matcher(input);
            Matcher matcher1 = pattern1.matcher(input);
            Matcher matcher2 = pattern2.matcher(input);
            Matcher matcher3 = pattern3.matcher(input);
            if (matcher.find()&& matcher1.find()&& matcher2.find()&& matcher3.find()){
                String name = matcher.group("name");
                String product = matcher1.group("product");
                int count = Integer.parseInt(matcher2.group("count"));
                double price = Double.parseDouble(matcher3.group("price"));

                double totalPrice = count*price;
                income+=totalPrice;
                System.out.println(String.format("%s: %s - %.2f", name, product, totalPrice));
            }

            input=scanner.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", income));
    }
}
