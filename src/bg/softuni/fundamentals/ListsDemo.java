package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        //List <Double> list2 = new ArrayList<>(); типа на променливата е с главна буква
        System.out.println(list.size());
        list.add(42);
        list.add(12);
        list.add(122);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(0,5);  //на кой индекс от списъка /в случая индекс 0/ какво искаме да сложим като стойност /в случая 5/

        for (int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
