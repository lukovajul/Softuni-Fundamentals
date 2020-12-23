package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysStringToIntConsoleDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrayAsString = scanner.nextLine(); //"1 2 3 4 52 6"; това са всички числа, с които ще работим и така се пише като ги знаем; ако не ги знаем, ги изкарваме от конзолата

        String [] numbersAsStrings = arrayAsString.split(" "); //тази команда split позволява да разделим стринга, показвайки как искаме да стане в кавичките
        //поставям space в кавичките, защото искам да разделя по слейсове, но когато знаем, че всички ги дели само 1 спейс
        //ако има повече от 1 спейс между цифрите: arrayAsString.split(regex:"\\s+");

        int [] arr = new int[numbersAsStrings.length];  //направи ми числов масив, чийто размер е колкото дължината на стринга numbersAsStrings

        for (int i = 0; i<arr.length; i++){
            arr [i] = Integer.parseInt(numbersAsStrings[i]); //съответната позиция на моя масив от интове да я направя равна на съответната позиция на моя масив от стрингове, т.е превръщам стринговете в интове
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }







    }
}
