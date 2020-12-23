package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysMaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(" ");
        int [] array = new int [input.length];

        for (int i = 0; i<array.length; i++){
            array [i] = Integer.parseInt(input[i]);
        }

        int maxCount = 0;
        int index = 0;
        int bestSeqIndex = 0;

        for (int i = 0; i<array.length; i++){
            int count = 0;
            for (int j = i; j<array.length; j++){
                if (array[i]==array[j]){
                    count++;
                    index=i;
                    if (count>maxCount){
                        maxCount=count;
                        bestSeqIndex=index;
                    }
                }else{
                    break;
                }
            }
        }

        for (int i = 0; i<maxCount; i++){
            System.out.print(array[i+bestSeqIndex]+" ");
        }
    }
}
