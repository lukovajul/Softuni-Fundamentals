package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] array = new int[input.length];

        for (int i = 0; i<array.length; i++){
            array [i] = Integer.parseInt(input[i]);
        }

        boolean flag = false;
        int index = 0;

        for (int i = 0; i<array.length; i++){
            int leftSum = 0;
            for (int j = 0; j<i; j++){
                leftSum=leftSum+array[j];
            }
            int rightSum = 0;
            for (int j = i+1; j<array.length; j++){
                rightSum=rightSum+array[j];
            }
            if (leftSum==rightSum){
                flag=true;
                index=i;
                break;
            }

        }

        if (flag){
            System.out.println(index);
        }else{
            System.out.println("no");
        }


    }
}
