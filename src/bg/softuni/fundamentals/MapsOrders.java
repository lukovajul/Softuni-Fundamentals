package bg.softuni.fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsOrders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> quantityMap = new LinkedHashMap<>();
        Map<String, Double> priceMap = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"buy".equals(input)){
            String [] tokens = input.split("\\s+");
            String product = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            priceMap.put(product,price); //понеже директно презаписваме цената, не проверяваме дали цената вече я има
            quantityMap.putIfAbsent(product, 0); // понеже ще събираме количествата, почваме от 0
            int newQuantity = quantityMap.get(product) + quantity;
            quantityMap.put(product, newQuantity);


            input = scanner.nextLine();
        }

        quantityMap.forEach((k, v)->System.out.println(String.format("%s -> %.2f", k, v*priceMap.get(k))));

        //k, v*priceMap.get(k) - умножаваме количеството v от quantityMap с цената от priceMap за продукта k /key/
    }
}
