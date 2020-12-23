package bg.softuni.fundamentals;

import java.util.*;

public class MapsSoftuniParking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> cars = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++) {
            String command = scanner.nextLine();
            String[] tokens = command.split("\\s+");
            String operation = tokens[0];
            String username = tokens[1];

            switch (operation) {
                case "register":
                    String  carPlate = tokens[2];
                    if (!cars.containsKey(username)){
                        cars.put(username, carPlate);
                        System.out.println(String.format("%s registered %s successfully", username, carPlate));
                    }else{
                        System.out.println(String.format("ERROR: already registered with plate number %s", carPlate));
                    }
                    break;
                case "unregister":
                    if (!cars.containsKey(username)){
                        System.out.println(String.format("ERROR: user %s not found", username));
                    }else{
                        cars.remove(username);
                        System.out.println(String.format("%s unregistered successfully", username));
                    }

                    break;
            }
        }

        cars.forEach((key, value) -> System.out.println(String.format("%s => %s", key, value)));
    }
}
