package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamSoftuniReception {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employee1 = Integer.parseInt(scanner.nextLine());
        int employee2 = Integer.parseInt(scanner.nextLine());
        int employee3 = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int allEmployeesCapacityPerHour = employee1+employee2+employee3;
        //int countCurrentStudent = 0;
        int hoursNeeded=0;

        while (studentsCount>0) {
            // studentsCount-=allEmployeesCapacityPerHour;
            hoursNeeded++;

            if (hoursNeeded % 4 == 0) {
                continue;
            }
            studentsCount-=allEmployeesCapacityPerHour;
        }

        System.out.printf("Time needed: %dh.", hoursNeeded);
    }
}
