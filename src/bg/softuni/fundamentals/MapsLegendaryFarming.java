package bg.softuni.fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsLegendaryFarming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        Map<String, Integer> junk = new LinkedHashMap<>();
        // слагаме нужните елементи, за да проверим после дали ги съдържа или даденият от конзолата е junk елемент
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        boolean isObtained = false; // булева променлива, тъй като не е упоменато колко пъти ще въртим while цикъла;
        // знаем, че го въртим докато не е създаден съответният герой от играта; в началото е false, понеже още не е намерен

        while(!isObtained){
            //3 Motes 5 stones 5 Shards
            String [] inputLine = scanner.nextLine().split("\\s+");
            for (int i = 0; i<inputLine.length; i+=2){ //i+=2 върти цикъла през 2 елемента, защото искаме да вземем двойка 3 Motes / 5 stones / 5 Shards
                int quantity = Integer.parseInt(inputLine[i]);
                String item = inputLine[i+1].toLowerCase();
                // проверка дали елементът е junk или не:
                if (keyMaterials.containsKey(item)){
                    addToMap(keyMaterials, item, quantity);
                    isObtained = isObtained(keyMaterials, item);
                    if (isObtained){
                        break;
                    }
                } else{
                    addToMap(junk, item, quantity);
                }

            }
        }
        keyMaterials
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int result = i2.getValue().compareTo(i1.getValue()); //ако едното е по-голямо, връща -1, ако е по-малко връща +1, ако са равни = 0
                    if (result==0){ //ако са равни връща 0, но ние искаме да ги сравни по име по азбучен ред, затова е следната проверка:
                        result = i1.getKey().compareTo(i2.getKey());
                    }
                    return result;
                })
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue()))); //i e всеки item

        junk
                .entrySet()
                .stream()
                .sorted((i1, i2) -> i1.getKey().compareTo(i2.getKey()))
                .forEach(i -> System.out.println(String.format("%s: %d", i.getKey(), i.getValue())));

    }

    private static boolean isObtained(Map<String, Integer> map, String item) {
        if (map.get(item)>=250){
            int newQuantity = map.get(item) -250; // махаме 250 бройки от общата сума на съотв. продукт, ако сме ги достигнали, за да видим остатъка
            map.put(item, newQuantity);
            switch (item){
                case "shards":
                    System.out.println("Shadowmourne obtained!");
                    break;
                case "fragments":
                    System.out.println("Valanyr obtained!");
                    break;
                case "motes":
                    System.out.println("Dragonwrath obtained!");
                    break;
            }
            return  true;
        }
        return false;  //връщаме фолс, ако не сме влезли в горната проверка
    }

    private static void addToMap(Map<String, Integer> map, String item, int quantity) {
        map.putIfAbsent(item, 0);
        int newQuantity = map.get(item) + quantity;
        map.put(item, newQuantity);
    }
}
