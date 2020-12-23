package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsCardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = readIntList(scanner);
        List<Integer> list2 = readIntList(scanner);

        while (list1.size()>0 && list2.size()>0){
            int firstPlayerCard = list1.remove(0);
            int secondPlayerCard = list2.remove(0);
            if (firstPlayerCard>secondPlayerCard){
                list1.add(firstPlayerCard);
                list1.add(secondPlayerCard);
            }else if (secondPlayerCard>firstPlayerCard){
                list2.add(secondPlayerCard);
                list2.add(firstPlayerCard);
            }else if (list1.get(0).equals(list2.get(0))){
                list1.remove(0);
                list2.remove(0);
            }

        }


        if (list1.size()>0){
            sumAndPrint(list1, "First");
        }else if (list2.size()>0){
            sumAndPrint(list2, "Second");
        }
    }

    private static void sumAndPrint(List<Integer> playerWinner, String player) {
        int sum = 0;
        for (Integer element : playerWinner) {
            sum+=element;
        }
        System.out.println(player+" player wins! Sum: "+sum);

    }

    private static List<Integer> readIntList(Scanner scanner) {
        List<Integer> output = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\s+");
        for (String s : input) {
            output.add(Integer.parseInt(s));
        }

        return output;
    }
}
