package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObjectsClassesOpinionPoll {
        static class Person{
          private String firstName;
            private int age;

            public Person (String firstName, int age){
                this.firstName = firstName;
                this.age = age;
            }

            public String getFirstName() {
                return firstName;
            }

            public int getAge() {
                return age;
            }
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i<n; i++){
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt((data[1]));
            Person person = new Person(name, age); // обект
            if (person.getAge()>30){
                people.add(person);
            }
        }

        //people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        // p1 = person1, p2 = person2; ако сравняваме числа /години, затова се ползва Integer
        // p означава за всеки човек от листа

        people.stream().sorted((p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()))
        .forEach(p -> System.out.println(p.getFirstName() + " - " + p.getAge() ));

    }
}
