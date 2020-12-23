package bg.softuni.fundamentals;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapsCountRealNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numberOccurences = new TreeMap<>();
        String [] numbersAsStrings = scanner.nextLine().split(" ");

        for (int i = 0; i<numbersAsStrings.length; i++){
            double number = Double.parseDouble(numbersAsStrings[i]);
            Integer occurences = numberOccurences.get(number); //проверяваме дали числото го има

            if (occurences == null){ //ако го няма, даваме му стойност 0
                occurences=0;
            }

            numberOccurences.put(number,occurences +1); //ако го има, увеличаваме броят на срещанията му с 1
        }

        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }


    }
}
