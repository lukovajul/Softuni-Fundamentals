package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysEqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input1 = scanner.nextLine().split(" ");
        String [] input2 = scanner.nextLine().split(" ");

        int [] firstArray = new int [input1.length];
        int [] secondArray = new int [input2.length];

        for (int i = 0; i<firstArray.length; i++){
            firstArray[i] = Integer.parseInt(input1[i]);
        }

        for (int i = 0; i<input2.length; i++){
            secondArray [i] = Integer.parseInt(input2[i]);
        }

        int sum = 0;
        int index = 0;
        boolean check = false;
        for (int i = 0; i<firstArray.length; i++){
            //for (int j = 0; j<secondArray.length; j++){
                if (firstArray[i] == secondArray[i]){
                    sum+=firstArray[i];
                    check=true;
                } else{
                    check=false;
                    index=i;
                    break;

                }

            }

        if (check){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }



    }
}
