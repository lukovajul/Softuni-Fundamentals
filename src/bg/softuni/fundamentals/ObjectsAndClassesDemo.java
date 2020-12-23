package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjectsAndClassesDemo {
    static class Reservation { //static се пише, ако класът е в същия файл като мейн метода
        String holderName; // holderName, seats, etc. са полетата на класа
        String phoneNumber;
        int seats;
    }

    public static void main(String[] args) {

        /*Reservation r = new Reservation();
        r.holderName = "Joro";
        r.seats =4;

        Reservation r2 = new Reservation();
        r2.holderName = "Martin";
        r2.seats = 7;

        System.out.println(r.holderName + " " + r.seats);
//        System.out.println(r2.holderName + " " + r2.seats);*/


        Scanner scanner = new Scanner(System.in);

        List<Reservation> reservations = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"end".equals(input)) {
            String[] nameAndSeats = input.split(" ");
            String holder = nameAndSeats[0];
            String phone = nameAndSeats[1];
            int seats = Integer.parseInt(nameAndSeats[2]);
            Reservation r = new Reservation();
            r.holderName = holder;
            r.seats = seats;
            r.phoneNumber = phone;
            reservations.add(r);

            input = scanner.nextLine();
        }

        String guestName = scanner.nextLine();
        // int reservationIndex = reservationHolders.indexOf(guestName);  // този код замества фор цикъла долу; ако няма такова име, връща -1

        int reservationIndex = -1; // индексът е -1, защото ако намерим име на госта, индексът ще започва от 0 нагоре
        for (int i = 0; i < reservations.size(); i++) {
            Reservation reservation = reservations.get(i);
            if (guestName.equals(reservation.holderName)) {
                reservationIndex = i;
            }
        }
                if (reservationIndex != -1) { // намерила съм резултат по името на госта
                    Reservation reservation = reservations.get(reservationIndex);
                    System.out.println(reservation.seats);
                } else {
                    System.out.println("Sorry, no reservation for " + guestName);
                }


            }
        }
