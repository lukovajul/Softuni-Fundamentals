package bg.softuni.fundamentals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapsStudentAcademy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(name, grade);
            if (students.containsKey(name)){
                double averageGrade = (grade + students.get(name))/2;
                students.put(name,averageGrade);
            }
        }

        students.entrySet()
                .stream()
                .filter(s -> s.getValue()>=4.50)
                .sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue()))
                .forEach(s-> System.out.println(String.format("%s -> %.2f", s.getKey(), s.getValue())));
    }
}
