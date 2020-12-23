package bg.softuni.fundamentals;

import java.util.Scanner;

public class ArraysLadyBug {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeField = Integer.parseInt(scanner.nextLine()); //n
        int [] field = new int [sizeField];

        String [] bugIndexes = scanner.nextLine().split(" ");

        for (int i = 0; i<bugIndexes.length; i++){
            int bugIndex = Integer.parseInt(bugIndexes[i]);
            if (bugIndex>=0 && bugIndex<field.length){
                field[bugIndex]=1; //единицата ни казва, че в дадената част от полето има калинка
            }
        }
        String line = scanner.nextLine();
        while (!line.equals("end")){
            String[] commands = line.split(" ");
            int bugIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int length = Integer.parseInt(commands[2]);

            if (bugIndex<0 ||bugIndex>=field.length || field[bugIndex]!=1){
            line=scanner.nextLine();
            continue;
            }
            field[bugIndex] = 0;
            if (direction.equals("right")){
                bugIndex+=length;

                while (bugIndex<field.length && field[bugIndex] == 1){
                    bugIndex+=length;
                }
                if (bugIndex<field.length){
                    field[bugIndex] = 1;
                }

            }else{
                bugIndex-=length;
                while (bugIndex>=0 && field[bugIndex] ==1){
                    bugIndex-=length;
                }
                if (bugIndex>=0){
                    field[bugIndex]=1;
                }
            }


            line = scanner.nextLine();
        }
        for (int i = 0; i<field.length;i++){
            System.out.print(field[i] + " ");
        }

        }
    }

