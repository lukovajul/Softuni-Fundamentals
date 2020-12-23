package bg.softuni.fundamentals;

import java.util.Scanner;

public class ExamArrayModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] data = scanner.nextLine().split(" ");
        int [] array = new int [data.length];
        for (int i = 0; i<data.length; i++){
            array[i] = Integer.parseInt(data[i]);
        }

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String [] tokens = input.split(" ");
            String command = tokens[0];

            switch (command){
                case "swap":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    int temp = array[index1];
                    array[index1]=array[index2];
                    array[index2]=temp;
                    break;
                case "multiply":
                    int index11 = Integer.parseInt(tokens[1]);
                    int index22 = Integer.parseInt(tokens[2]);
                    int temp1 = array[index11];
                    array[index11] = array[index11]*array[index22];
                    break;
                case "decrease":
                    for (int i = 0; i<array.length; i++){
                        array[i] = array[i]-1;
                    }
                    break;
            }

            input=scanner.nextLine();
        }

        for (int i = 0; i<array.length; i++){
            if (i==0){
                System.out.print(array[i]);
            }else{
                System.out.print(", " + array[i]);
            }
            //System.out.print(array[i]+", ");
        }

    }
}
