package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamFinalWorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        String input = scanner.nextLine();
        //StringBuilder sb = new StringBuilder();

        while (!"Travel".equals(input)){
            String[] tokens = input.split(":");
            String command = tokens[0];
            switch (command){
                case "Add Stop":
                int index = Integer.parseInt(tokens[1]);
                String insertString = tokens[2];
                if (index>=0 && index<stops.length()){
                   StringBuilder sb = new StringBuilder(stops);
                  stops = sb.insert(index, insertString).toString();
                }
                    System.out.println(stops);
                break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex>=0 && startIndex<stops.length() && endIndex>=0 && endIndex<stops.length()){
                        StringBuilder sb = new StringBuilder(stops);
                       stops = sb.replace(startIndex, endIndex+1, "").toString();
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    if (stops.contains(oldString)) {
                       stops = stops.replace(oldString, newString);
                    }
                    System.out.println(stops);
            }

            input=scanner.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: " +stops));
    }
}
