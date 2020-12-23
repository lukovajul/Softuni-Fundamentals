package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsClassesOrderByAge {
    static class Person{
        String name;
        String id;
        int age;

        public int getAge() {
            return this.age;
        }

        public Person (String name, String id, int age){
            this.name = name;
            this.id =id;
            this.age = age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String [] tokens = input.split("\\s+");
            String name = tokens[0];
            String id = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            Person person = new Person(name,id,age);
            people.add(person);
            input = scanner.nextLine();
        }

        people
                .stream()
        .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
        .forEach(p-> System.out.println(p));
    }
}
