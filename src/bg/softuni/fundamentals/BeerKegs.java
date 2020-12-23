package bg.softuni.fundamentals;

import java.util.Scanner;

public class BeerKegs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String biggerKegModel = "";


        for (int i = 0; i<n; i++){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentVolume = Math.PI * radius * radius * height;

            if (currentVolume>maxVolume){
                maxVolume=currentVolume;
                biggerKegModel=model;
            }
        }
        System.out.println(biggerKegModel);
    }
}
