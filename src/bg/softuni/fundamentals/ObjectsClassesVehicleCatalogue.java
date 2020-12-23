package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsClassesVehicleCatalogue {
    static class Car{
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Car (String model, String color, int horsePower){
            this.type = "Car"; // за да се запази главната буква в аутпута
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

        public String getModel(){
            return this.model;
        }
        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" + "Color: %s%n" + "Horsepower: %d", this.type, this.model, this.color, this.horsePower);

        }

    }

    static class Truck{
        private String type;
        private String model;
        private String color;
        private int horsePower;

        public Truck (String model, String color, int horsePower){
            this.type = "Truck"; // за да се запази главната буква в аутпута
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        public int getHorsePower() {
            return this.horsePower;
        }

        public String getModel(){
            return this.model;
        }

        @Override
        public String toString() {
            return String.format("Type: %s%n" +
                    "Model: %s%n" + "Color: %s%n" + "Horsepower: %d", this.type, this.model, this.color, this.horsePower);

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();
        int carsHorsepower = 0;
        int trucksHorsepower = 0;

        while (!"End".equals(input)){
            String [] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);
            if ("car".equals(type)){
                Car car = new Car(model,color,horsePower);
                carsHorsepower += car.getHorsePower();
                cars.add(car); //подаваме обекта в листа
            }else if ("truck".equals(type)){
                Truck truck = new Truck(model,color,horsePower);
                trucksHorsepower += truck.getHorsePower();
                trucks.add(truck);
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!"Close the Catalogue".equals(input)){
            for (Car car : cars){
                if (car.getModel().equals(input)){
                    System.out.println(car);
                    break;
                }
            }
            for (Truck truck : trucks) {
                if (truck.getModel().equals(input)){
                    System.out.println(truck);
                    break;
                }

            }
            input = scanner.nextLine();
        }
        double avgCarsHorsepower = 0; // за да принтира 0, ако няма друга стойност
        if (!cars.isEmpty()) {
            avgCarsHorsepower = carsHorsepower * 1.0 / cars.size(); // сумата на всички конски сили/броя на колите
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarsHorsepower);
        double avgTruckHorsepower = 0;
        if (!trucks.isEmpty()) {
            avgTruckHorsepower = trucksHorsepower * 1.0 / trucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTruckHorsepower);
    }
}
