package bg.softuni.fundamentals;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamFinalPirates02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, City> targetedCities = new HashMap<>();

        String input;
        while (!"Sail".equals(input = scanner.nextLine())) {
            String[] targetedCity = input.split("\\|\\|");

            String name = targetedCity[0];
            int population = Integer.parseInt(targetedCity[1]);
            int gold = Integer.parseInt(targetedCity[2]);

            targetedCities.putIfAbsent(name, new City(name));
            City city = targetedCities.get(name);
            city.setPopulation(city.getPopulation() + population);
            city.setGold(city.getGold() + gold);
        }

        while (!"End".equals(input = scanner.nextLine())) {
            String[] events = input.split("=>");
            String town = events[1];

            switch (events[0]) {
                case "Plunder":
                    int people = Integer.parseInt(events[2]);
                    int gold = Integer.parseInt(events[3]);
                    targetedCities.computeIfPresent(town, (name, city) -> {
                        city.setPopulation(city.getPopulation() - people);
                        city.setGold(city.getGold() - gold);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                        if (city.getGold() <= 0 || city.getPopulation() <= 0) {
                            System.out.printf("%s has been wiped off the map!%n", town);
                            return null;
                        }
                        return city;
                    });
                    break;
                case "Prosper":
                    gold = Integer.parseInt(events[2]);
                    if (gold > 0) {
                        targetedCities.computeIfPresent(town, (name, city) -> {
                            city.setGold(city.getGold() + gold);
                            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                    gold, town, city.getGold());
                            return city;
                        });
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                    break;
            }
        }

        if (targetedCities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", targetedCities.size());
            targetedCities.values()
                    .stream()
                    .sorted(Comparator.comparing(City::getGold)
                            .reversed()
                            .thenComparing(City::getName))
                    .forEach(city -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                            city.getName(), city.getPopulation(), city.getGold()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    static class City {
        String name;
        int population;
        int gold;

        public City(String name) {
            this.name = name;
            this.population = 0;
            this.gold = 0;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }
    }
}
