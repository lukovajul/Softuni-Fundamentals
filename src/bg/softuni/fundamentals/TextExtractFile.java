package bg.softuni.fundamentals;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TextExtractFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] line = scanner.nextLine().split(Pattern.quote("\\"));
        String last = line[line.length-1];
        //int slashIndex = last.lastIndexOf('\\'); // търсим последния индекс с \
        int pointIndex = last.lastIndexOf('.');

        String fileName = last.substring(0, pointIndex);
        String fileExtension = last.substring(pointIndex+1); // ot pointIndex+1, za da ne printira tochkata


       System.out.println(String.format("File name: %s", fileName));
       System.out.println(String.format("File extension: %s", fileExtension));

    }
}
