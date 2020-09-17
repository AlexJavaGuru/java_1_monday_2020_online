package student_pjotrs_grezmanis.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

 class Task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array lenght: ");
        int size = scanner.nextInt();
        int randomNumber [] = new int[size];

        Random random = new Random();
        System.out.println("Random numbers:");

        for (int p = 0; p < size; p++){
            int number = random.nextInt(1000);
            randomNumber[p] = number;
            System.out.println(randomNumber[p]);



        }
    }


    }

