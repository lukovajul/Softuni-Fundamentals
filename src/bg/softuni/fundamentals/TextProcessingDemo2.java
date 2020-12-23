package bg.softuni.fundamentals;

import java.util.Scanner;

public class TextProcessingDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //             01234567890123456
        String text = "Hello and goodbye";
        int currentIndex = text.indexOf("o"); //търсим всички повторения на буквата о в стринга, ще печатаме индексите на които се срещат


        while (currentIndex!=-1){ //-1 дава, ако буквата не е намерена, т.е. цикълът върти докато не спре да среща буквата о
            System.out.println(currentIndex);
            currentIndex = text.indexOf("o", currentIndex+1);
        }


    }
}
