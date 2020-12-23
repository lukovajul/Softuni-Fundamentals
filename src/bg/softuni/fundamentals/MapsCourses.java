package bg.softuni.fundamentals;

import java.util.*;

public class MapsCourses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"end".equals(input)){
            String [] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];

            courses.putIfAbsent(courseName, new ArrayList());
            courses.get(courseName).add(studentName);


            input=scanner.nextLine();
        }

        courses
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size())) //превръщаме е голям Integer, защото малкият инт няма функция compare; .size защото сортираме по броя елементи
                //иначе трябва да се напише така: .sorted((c1,c2) -> c2.getValue.size() - c1.getValue.size())
                .forEach(entry ->{
                    System.out.println(String.format("%s: %d", entry.getKey(),entry.getValue().size()));
                    entry //za da printirame imenata pod kursa
                            .getValue() //value e imeto na kursista
                            .stream()
                            .sorted((s1, s2) -> s1.compareTo(s2))
                            .forEach(s -> System.out.println(String.format("-- %s", s)));

        });
    }
}
