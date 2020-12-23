package bg.softuni.fundamentals;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapsCountChairsString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] text = scanner.nextLine().split(" ");

        Map<Character, Integer> characters = new LinkedHashMap<>();

        for (int i = 0; i<text.length; i++){
            for(int j = 0; j<text[i].length(); j++){
                char currentChar = text[i].charAt(j);

                if (characters.containsKey(currentChar)){
                    characters.put(currentChar, characters.get(currentChar)+1);
                }else{
                    characters.put(currentChar,1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
