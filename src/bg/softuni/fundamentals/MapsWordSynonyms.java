package bg.softuni.fundamentals;

import java.util.*;

public class MapsWordSynonyms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> wordSynonyms = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            List<String> currentSynonym = wordSynonyms.get(word); // дава всички синоними на тази дума, добавени в момента
            if (currentSynonym == null){ // ако няма сининими на тази дума добавени в момента
                currentSynonym = new ArrayList<>(); //създаваме празен лист, за да ги добавим към него
                wordSynonyms.put(word, currentSynonym); //следващия път, когато някой пита за синонимите на тази дума,
                //ще върнеш този списък, който сме създали - currentSynonym = new ArrayList<>();
            }
            currentSynonym.add(synonym); //на текущите синоними на тази дума им добави този синоним
        }

        for (Map.Entry<String, List<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }

    }
}
