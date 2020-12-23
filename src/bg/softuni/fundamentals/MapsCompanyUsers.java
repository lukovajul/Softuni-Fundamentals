package bg.softuni.fundamentals;

import java.util.*;

public class MapsCompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> company = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)){
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employeeID = data[1];
            company.putIfAbsent(companyName, new ArrayList<>());
            List<String> list = company.get(companyName);
            if (!list.contains(employeeID)){
                list.add(employeeID);
            }

            input=scanner.nextLine();
        }

        company
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c-> {
                    System.out.println(String.format("%s", c.getKey()));
                    c
                            .getValue()
                           // .stream()
                           // .sorted((s1,s2) -> s1.compareTo(s2))
                            .forEach(s-> System.out.println(String.format("-- %s", s)));

                                    });

    }
}
