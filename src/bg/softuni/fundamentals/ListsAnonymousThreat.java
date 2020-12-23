package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsAnonymousThreat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = readStringList(scanner);
        String line = scanner.nextLine();

        while (!"3:1".equals(line)){
            String [] tokens = line.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "merge":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if (startIndex<0) {
                        startIndex=0;
                    }
                    if (endIndex>input.size()-1){
                        endIndex=input.size()-1;
                    }
                    int counter = startIndex;
                    for (int i = startIndex; i<endIndex; i++){
                        String concat = input.get(counter) + input.get(counter+1);
                        input.set(counter,concat);
                        input.remove(counter+1);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(tokens[1]);
                    int partitions = Integer.parseInt(tokens[2]);
                    if (index>=0 && index<input.size() && partitions>=0 && partitions<=100){
                        String element = input.get(index);
                        List<String> newList = new ArrayList<>();
                        if (element.length()% partitions==0){
                            int portionLength = element.length()/partitions;
                            int count = 0;
                            for (int i = 0; i<partitions; i++){
                                String concat = "";
                                for (int j = 0; j<portionLength; j++){
                                    char symbol = element.charAt(count);
                                    concat+=symbol;
                                    count++;
                                }
                                newList.add(concat);
                            }
                        }else{
                            int portionLength = element.length()/partitions;
                            int count = 0;
                            for (int i = 0; i<partitions; i++){
                                String concat = "";

                                if (i == partitions-1){
                                    for (int j = count; j<element.length(); j++){
                                        char symbol = element.charAt(count);
                                        concat+=symbol;
                                        count++;
                                    }
                                }else{
                                    for (int j =0; j<portionLength; j++){
                                        char symbol = element.charAt(count);
                                        concat+=symbol;
                                        count++;
                                    }
                                }
                                newList.add(concat);
                            }
                        }
                        input.remove(index);
                        input.addAll(index,newList);
                    }
                    break;
            }

            line = scanner.nextLine();
        }


        for (String s : input) {
            System.out.print(s+" ");
        }


    }
    private static List<String> readStringList(Scanner scanner) {
        List<String> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(s);
        }

        return output;
    }

    public static String concatenateDigits(int... digits) {
        StringBuilder sb = new StringBuilder(digits.length);
        for (int digit : digits) {
            sb.append(digit);
        }
        return sb.toString();
    }
}
