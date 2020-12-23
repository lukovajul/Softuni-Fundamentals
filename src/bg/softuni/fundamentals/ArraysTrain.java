package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysTrain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int [] train = new int [wagons];

        for (int i = 0; i<train.length; i++){
            train [i]= Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        for (int wagon : train){ // за всеки един вагон от влака прави нещо
            sum+=wagon;
            System.out.print(wagon + " ");

        }
        System.out.println();
        System.out.println(sum);

    }
}
