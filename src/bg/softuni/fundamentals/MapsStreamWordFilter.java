package bg.softuni.fundamentals;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MapsStreamWordFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> filtered = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(String.join("\n", filtered));
        //System.out.println(String.join(System.lineSeparator(), filtered)); - алтернативен начин за принтиране на отделен ред


    }
}
