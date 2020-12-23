package bg.softuni.fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsMinerTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"stop".equals(input)){
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            items.putIfAbsent(input, 0);
            int newCount = items.get(resource) + quantity; // дай ми количеството до момента за този resource + новото количество
            items.put(resource, newCount);

            input = scanner.nextLine();
        }

        items.forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));

        // alternative ways of printing:

       // for (Map.Entry<String, Integer> entry : items.entrySet()) {
           // System.out.println(entry.getKey() + " -> " + entry.getValue());
        //}

        //items.
             //   entrySet()
              //  .stream()  - stream тук не е нужен, използва се ако при принтиране има нужда от някакво сортиране, филтриране, например
              //  .forEach(e-> System.out.println(String.format("%s -> %d", e.getValue(), e.getValue())));

    }
}
