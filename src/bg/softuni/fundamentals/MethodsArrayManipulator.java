package bg.softuni.fundamentals;

import java.util.Scanner;

public class MethodsArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        int[] array = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = Integer.parseInt(data[i]);
        }

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index < 0 || index >= array.length) {
                        System.out.println("Invalid index");
                    } else {
                        exchange(array, index);
                    }
                    break;
                case "min": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMinEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMinOdd(array);
                    }
                }
                break;
                case "max": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMaxEven(array);
                    } else if (evenOrOdd.equals("odd")) {
                        findMaxOdd(array);
                    }
                }
                break;
                case "first": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count>array.length){
                        System.out.println("Invalid count");
                    }else{
                        String evenOrOdd = tokens[2];
                        if (evenOrOdd.equals("even")) {
                            findFirstCountEvenNumbers(array, count);
                        } else if (evenOrOdd.equals("odd")) {
                            findFirstCountOddNumbers(array, count);
                        }
                    }

                }
                break;
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    if (count>array.length) {
                        System.out.println("Invalid count");
                    }else{
                        String evenOrOdd = tokens[2];
                        if (evenOrOdd.equals("even")) {
                            findLastCountEvenNumbers(array, count);
                        } else if (evenOrOdd.equals("odd")) {
                            findLastCountOddNumbers(array, count);
                        }
                    }

                }
                break;
            }
            input = scanner.nextLine();// за да не влезем в безкраен цикъл
        }
        PrintArray(array);

    }


    private static void findLastCountOddNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0) {
                result = expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }

        reverseArray(result);
        PrintArray(result);


    }

    private static void findLastCountEvenNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                result = expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }

        reverseArray(result);
        PrintArray(result);

    }

    private static void reverseArray(int[] array) {
        int [] temp = copyArray(array);
        for (int i = array.length-1; i>=0; i--){
            array[i] = temp[array.length-1-i];
        }
    }

    private static void findFirstCountOddNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result = expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }
        PrintArray(result);

    }

    private static void findFirstCountEvenNumbers(int[] array, int count) {
        int[] result = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result = expandAndAddToArray(result, array[i]);
                if (result.length == count) {
                    break;
                }
            }
        }
        PrintArray(result);
    }

    private static void PrintArray(int[] result) {
        System.out.print("[");
        for (int i = 0; i<result.length;i++){
            if (i==0){
                System.out.print(result[i]);
            }else{
                System.out.print(", " + result[i]);
            }
        }
        System.out.println("]"); //
    }

    private static int[] expandAndAddToArray(int[] oldArray, int newElement) {
        int[] newArray = new int[oldArray.length + 1];

        for (int i = 0; i<oldArray.length; i++){
            newArray[i] = oldArray[i];
        }
        newArray[newArray.length-1] = newElement;
        return newArray;
    }



    private static void findMaxOdd(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1; //като отправна точка да не се счупи масива,не можем да имаме индекс -1
        for (int i = 0; i<array.length; i++){
            if (array[i] %2!=0 && max<=array[i]){
                max = array[i];
                index=i;
            }
        }
        if (index == -1){
            System.out.println("No matches");  // не сме намерили най-голямото нечетно число
        } else{
            System.out.println(index);
        }

    }

    private static void findMaxEven(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = -1; //като отправна точка да не се счупи масива,не можем да имаме индекс -1
        for (int i = 0; i<array.length; i++){
            if (array[i] %2==0 && max<=array[i]){
                max = array[i];
                index=i;
            }
        }
        if (index == -1){
            System.out.println("No matches");  // не сме намерили най-голямото четно число
        } else{
            System.out.println(index);
        }

    }

    private static void findMinOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1; //като отправна точка да не се счупи масива,не можем да имаме индекс -1
        for (int i = 0; i<array.length; i++){
            if (array[i] %2!=0 && min>=array[i]){
                min = array[i];
                index=i;
            }
        }
        if (index == -1){
            System.out.println("No matches");  // не сме намерили най-малкото нечетно число
        } else{
            System.out.println(index);
        }
    }

    private static void findMinEven(int[] array) {
        int min = Integer.MAX_VALUE;
        int index = -1; //като отправна точка да не се счупи масива,не можем да имаме индекс -1
        for (int i = 0; i<array.length; i++){
            if (array[i] %2==0 && min>=array[i]){
                min = array[i];
                index=i;
            }
        }
        if (index == -1){
            System.out.println("No matches");  // не сме намерили най-малкото четно число
        } else{
            System.out.println(index);
        }
    }

    private static void exchange(int[] array, int index) {
        int [] temp = copyArray(array); //копираме масива във временен такъв, за да можем да разменим стойностите
        int count = 0; //брои индексите
        for (int i = index+1; i<temp.length;i++){
            array[count] = temp[i]; // в масива на нулева позиция (count = 0) постави в другия масив, това което е на i позиция
            count++;
        }
        for (int i = 0; i<=index; i++){
            array[count] = temp[i];
            count++;
        }

    }

    private static int[] copyArray(int[] arr) {
        int [] newArray = new int [arr.length];
        for (int i = 0; i<arr.length; i++){
            newArray[i] = arr[i];
        }
        return newArray;
    }


}

