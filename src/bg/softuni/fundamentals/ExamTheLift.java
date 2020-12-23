package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamTheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleWaiting = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] initialStateWagon = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            initialStateWagon[i] = Integer.parseInt(input[i]);
        }
        int peopleOnTheCurrentWagon = 0;
        int peopleOnTheLift = 0;
        boolean noMorePeople = false;

        for (int i = 0; i < initialStateWagon.length; i++) {
            while (initialStateWagon[i] < 4) {
                initialStateWagon[i]++;
                peopleOnTheCurrentWagon++;
                if (peopleOnTheCurrentWagon + peopleOnTheLift == peopleWaiting) {
                    noMorePeople = true;
                    break;
                }

            }
            peopleOnTheLift += peopleOnTheCurrentWagon;
            if (noMorePeople) {
                break;
            }
            peopleOnTheCurrentWagon = 0;
        }
            if (peopleOnTheLift < initialStateWagon.length*4 && noMorePeople) {
                System.out.println("The lift has empty spots!");
               // printWagons(initialStateWagon);
                //System.out.println();
            }else if (!noMorePeople){
                System.out.printf("There isn't enough space! %d people in a queue!%n", peopleWaiting - peopleOnTheLift);
               // printWagons(initialStateWagon);
            }
            printWagons(initialStateWagon);
        }



    private static void printWagons(int[] initialStateWagon) {
        for (int i = 0; i < initialStateWagon.length; i++) {
            if (i == 0) {
                System.out.print(initialStateWagon[i]);
            } else {
                System.out.print(" " + initialStateWagon[i]);
            }
        }

    }
}



