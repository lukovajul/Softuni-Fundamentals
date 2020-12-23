package bg.softuni.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListsDemo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <Integer> numbers = new ArrayList<>(Arrays.asList(10,20,30,40,50,60));
        numbers.remove(2); //remove by index
        numbers.remove((Integer)40); //remove by value
        numbers.add(100); //adds in the end of the line
        numbers.add(0,-100); //inserts an element to index

        for (int i = 0; i<numbers.size(); i++){
            System.out.print(numbers.get(i)+" ");
        }
    }
}
