package bg.softuni.fundamentals;

import java.util.*;

public class ExamFinalNikuldensMeals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Map<String, List<String>> likedMeals = new LinkedHashMap<>();
        int unlikedMeals = 0;

        while (!"Stop".equals(line)){
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            if (type.equals("Like")){
                likedMeals.putIfAbsent(guestName, new ArrayList<>());
                List<String> guestMeals = likedMeals.get(guestName); // spisuk na iastiata v map-a do momenta
                //if (guestMeals==null){ //proverka dali gostut e v spisuka
                 //   guestMeals=new ArrayList<>(); // nov spisuk na iastia na nov gost
                //}

                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }
                likedMeals.put(guestName, guestMeals); //obnoviavame spisuka na gosta s negovite iastia

            }else {
                if (!likedMeals.containsKey(guestName)){ //proverka dali gostut ne e v spisuka
                    System.out.println(String.format("%s is not at the party.", guestName));
                }else{ //ako gostut e v spisuka
                    List <String> meals = likedMeals.get(guestName); //vzimame spisuk s negovite iastia
                    if (!meals.contains(mealName)){
                        System.out.println(String.format("%s doesn`t have the %s in his/her collection.", guestName, mealName));
                    }else {
                        unlikedMeals++;
                        System.out.printf("%s doesn`t like the %s.%n", guestName,mealName);
                        meals.remove(mealName);
                        likedMeals.put(guestName,meals); //obnoviavame spisuka s iastiata sled premahvaneto na unliked iastie

                    }
                }

            }

            line=scanner.nextLine();
        }
       // System.out.println("Please work");
        likedMeals.entrySet().stream().sorted((left, right)->{
                int result = right.getValue().size() - left.getValue().size(); //vadim broiat na iastiata na desnia chovek ot tezi na levia, sravniavame 2-ma dushi
            if (result == 0){ //0 znachi che sa ravni po broi iastia
                return left.getKey().compareTo(right.getKey()); //sravniavame imenata na dvamata

            }else{
                return result;
            }
        }).forEach(e -> System.out.println(e.getKey() + ": " + printList(e.getValue()))); //suzdavame metod da printira iastiata


        System.out.println("Unliked meals: " + unlikedMeals);

    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]", ""); //zamestvame otvariashta i zatvariashta skoba s prazen string, za da se printirat imenata bez skobite

    }
}
